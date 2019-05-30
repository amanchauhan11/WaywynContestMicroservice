//contestQuestionId 	: Primary Key
//        questionId 		:Unique question id (Foreign Key)
//        contestId		: Unique id for each contest (Foreign Key)
//        screenFlag 		: question to be again screened if the flag is true
//        startTimeOfQuestion	: start time of the question
//        endTimeOfQuestion	: end time of the question

package com.example.WaywynContestMicroservice.model;

import java.util.Date;
import java.util.Objects;

public class ContestQuestionDTO {

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContestQuestionDTO that = (ContestQuestionDTO) o;
        return Objects.equals(contestQuestionId, that.contestQuestionId) &&
                Objects.equals(questionId, that.questionId) &&
                Objects.equals(contestId, that.contestId) &&
                Objects.equals(screenFlag, that.screenFlag) &&
                Objects.equals(startTimeOfQuestion, that.startTimeOfQuestion) &&
                Objects.equals(endTimeOfQuestion, that.endTimeOfQuestion);
    }

    @Override
    public int hashCode() {

        return Objects.hash(contestQuestionId, questionId, contestId, screenFlag, startTimeOfQuestion, endTimeOfQuestion);
    }


    @Override
    public String toString() {
        return "ContestQuestionDTO{" +
                "contestQuestionId=" + contestQuestionId +
                ", questionId=" + questionId +
                ", contestId=" + contestId +
                ", screenFlag=" + screenFlag +
                ", startTimeOfQuestion=" + startTimeOfQuestion +
                ", endTimeOfQuestion=" + endTimeOfQuestion +
                '}';
    }
}

