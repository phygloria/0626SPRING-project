package com.ohgiraffers.spring_project.jh.jh_dto;

public class JaeheeDTO {

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSub_title() {
        return sub_title;
    }

    public void setSub_title(String sub_title) {
        this.sub_title = sub_title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public String getRunning_time() {
        return running_time;
    }

    public void setRunning_time(String running_time) {
        this.running_time = running_time;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPeople() {
        return people;
    }

    public void setPeople(String people) {
        this.people = people;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAudience() {
        return audience;
    }

    public void setAudience(String audience) {
        this.audience = audience;
    }

    public String getAudience_like() {
        return audience_like;
    }

    public void setAudience_like(String audience_like) {
        this.audience_like = audience_like;
    }

    public String getNetizen_like() {
        return netizen_like;
    }

    public void setNetizen_like(String netizen_like) {
        this.netizen_like = netizen_like;
    }

    public String getNow_date() {
        return now_date;
    }

    public void setNow_date(String now_date) {
        this.now_date = now_date;
    }

    public String getYoutube_link() {
        return youtube_link;
    }

    public void setYoutube_link(String youtube_link) {
        this.youtube_link = youtube_link;
    }

    @Override
    public String toString() {
        return "JaeheeDTO{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", sub_title='" + sub_title + '\'' +
                ", image='" + image + '\'' +
                ", release_date='" + release_date + '\'' +
                ", running_time='" + running_time + '\'' +
                ", age='" + age + '\'' +
                ", people='" + people + '\'' +
                ", description='" + description + '\'' +
                ", audience='" + audience + '\'' +
                ", audience_like='" + audience_like + '\'' +
                ", netizen_like='" + netizen_like + '\'' +
                ", now_date='" + now_date + '\'' +
                ", youtube_link='" + youtube_link + '\'' +
                '}';
    }

    private Integer id;
    private String title;
    private String sub_title;
    private String image;
    private String release_date;
    private String running_time;
    private String age;
    private String people;
    private String description;
    private String audience;
    private String audience_like;
    private String netizen_like;
    private String now_date;
    private String youtube_link;

    public JaeheeDTO(Integer id, String title, String sub_title, String image, String release_date, String running_time, String age, String people, String description, String audience, String audience_like, String netizen_like, String now_date, String youtube_link) {
        this.id = id;
        this.title = title;
        this.sub_title = sub_title;
        this.image = image;
        this.release_date = release_date;
        this.running_time = running_time;
        this.age = age;
        this.people = people;
        this.description = description;
        this.audience = audience;
        this.audience_like = audience_like;
        this.netizen_like = netizen_like;
        this.now_date = now_date;
        this.youtube_link = youtube_link;
    }
}
