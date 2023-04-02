package com.robbit.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "reply")
public class Reply {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "creator_username")
    private String creatorUsername;

    @Column(name = "post_id")
    private int postId;

    @Column(name = "reply_branch_id")
    private int replyBranchId;

    @Column(name = "creation_date")
    private long creationDate;

    @Column(name = "contents")
    private String contents;

    @Column(name = "votes")
    private long votes;

    public Reply() {
    }

    public Reply(int id, String creatorUsername, int postId, int replyBranchId, long creationDate, String contents, long votes) {
        this.id = id;
        this.creatorUsername = creatorUsername;
        this.postId = postId;
        this.replyBranchId = replyBranchId;
        this.creationDate = creationDate;
        this.contents = contents;
        this.votes = votes;
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

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getReplyBranchId() {
        return replyBranchId;
    }

    public void setReplyBranchId(int replyBranchId) {
        this.replyBranchId = replyBranchId;
    }

    public long getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(long creationDate) {
        this.creationDate = creationDate;
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

    @Override
    public String toString() {
        return "Reply{" +
                "id=" + id +
                ", creatorUsername='" + creatorUsername + '\'' +
                ", postId=" + postId +
                ", replyBranchId=" + replyBranchId +
                ", creationDate=" + creationDate +
                ", contents='" + contents + '\'' +
                ", votes=" + votes +
                '}';
    }
}
