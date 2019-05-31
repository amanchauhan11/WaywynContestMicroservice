package com.example.WaywynContestMicroservice.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "contestquestion")
public class ContestQuestionEntity {
    @Id
    @GeneratedValue
    private Integer contestQuestionId;


    private Integer questionId;

    private Integer contestId;

    @NotNull
    @Column(columnDefinition = "bit default 0")
    private Boolean screenFlag;

    private Date startTimeOfQuestion;

    private Date endTimeOfQuestion;

    public ContestQuestionEntity(){

    }

    public Integer getContestQuestionId() {
        return contestQuestionId;
    }

    public void setContestQuestionId(Integer contestQuestionId) {
        this.contestQuestionId = contestQuestionId;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public Integer getContestId() {
        return contestId;
    }

    public void setContestId(Integer contestId) {
        this.contestId = contestId;
    }

    public Boolean getScreenFlag() {
        return screenFlag;
    }

    public void setScreenFlag(Boolean screenFlag) {
        this.screenFlag = screenFlag;
    }

    public Date getStartTimeOfQuestion() {
        return startTimeOfQuestion;
    }

    public void setStartTimeOfQuestion(Date startTimeOfQuestion) {
        this.startTimeOfQuestion = startTimeOfQuestion;
    }

    public Date getEndTimeOfQuestion() {
        return endTimeOfQuestion;
    }

    public void setEndTimeOfQuestion(Date endTimeOfQuestion) {
        this.endTimeOfQuestion = endTimeOfQuestion;
    }

    @Override
    public String toString() {
        return "ContestQuestionEntity{" +
                "contestQuestionId=" + contestQuestionId +
                ", questionId=" + questionId +
                ", contestId=" + contestId +
                ", screenFlag=" + screenFlag +
                ", startTimeOfQuestion=" + startTimeOfQuestion +
                ", endTimeOfQuestion=" + endTimeOfQuestion +
                '}';
    }
}
