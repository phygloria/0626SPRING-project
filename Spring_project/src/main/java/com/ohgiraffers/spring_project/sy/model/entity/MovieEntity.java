package com.ohgiraffers.spring_project.sy.model.entity;


import jakarta.persistence.*;
import lombok.Builder;

@Entity
@Table(name = "movie")
public class MovieEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String title;

    @Column
    private String subtitle;

    @Column
    private String image_url;

    @Column
    private String genre;

    @Column
    private String country;

    @Column
    private String duration;

    @Column
    private String releaseDate;

    @Column
    private String rating;

    @Column
    private String audience;

    @Column
    private String description;


    public MovieEntity() {
    }

    public MovieEntity(Long id, String title, String subtitle, String image_url, String genre, String country, String duration, String releaseDate, String rating, String audience, String description) {
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
        return "MovieEntity{" +
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
