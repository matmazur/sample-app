package com.someapp.model;

import java.sql.Timestamp;
import java.util.Objects;

public class Discovery {

    private long id;
    private String name;
    private String url;
    private String description;
    private Timestamp date;
    private int upVote;
    private int downVote;
    private User user;



    public Discovery(){}
    public Discovery(long id, String name, String url, String description, Timestamp date, int upVote, int downVote, User user) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.description = description;
        this.date = date;
        this.upVote = upVote;
        this.downVote = downVote;
        this.user = user;
    }


    @Override
    public String toString() {
        return "Discovery{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", description='" + description + '\'' +
                ", date=" + date +
                ", upVote=" + upVote +
                ", downVote=" + downVote +
                ", user=" + user +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Discovery discovery = (Discovery) o;
        return id == discovery.id &&
                upVote == discovery.upVote &&
                downVote == discovery.downVote &&
                Objects.equals(name, discovery.name) &&
                Objects.equals(url, discovery.url) &&
                Objects.equals(description, discovery.description) &&
                Objects.equals(date, discovery.date) &&
                Objects.equals(user, discovery.user);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, url, description, date, upVote, downVote, user);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public int getUpVote() {
        return upVote;
    }

    public void setUpVote(int upVote) {
        this.upVote = upVote;
    }

    public int getDownVote() {
        return downVote;
    }

    public void setDownVote(int downVote) {
        this.downVote = downVote;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
