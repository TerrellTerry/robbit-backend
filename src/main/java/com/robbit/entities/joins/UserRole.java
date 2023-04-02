package com.robbit.entities.joins;

import jakarta.persistence.*;


@Entity
@Table(name = "user_role")
public class UserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "subrobbit_id")
    private int subrobbitId;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "user_role")
    private String userRole;

    public UserRole() {
    }

    public UserRole(int id, int subrobbitId, int userId, String userRole) {
        this.id = id;
        this.subrobbitId = subrobbitId;
        this.userId = userId;
        this.userRole = userRole;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSubrobbitId() {
        return subrobbitId;
    }

    public void setSubrobbitId(int subrobbitId) {
        this.subrobbitId = subrobbitId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    @Override
    public String toString() {
        return "UserRole{" +
                "id=" + id +
                ", subrobbitId=" + subrobbitId +
                ", userId=" + userId +
                ", userRole='" + userRole + '\'' +
                '}';
    }
}
