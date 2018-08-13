package com.huh.dao.impl;

import com.huh.bean.Movie;
import com.huh.dao.MovieDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MovieDaoImpl implements MovieDao {

    public ResultSet get(Connection conn) throws SQLException {
        PreparedStatement ps = conn.prepareStatement("select film_id, title, description, name from film, language where film.language_id = language.language_id");
        return ps.executeQuery();
    }

    public void add(Connection conn, Movie movie) throws SQLException {
        PreparedStatement ps = conn.prepareStatement("insert into film(title, description, language_id) values( ?, ?, ?)");
        ps.setString(1, movie.getTitle());
        ps.setString(2, movie.getDescription());
        ps.setInt(3, movie.getLanguage());
        ps.execute();
    }

    public void update(Connection conn, Movie movie) throws SQLException {
        PreparedStatement ps = conn.prepareStatement("update film set title = ?, description=?, language_id=?");
        ps.setString(1, movie.getTitle());
        ps.setString(2, movie.getDescription());
        ps.setInt(3, movie.getLanguage());
        ps.execute();
    }

    public void delete(Connection conn, Movie movie) throws SQLException {
        PreparedStatement ps = conn.prepareStatement("delete from film where film_id=?");
        ps.setInt(1, movie.getFilmId());
        ps.execute();
    }
}
