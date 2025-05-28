package com.example.demo.model;

public class AlbumViewModel {
    private Long id;
    private String title;
    private String artist;
    private int year;

    public AlbumViewModel(Long id, String title, String artist, int year) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.year = year;
    }

    // getterとsetter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
