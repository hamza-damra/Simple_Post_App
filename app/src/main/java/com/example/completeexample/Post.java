package com.example.completeexample;

import java.io.Serializable;

public class Post implements Serializable {
    private String date;
    private String name;
    private String description;
    private int followers;
    private int following;
    private int posts;
    private int image;

    public Post(String date, String name, String description, int followers, int following, int posts) {
        this.date = date;
        this.name = name;
        this.description = description;
        this.followers = followers;
        this.following = following;
        this.posts = posts;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getFollowers() {
        return followers;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }

    public int getFollowing() {
        return following;
    }

    public void setFollowing(int following) {
        this.following = following;
    }

    public int getPosts() {
        return posts;
    }

    public void setPosts(int posts) {
        this.posts = posts;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

}
