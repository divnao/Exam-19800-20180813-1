package com.huh.service;

import com.huh.dao.MovieDao;
import com.huh.dao.impl.MovieDaoImpl;
import com.huh.jdbc.ConnectionFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieListService {

    private MovieDao movieDao = new MovieDaoImpl();

    private static final Connection conn = ConnectionFactory.getInstance().getConnection();

    public List<Map<String, String>> getMovieList() {

        List<Map<String, String>> movieList = new ArrayList<Map<String, String>>();
        try {
            ResultSet rs = movieDao.get(conn);
            while (rs.next()) {
                Map<String, String> movie = new HashMap<String, String>();
                movie.put("file_id", String.valueOf(rs.getInt(1)));
                movie.put("title", rs.getString(2));
                movie.put("description", rs.getString(3));
                movie.put("language", String.valueOf(rs.getString(4)));
                movieList.add(movie);
            }
            return movieList;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return movieList;
    }

}
