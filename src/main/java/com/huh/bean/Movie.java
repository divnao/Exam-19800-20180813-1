package com.huh.bean;

public class Movie {

    private int filmId;
    private String title;
    private String description;
    private int language;

    public Movie() {
    }

    public int getFilmId() {
        return filmId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getLanguage() {
        return language;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLanguage(int language) {
        this.language = language;
    }
}
