package com.ohgiraffers.spring_project.hy.model.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "PHY")
public class Hy_MovieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    //    블로그타이틀
    @Column
    private String title;

    //    포스터
    @Column
    private String imageUrl;

    //    명대사
    @Column
    private String bestMent;


    //    영화정보
    @Column
    private String director;
    @Column
    private String produce;
    @Column
    private String actor;
    @Column
    private String genre;
    @Column
    private String releaseDate;

    //    시놉시스
    @Column
    private String storyTitle;
    @Column
    private String storyText;

    //    리뷰
    @Column
    private String reviewTitle;
    @Column
    private String reviewDetail;

    public Hy_MovieEntity() {

    }

    public Hy_MovieEntity(Long id, String title, String imageUrl, String bestMent, String director, String produce, String actor, String genre, String releaseDate, String storyTitle, String storyText, String reviewTitle, String reviewDetail) {
        this.id = id;
        this.title = title;
        this.imageUrl = imageUrl;
        this.bestMent = bestMent;
        this.director = director;
        this.produce = produce;
        this.actor = actor;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.storyTitle = storyTitle;
        this.storyText = storyText;
        this.reviewTitle = reviewTitle;
        this.reviewDetail = reviewDetail;
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

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getBestMent() {
        return bestMent;
    }

    public void setBestMent(String bestMent) {
        this.bestMent = bestMent;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getProduce() {
        return produce;
    }

    public void setProduce(String produce) {
        this.produce = produce;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getStoryTitle() {
        return storyTitle;
    }

    public void setStoryTitle(String storyTitle) {
        this.storyTitle = storyTitle;
    }

    public String getStoryText() {
        return storyText;
    }

    public void setStoryText(String storyText) {
        this.storyText = storyText;
    }

    public String getReviewTitle() {
        return reviewTitle;
    }

    public void setReviewTitle(String reviewTitle) {
        this.reviewTitle = reviewTitle;
    }

    public String getReviewDetail() {
        return reviewDetail;
    }

    public void setReviewDetail(String reviewDetail) {
        this.reviewDetail = reviewDetail;
    }

    @Override
    public String toString() {
        return "hy_MovieEntity{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", bestMent='" + bestMent + '\'' +
                ", director='" + director + '\'' +
                ", produce='" + produce + '\'' +
                ", actor='" + actor + '\'' +
                ", genre='" + genre + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", storyTitle='" + storyTitle + '\'' +
                ", storyText='" + storyText + '\'' +
                ", reviewTitle='" + reviewTitle + '\'' +
                ", reviewDetail='" + reviewDetail + '\'' +
                '}';
    }
}
