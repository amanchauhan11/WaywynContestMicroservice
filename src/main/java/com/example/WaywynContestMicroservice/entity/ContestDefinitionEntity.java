package com.example.WaywynContestMicroservice.entity;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ContestDefinition")
public class ContestDefinitionEntity {
    @Id
    Integer contestId;
    @Column(unique = true)
    String contestName;

    String createdBy;
    Date createdOnDate;
    Integer skipsAllowed;
    String contestType;
    Date startTimeOfContest;
    Date endTimeOfContest;
    Integer totalQuestionsInContest;
    Integer categoryId;

    public Integer getContestId() {
        return contestId;
    }

    public void setContestId(Integer contestId) {
        this.contestId = contestId;
    }

    public String getContestName() {
        return contestName;
    }

    public void setContestName(String contestName) {
        this.contestName = contestName;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedOnDate() {
        return createdOnDate;
    }

    public void setCreatedOnDate(Date createdOnDate) {
        this.createdOnDate = createdOnDate;
    }

    public Integer getSkipsAllowed() {
        return skipsAllowed;
    }

    public void setSkipsAllowed(Integer skipsAllowed) {
        this.skipsAllowed = skipsAllowed;
    }

    public String getContestType() {
        return contestType;
    }

    public void setContestType(String contestType) {
        this.contestType = contestType;
    }

    public Date getStartTimeOfContest() {
        return startTimeOfContest;
    }

    public void setStartTimeOfContest(Date startTimeOfContest) {
        this.startTimeOfContest = startTimeOfContest;
    }

    public Date getEndTimeOfContest() {
        return endTimeOfContest;
    }

    public void setEndTimeOfContest(Date endTimeOfContest) {
        this.endTimeOfContest = endTimeOfContest;
    }

    public Integer getTotalQuestionsInContest() {
        return totalQuestionsInContest;
    }

    public void setTotalQuestionsInContest(Integer totalQuestionsInContest) {
        this.totalQuestionsInContest = totalQuestionsInContest;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }
}
