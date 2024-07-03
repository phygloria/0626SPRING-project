package com.ohgiraffers.spring_project.sy.dto;

import com.ohgiraffers.spring_project.sy.model.entity.MovieEntity;
import lombok.Builder;


public class MovieDTO {
    private Long id;
    private String title;
    private String subtitle;
    private String image_url;
    private String genre;
    private String country;
    private String duration;
    private String releaseDate;
    private String rating;
    private String audience;
    private String description;


    public MovieDTO() {
    }

    public MovieDTO(Long id, String title, String subtitle, String image_url, String genre, String country, String duration, String releaseDate, String rating, String audience, String description) {
        this.id = id;
        this.title = title;
        this.subtitle = subtitle;
        this.image_url = image_url;
        this.genre = genre;
        this.country = country;
        this.duration = duration;
        this.releaseDate = releaseDate;
        this.rating = rating;
        this.audience = audience;
        this.description = description;
    }

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

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getAudience() {
        return audience;
    }

    public void setAudience(String audience) {
        this.audience = audience;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "MovieDTO{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", subtitle='" + subtitle + '\'' +
                ", image_url='" + image_url + '\'' +
                ", genre='" + genre + '\'' +
                ", country='" + country + '\'' +
                ", duration='" + duration + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", rating='" + rating + '\'' +
                ", audience='" + audience + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
