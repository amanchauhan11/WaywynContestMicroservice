package com.example.WaywynContestMicroservice.model;

import java.util.Date;
import java.util.Objects;

public class ContestQuestionDTO {

    int contestId;

    String contestName;

    String createdBy;

    Date createdOnDate;

   int  skipsAllowed;

    String contestType;

    Date startTimeOfContest;

    Date endTimeOfContest;

    int totalQuestionsInContest;

    int categoryId;

    String questionText;

    String difficultyLevel;

    String categoryOfQuestion;

    String answerType;

    String questionType;

    String binaryFilePath;

    String optionA;

    String optionB;

    String optionC;

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

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public String getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(String difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public String getCategoryOfQuestion() {
        return categoryOfQuestion;
    }

    public void setCategoryOfQuestion(String categoryOfQuestion) {
        this.categoryOfQuestion = categoryOfQuestion;
    }

    public String getAnswerType() {
        return answerType;
    }

    public void setAnswerType(String answerType) {
        this.answerType = answerType;
    }

    public String getQuestionType() {
        return questionType;
    }

    public void setQuestionType(String questionType) {
        this.questionType = questionType;
    }

    public String getBinaryFilePath() {
        return binaryFilePath;
    }

    public void setBinaryFilePath(String binaryFilePath) {
        this.binaryFilePath = binaryFilePath;
    }

    public String getOptionA() {
        return optionA;
    }

    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }

    public String getOptionC() {
        return optionC;
    }

    public void setOptionC(String optionC) {
        this.optionC = optionC;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContestQuestionDTO that = (ContestQuestionDTO) o;
        return Objects.equals(contestId, that.contestId) &&
                Objects.equals(contestName, that.contestName) &&
                Objects.equals(createdBy, that.createdBy) &&
                Objects.equals(createdOnDate, that.createdOnDate) &&
                Objects.equals(skipsAllowed, that.skipsAllowed) &&
                Objects.equals(contestType, that.contestType) &&
                Objects.equals(startTimeOfContest, that.startTimeOfContest) &&
                Objects.equals(endTimeOfContest, that.endTimeOfContest) &&
                Objects.equals(totalQuestionsInContest, that.totalQuestionsInContest) &&
                Objects.equals(categoryId, that.categoryId) &&
                Objects.equals(questionText, that.questionText) &&
                Objects.equals(difficultyLevel, that.difficultyLevel) &&
                Objects.equals(categoryOfQuestion, that.categoryOfQuestion) &&
                Objects.equals(answerType, that.answerType) &&
                Objects.equals(questionType, that.questionType) &&
                Objects.equals(binaryFilePath, that.binaryFilePath) &&
                Objects.equals(optionA, that.optionA) &&
                Objects.equals(optionB, that.optionB) &&
                Objects.equals(optionC, that.optionC);
    }

    @Override
    public int hashCode() {

        return Objects.hash(contestId, contestName, createdBy, createdOnDate, skipsAllowed, contestType, startTimeOfContest, endTimeOfContest, totalQuestionsInContest, categoryId, questionText, difficultyLevel, categoryOfQuestion, answerType, questionType, binaryFilePath, optionA, optionB, optionC);
    }

    @Override
    public String toString() {
        return "ContestQuestionDTO{" +
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
                ", questionText='" + questionText + '\'' +
                ", difficultyLevel='" + difficultyLevel + '\'' +
                ", categoryOfQuestion='" + categoryOfQuestion + '\'' +
                ", answerType='" + answerType + '\'' +
                ", questionType='" + questionType + '\'' +
                ", binaryFilePath='" + binaryFilePath + '\'' +
                ", optionA='" + optionA + '\'' +
                ", optionB='" + optionB + '\'' +
                ", optionC='" + optionC + '\'' +
                '}';
    }
}
