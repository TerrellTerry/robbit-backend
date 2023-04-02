package com.robbit.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "app_user")
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "creation_date")
    private long creationDate;

    @Column(name = "votes")
    private long votes;

    @Column(name = "pfp_address")
    private String pfpAddress;

    @Column(name = "description")
    private String description;

    public AppUser() {
    }

    public AppUser(int id, String username, String password, String email, long creationDate, long votes, String pfpAddress, String description) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.creationDate = creationDate;
        this.votes = votes;
        this.pfpAddress = pfpAddress;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(long creationDate) {
        this.creationDate = creationDate;
    }

    public long getVotes() {
        return votes;
    }

    public void setVotes(long votes) {
        this.votes = votes;
    }

    public String getPfpAddress() {
        return pfpAddress;
    }

    public void setPfpAddress(String pfpAddress) {
        this.pfpAddress = pfpAddress;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "AppUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", creationDate=" + creationDate +
                ", votes=" + votes +
                ", pfpAddress='" + pfpAddress + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
