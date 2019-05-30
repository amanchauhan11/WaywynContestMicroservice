package com.example.WaywynContestMicroservice.model;

import java.util.Objects;

public class QuestionTable {

    Integer questionId;
    String questionText;
    String difficultyLevel;
    String categoryOfQuestion;
    String answerType;
    String questionType;
    String binaryFilePath;


    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuestionTable that = (QuestionTable) o;
        return Objects.equals(questionId, that.questionId) &&
                Objects.equals(questionText, that.questionText) &&
                Objects.equals(difficultyLevel, that.difficultyLevel) &&
                Objects.equals(categoryOfQuestion, that.categoryOfQuestion) &&
                Objects.equals(answerType, that.answerType) &&
                Objects.equals(questionType, that.questionType) &&
                Objects.equals(binaryFilePath, that.binaryFilePath);
    }

    @Override
    public int hashCode() {

        return Objects.hash(questionId, questionText, difficultyLevel, categoryOfQuestion, answerType, questionType, binaryFilePath);
    }

    @Override
    public String toString() {
        return "QuestionTable{" +
                "questionId=" + questionId +
                ", questionText='" + questionText + '\'' +
                ", difficultyLevel='" + difficultyLevel + '\'' +
                ", categoryOfQuestion='" + categoryOfQuestion + '\'' +
                ", answerType='" + answerType + '\'' +
                ", questionType='" + questionType + '\'' +
                ", binaryFilePath='" + binaryFilePath + '\'' +
                '}';
    }
}

