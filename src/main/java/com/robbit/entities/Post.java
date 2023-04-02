package com.robbit.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "creator_username")
    private String creatorUsername;

    @Column(name = "subrobbit_name")
    private String subrobbitName;

    @Column(name = "creation_date")
    private long creationDate;

    @Column(name = "title")
    private String title;

    @Column(name = "contents")
    private String contents;

    @Column(name = "votes")
    private long votes;

    @Column(name = "comment_amount")
    private long commentAmount;

    public Post() {
    }

    public Post(int id, String creatorUsername, String subrobbitName, long creationDate, String title, String contents, long votes, long commentAmount) {
        this.id = id;
        this.creatorUsername = creatorUsername;
        this.subrobbitName = subrobbitName;
        this.creationDate = creationDate;
        this.title = title;
        this.contents = contents;
        this.votes = votes;
        this.commentAmount = commentAmount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCreatorUsername() {
        return creatorUsername;
    }

    public void setCreatorUsername(String creatorUsername) {
        this.creatorUsername = creatorUsername;
    }

    public String getSubrobbitName() {
        return subrobbitName;
    }

    public void setSubrobbitName(String subrobbitName) {
        this.subrobbitName = subrobbitName;
    }

    public long getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(long creationDate) {
        this.creationDate = creationDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public long getVotes() {
        return votes;
    }

    public void setVotes(long votes) {
        this.votes = votes;
    }

    public long getCommentAmount() {
        return commentAmount;
    }

    public void setCommentAmount(long commentAmount) {
        this.commentAmount = commentAmount;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", creatorUsername='" + creatorUsername + '\'' +
                ", subrobbitName='" + subrobbitName + '\'' +
                ", creationDate=" + creationDate +
                ", title='" + title + '\'' +
                ", contents='" + contents + '\'' +
                ", votes=" + votes +
                ", commentAmount=" + commentAmount +
                '}';
    }
}
