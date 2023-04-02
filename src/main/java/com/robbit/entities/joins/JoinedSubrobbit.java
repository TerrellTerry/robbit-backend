package com.robbit.entities.joins;

import jakarta.persistence.*;

@Entity
@Table(name = "joined_subrobbit")
public class JoinedSubrobbit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "subrobbit_id")
    private int subrobbitId;

    public JoinedSubrobbit() {
    }

    public JoinedSubrobbit(int id, int userId, int subrobbitId) {
        this.id = id;
        this.userId = userId;
        this.subrobbitId = subrobbitId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getSubrobbitId() {
        return subrobbitId;
    }

    public void setSubrobbitId(int subrobbitId) {
        this.subrobbitId = subrobbitId;
    }

    @Override
    public String toString() {
        return "JoinedSubrobbit{" +
                "id=" + id +
                ", userId=" + userId +
                ", subrobbitId=" + subrobbitId +
                '}';
    }
}
