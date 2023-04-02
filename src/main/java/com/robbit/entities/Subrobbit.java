package com.robbit.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "subrobbit")
public class Subrobbit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "creator_username")
    private String creatorUsername;

    @Column(name = "creation_date")
    private long creationDate;

    @Column(name = "subrobbit_name")
    private String subrobbitName;

    @Column(name = "description")
    private String description;

    @Column(name = "rules")
    private String rules;

    @Column(name = "member_amount")
    private long memberAmount;

    public Subrobbit() {
    }

    public Subrobbit(int id, String creatorUsername, long creationDate, String subrobbitName, String description, String rules, long memberAmount) {
        this.id = id;
        this.creatorUsername = creatorUsername;
        this.creationDate = creationDate;
        this.subrobbitName = subrobbitName;
        this.description = description;
        this.rules = rules;
        this.memberAmount = memberAmount;
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

    public long getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(long creationDate) {
        this.creationDate = creationDate;
    }

    public String getSubrobbitName() {
        return subrobbitName;
    }

    public void setSubrobbitName(String subrobbitName) {
        this.subrobbitName = subrobbitName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    public long getMemberAmount() {
        return memberAmount;
    }

    public void setMemberAmount(long memberAmount) {
        this.memberAmount = memberAmount;
    }

    @Override
    public String toString() {
        return "Subrobbit{" +
                "id=" + id +
                ", creatorUsername='" + creatorUsername + '\'' +
                ", creationDate=" + creationDate +
                ", subrobbitName='" + subrobbitName + '\'' +
                ", description='" + description + '\'' +
                ", rules='" + rules + '\'' +
                ", memberAmount=" + memberAmount +
                '}';
    }
}
