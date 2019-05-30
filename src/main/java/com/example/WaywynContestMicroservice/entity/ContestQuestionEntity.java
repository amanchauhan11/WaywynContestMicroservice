package com.example.WaywynContestMicroservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "ContestQuestion")
public class ContestQuestionEntity {
    @Id
    Integer contestQuestionId;
    Integer questionId;
    Integer contestId;
    Boolean screenFlag;
    Date startTimeOfQuestion;
    Date endTimeOfQuestion;

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
}
