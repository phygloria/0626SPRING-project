package com.ohgiraffers.spring_project.mj.mj_model.mj_entity;


import jakarta.persistence.*;

@Entity
@Table(name = "coder")
public class CodeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Column
    private String title;

    @Column
    private String imageUrl;

    @Column
    private String original;

    @Column
    private String original_Link;

    @Column
    private String description;

    @Column
    private String description1;
    @Column
    private String description2;
    @Column
    private String description3;
    @Column
    private String description4;
    @Column
    private String description5;
    @Column
    private String description6;
    @Column
    private String description7;
    @Column
    private String description8;
    @Column
    private String description9;
    @Column
    private String description10;
    @Column
    private String description11;
    @Column
    private String description12;
    @Column
    private String description13;
    @Column
    private String description14;
    @Column
    private String description15;

    @Column
    private String accordionTitle;

    @Column
    private String detail;

    public CodeEntity() {
    }

    public CodeEntity(Integer id, String title, String imageUrl, String original, String original_Link, String description, String description1, String description2, String description3, String description4, String description5, String description6, String description7, String description8, String description9, String description10, String description11, String description12, String description13, String description14, String description15, String accordionTitle, String detail) {
        this.id = id;
        this.title = title;
        this.imageUrl = imageUrl;
        this.original = original;
        this.original_Link = original_Link;
        this.description = description;
        this.description1 = description1;
        this.description2 = description2;
        this.description3 = description3;
        this.description4 = description4;
        this.description5 = description5;
        this.description6 = description6;
        this.description7 = description7;
        this.description8 = description8;
        this.description9 = description9;
        this.description10 = description10;
        this.description11 = description11;
        this.description12 = description12;
        this.description13 = description13;
        this.description14 = description14;
        this.description15 = description15;
        this.accordionTitle = accordionTitle;
        this.detail = detail;
    }

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

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getOriginal() {
        return original;
    }

    public void setOriginal(String original) {
        this.original = original;
    }

    public String getOriginal_Link() {
        return original_Link;
    }

    public void setOriginal_Link(String original_Link) {
        this.original_Link = original_Link;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription1() {
        return description1;
    }

    public void setDescription1(String description1) {
        this.description1 = description1;
    }

    public String getDescription2() {
        return description2;
    }

    public void setDescription2(String description2) {
        this.description2 = description2;
    }

    public String getDescription3() {
        return description3;
    }

    public void setDescription3(String description3) {
        this.description3 = description3;
    }

    public String getDescription4() {
        return description4;
    }

    public void setDescription4(String description4) {
        this.description4 = description4;
    }

    public String getDescription5() {
        return description5;
    }

    public void setDescription5(String description5) {
        this.description5 = description5;
    }

    public String getDescription6() {
        return description6;
    }

    public void setDescription6(String description6) {
        this.description6 = description6;
    }

    public String getDescription7() {
        return description7;
    }

    public void setDescription7(String description7) {
        this.description7 = description7;
    }

    public String getDescription8() {
        return description8;
    }

    public void setDescription8(String description8) {
        this.description8 = description8;
    }

    public String getDescription9() {
        return description9;
    }

    public void setDescription9(String description9) {
        this.description9 = description9;
    }

    public String getDescription10() {
        return description10;
    }

    public void setDescription10(String description10) {
        this.description10 = description10;
    }

    public String getDescription11() {
        return description11;
    }

    public void setDescription11(String description11) {
        this.description11 = description11;
    }

    public String getDescription12() {
        return description12;
    }

    public void setDescription12(String description12) {
        this.description12 = description12;
    }

    public String getDescription13() {
        return description13;
    }

    public void setDescription13(String description13) {
        this.description13 = description13;
    }

    public String getDescription14() {
        return description14;
    }

    public void setDescription14(String description14) {
        this.description14 = description14;
    }

    public String getDescription15() {
        return description15;
    }

    public void setDescription15(String description15) {
        this.description15 = description15;
    }

    public String getAccordionTitle() {
        return accordionTitle;
    }

    public void setAccordionTitle(String accordionTitle) {
        this.accordionTitle = accordionTitle;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "CodeEntity{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", original='" + original + '\'' +
                ", original_Link='" + original_Link + '\'' +
                ", description='" + description + '\'' +
                ", description1='" + description1 + '\'' +
                ", description2='" + description2 + '\'' +
                ", description3='" + description3 + '\'' +
                ", description4='" + description4 + '\'' +
                ", description5='" + description5 + '\'' +
                ", description6='" + description6 + '\'' +
                ", description7='" + description7 + '\'' +
                ", description8='" + description8 + '\'' +
                ", description9='" + description9 + '\'' +
                ", description10='" + description10 + '\'' +
                ", description11='" + description11 + '\'' +
                ", description12='" + description12 + '\'' +
                ", description13='" + description13 + '\'' +
                ", description14='" + description14 + '\'' +
                ", description15='" + description15 + '\'' +
                ", accordionTitle='" + accordionTitle + '\'' +
                ", detail='" + detail + '\'' +
                '}';
    }
}
