package com.example.WaywynContestMicroservice.model;

import java.util.Date;
import java.util.Objects;

public class ContestDefinitionDTO {

    int contestId;

    String contestName;

    String createdBy;

    Date createdOnDate;

    int skipsAllowed;

    String contestType;

    Date startTimeOfContest;

    Date endTimeOfContest;

    int totalQuestionsInContest;

    int categoryId;


    public int getContestId() {
        return contestId;
    }

    public void setContestId(int contestId) {
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

    public int getSkipsAllowed() {
        return skipsAllowed;
    }

    public void setSkipsAllowed(int skipsAllowed) {
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

    public int getTotalQuestionsInContest() {
        return totalQuestionsInContest;
    }

    public void setTotalQuestionsInContest(int totalQuestionsInContest) {
        this.totalQuestionsInContest = totalQuestionsInContest;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContestDefinitionDTO that = (ContestDefinitionDTO) o;
        return Objects.equals(contestId, that.contestId) &&
                Objects.equals(contestName, that.contestName) &&
                Objects.equals(createdBy, that.createdBy) &&
                Objects.equals(createdOnDate, that.createdOnDate) &&
                Objects.equals(skipsAllowed, that.skipsAllowed) &&
                Objects.equals(contestType, that.contestType) &&
                Objects.equals(startTimeOfContest, that.startTimeOfContest) &&
                Objects.equals(endTimeOfContest, that.endTimeOfContest) &&
                Objects.equals(totalQuestionsInContest, that.totalQuestionsInContest) &&
                Objects.equals(categoryId, that.categoryId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(contestId, contestName, createdBy, createdOnDate, skipsAllowed, contestType, startTimeOfContest, endTimeOfContest, totalQuestionsInContest, categoryId);
    }

    @Override
    public String toString() {
        return "ContestDefinitionDTO{" +
                "contestId=" + contestId +
                ", contestName='" + contestName + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", createdOnDate=" + createdOnDate +
                ", skipsAllowed=" + skipsAllowed +
                ", contestType='" + contestType + '\'' +
                ", startTimeOfContest=" + startTimeOfContest +
                ", endTimeOfContest=" + endTimeOfContest +
                ", totalQuestionsInContest=" + totalQuestionsInContest +
                ", categoryId=" + categoryId +
                '}';
    }
}