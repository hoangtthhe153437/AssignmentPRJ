/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Admin
 */
public class Article {
    private int articleId;
    private String title;
    private String description;
    private String imageLink;
    private int creatorId;

    public Article() {
    }

    public Article(int articleId, String title, String description, String imageLink, int creatorId) {
        this.articleId = articleId;
        this.title = title;
        this.description = description;
        this.imageLink = imageLink;
        this.creatorId = creatorId;
    }

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public int getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(int creatorId) {
        this.creatorId = creatorId;
    }

    @Override
    public String toString() {
        return "Article{" + "articleId=" + articleId + ", title=" + title + ", description=" + description + ", imageLink=" + imageLink + ", creatorId=" + creatorId + '}';
    }
    
    
}
