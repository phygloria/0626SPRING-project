package com.ohgiraffers.spring_project.dy.dy_model.dy_entity;


import jakarta.persistence.*;


@Entity
@Table(name = "kdy")


public class DayoungEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column
    private Long id;

    @Column(nullable = false)
    private String title;

    @Lob
    @Column(name = "main_img", nullable = false)
    private String mainImg;

    @Lob
    @Column(name = "main_ment", columnDefinition = "LONGTEXT")
    private String mainMent;

    @Lob
    @Column(name = "start_ment", columnDefinition = "LONGTEXT")
    private String startMent;

    @Column(name = "info_btn")
    private String infoBtn;

    @Column(name = "infos")
    private String infos;

    @Column(name = "genre")
    private String genre;

    @Column(name = "actors")
    private String actors;

    @Column(name = "company")
    private String company;

    @Column(name = "date")
    private String date;

    @Column(name = "time")
    private String time;

    @Column(name = "actor_btn")
    private String actorBtn;

    @Column(name = "actor_name1")
    private String actorName1;

    @Column(name = "actor_name2")
    private String actorName2;

    @Column(name = "actor_name3")
    private String actorName3;

    @Column(name = "actor_ment1")
    private String actorMent1;

    @Column(name = "actor_ment2")
    private String actorMent2;

    @Column(name = "actor_ment3")
    private String actorMent3;

    @Lob
    @Column(name = "mid_image1")
    private String midImage1;

    @Lob
    @Column(name = "mid_image2")
    private String midImage2;

    @Column(name = "story_btn")
    private String storyBtn;

    @Lob
    @Column(name = "story_text", columnDefinition = "LONGTEXT")
    private String storyText;

    @Column(name = "end_btn")
    private String endBtn;

    @Column(name = "end_story")
    private String endStory;

    @Lob
    @Column(name = "end_image1")
    private String endImage1;

    @Lob
    @Column(name = "end_image2")
    private String endImage2;

    @Lob
    @Column(name = "best_ment", columnDefinition = "LONGTEXT")
    private String bestMent;

    @Column(name = "review_btn")
    private String reviewBtn;

    @Column(name = "first_review")
    private String firstReview;

    @Lob
    @Column(name = "review_story1", columnDefinition = "LONGTEXT")
    private String reviewStory1;

    @Lob
    @Column(name = "review_story2", columnDefinition = "LONGTEXT")
    private String reviewStory2;

    public DayoungEntity() {
    }

    public DayoungEntity(Long id, String title, String mainImg, String mainMent, String startMent, String infoBtn, String infos, String genre, String actors, String company, String date, String time, String actorBtn, String actorName1, String actorName2, String actorName3, String actorMent1, String actorMent2, String actorMent3, String midImage1, String midImage2, String storyBtn, String storyText, String endBtn, String endStory, String endImage1, String endImage2, String bestMent, String reviewBtn, String firstReview, String reviewStory1, String reviewStory2) {
        this.id = id;
        this.title = title;
        this.mainImg = mainImg;
        this.mainMent = mainMent;
        this.startMent = startMent;
        this.infoBtn = infoBtn;
        this.infos = infos;
        this.genre = genre;
        this.actors = actors;
        this.company = company;
        this.date = date;
        this.time = time;
        this.actorBtn = actorBtn;
        this.actorName1 = actorName1;
        this.actorName2 = actorName2;
        this.actorName3 = actorName3;
        this.actorMent1 = actorMent1;
        this.actorMent2 = actorMent2;
        this.actorMent3 = actorMent3;
        this.midImage1 = midImage1;
        this.midImage2 = midImage2;
        this.storyBtn = storyBtn;
        this.storyText = storyText;
        this.endBtn = endBtn;
        this.endStory = endStory;
        this.endImage1 = endImage1;
        this.endImage2 = endImage2;
        this.bestMent = bestMent;
        this.reviewBtn = reviewBtn;
        this.firstReview = firstReview;
        this.reviewStory1 = reviewStory1;
        this.reviewStory2 = reviewStory2;
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

    public String getMainImg() {
        return mainImg;
    }

    public void setMainImg(String mainImg) {
        this.mainImg = mainImg;
    }

    public String getMainMent() {
        return mainMent;
    }

    public void setMainMent(String mainMent) {
        this.mainMent = mainMent;
    }

    public String getStartMent() {
        return startMent;
    }

    public void setStartMent(String startMent) {
        this.startMent = startMent;
    }

    public String getInfoBtn() {
        return infoBtn;
    }

    public void setInfoBtn(String infoBtn) {
        this.infoBtn = infoBtn;
    }

    public String getInfos() {
        return infos;
    }

    public void setInfos(String infos) {
        this.infos = infos;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getActorBtn() {
        return actorBtn;
    }

    public void setActorBtn(String actorBtn) {
        this.actorBtn = actorBtn;
    }

    public String getActorName1() {
        return actorName1;
    }

    public void setActorName1(String actorName1) {
        this.actorName1 = actorName1;
    }

    public String getActorName2() {
        return actorName2;
    }

    public void setActorName2(String actorName2) {
        this.actorName2 = actorName2;
    }

    public String getActorName3() {
        return actorName3;
    }

    public void setActorName3(String actorName3) {
        this.actorName3 = actorName3;
    }

    public String getActorMent1() {
        return actorMent1;
    }

    public void setActorMent1(String actorMent1) {
        this.actorMent1 = actorMent1;
    }

    public String getActorMent2() {
        return actorMent2;
    }

    public void setActorMent2(String actorMent2) {
        this.actorMent2 = actorMent2;
    }

    public String getActorMent3() {
        return actorMent3;
    }

    public void setActorMent3(String actorMent3) {
        this.actorMent3 = actorMent3;
    }

    public String getMidImage1() {
        return midImage1;
    }

    public void setMidImage1(String midImage1) {
        this.midImage1 = midImage1;
    }

    public String getMidImage2() {
        return midImage2;
    }

    public void setMidImage2(String midImage2) {
        this.midImage2 = midImage2;
    }

    public String getStoryBtn() {
        return storyBtn;
    }

    public void setStoryBtn(String storyBtn) {
        this.storyBtn = storyBtn;
    }

    public String getStoryText() {
        return storyText;
    }

    public void setStoryText(String storyText) {
        this.storyText = storyText;
    }

    public String getEndBtn() {
        return endBtn;
    }

    public void setEndBtn(String endBtn) {
        this.endBtn = endBtn;
    }

    public String getEndStory() {
        return endStory;
    }

    public void setEndStory(String endStory) {
        this.endStory = endStory;
    }

    public String getEndImage1() {
        return endImage1;
    }

    public void setEndImage1(String endImage1) {
        this.endImage1 = endImage1;
    }

    public String getEndImage2() {
        return endImage2;
    }

    public void setEndImage2(String endImage2) {
        this.endImage2 = endImage2;
    }

    public String getBestMent() {
        return bestMent;
    }

    public void setBestMent(String bestMent) {
        this.bestMent = bestMent;
    }

    public String getReviewBtn() {
        return reviewBtn;
    }

    public void setReviewBtn(String reviewBtn) {
        this.reviewBtn = reviewBtn;
    }

    public String getFirstReview() {
        return firstReview;
    }

    public void setFirstReview(String firstReview) {
        this.firstReview = firstReview;
    }

    public String getReviewStory1() {
        return reviewStory1;
    }

    public void setReviewStory1(String reviewStory1) {
        this.reviewStory1 = reviewStory1;
    }

    public String getReviewStory2() {
        return reviewStory2;
    }

    public void setReviewStory2(String reviewStory2) {
        this.reviewStory2 = reviewStory2;
    }

    @Override
    public String toString() {
        return "DayoungEntity{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", mainImg='" + mainImg + '\'' +
                ", mainMent='" + mainMent + '\'' +
                ", startMent='" + startMent + '\'' +
                ", infoBtn='" + infoBtn + '\'' +
                ", infos='" + infos + '\'' +
                ", genre='" + genre + '\'' +
                ", actors='" + actors + '\'' +
                ", company='" + company + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", actorBtn='" + actorBtn + '\'' +
                ", actorName1='" + actorName1 + '\'' +
                ", actorName2='" + actorName2 + '\'' +
                ", actorName3='" + actorName3 + '\'' +
                ", actorMent1='" + actorMent1 + '\'' +
                ", actorMent2='" + actorMent2 + '\'' +
                ", actorMent3='" + actorMent3 + '\'' +
                ", midImage1='" + midImage1 + '\'' +
                ", midImage2='" + midImage2 + '\'' +
                ", storyBtn='" + storyBtn + '\'' +
                ", storyText='" + storyText + '\'' +
                ", endBtn='" + endBtn + '\'' +
                ", endStory='" + endStory + '\'' +
                ", endImage1='" + endImage1 + '\'' +
                ", endImage2='" + endImage2 + '\'' +
                ", bestMent='" + bestMent + '\'' +
                ", reviewBtn='" + reviewBtn + '\'' +
                ", firstReview='" + firstReview + '\'' +
                ", reviewStory1='" + reviewStory1 + '\'' +
                ", reviewStory2='" + reviewStory2 + '\'' +
                '}';
    }
}


