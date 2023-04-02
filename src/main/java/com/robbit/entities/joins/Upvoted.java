package com.robbit.entities.joins;

import jakarta.persistence.*;

@Entity
@Table(name = "upvoted")
public class Upvoted {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "post_id")
    private int postId;

    @Column(name = "reply_id")
    private int replyId;

    @Column(name = "upvoted")
    private boolean upvoted;

    public Upvoted() {
    }

    public Upvoted(int id, int userId, int postId, int replyId, boolean upvoted) {
        this.id = id;
        this.userId = userId;
        this.postId = postId;
        this.replyId = replyId;
        this.upvoted = upvoted;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public void setReplyId(int replyId) {
        this.replyId = replyId;
    }

    public void setUpvoted(boolean upvoted) {
        this.upvoted = upvoted;
    }

    @Override
    public String toString() {
        return "upvoted{" +
                "id=" + id +
                ", userId=" + userId +
                ", postId=" + postId +
                ", replyId=" + replyId +
                ", upvoted=" + upvoted +
                '}';
    }
}
