package com.someapp.model;

import java.sql.Timestamp;
import java.util.Objects;

public class Vote {


    private long id;
    private Timestamp date;
    private VoteType voteType;
    private long userId;
    private long discoveryId;

    public Vote() {
    }

    public Vote(long id, Timestamp date, VoteType voteType, long userId, long discoveryId) {
        this.id = id;
        this.date = date;
        this.voteType = voteType;
        this.userId = userId;
        this.discoveryId = discoveryId;
    }


    @Override
    public String toString() {
        return "Vote{" +
                "id=" + id +
                ", date=" + date +
                ", voteType=" + voteType +
                ", userId=" + userId +
                ", discoveryId=" + discoveryId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vote vote = (Vote) o;
        return id == vote.id &&
                userId == vote.userId &&
                discoveryId == vote.discoveryId &&
                Objects.equals(date, vote.date) &&
                voteType == vote.voteType;
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, date, voteType, userId, discoveryId);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public VoteType getVoteType() {
        return voteType;
    }

    public void setVoteType(VoteType voteType) {
        this.voteType = voteType;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getDiscoveryId() {
        return discoveryId;
    }

    public void setDiscoveryId(long discoveryId) {
        this.discoveryId = discoveryId;
    }
}


