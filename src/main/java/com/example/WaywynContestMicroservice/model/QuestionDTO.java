package com.example.WaywynContestMicroservice.model;

import java.util.Objects;

public class QuestionDTO {

    private Integer questionId;

    private String questionText;

    private String difficultyLevel;

    private String categoryOfQuestion;

    private String answerType;

    private String questionType;

    private String binaryFilePath;

    private String optionA;

    private String optionB;

    private String optionC;

    private String answer;

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

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "QuestionDTO{" +
                "questionId=" + questionId +
                ", questionText='" + questionText + '\'' +
                ", difficultyLevel='" + difficultyLevel + '\'' +
                ", categoryOfQuestion='" + categoryOfQuestion + '\'' +
                ", answerType='" + answerType + '\'' +
                ", questionType='" + questionType + '\'' +
                ", binaryFilePath='" + binaryFilePath + '\'' +
                ", optionA='" + optionA + '\'' +
                ", optionB='" + optionB + '\'' +
                ", optionC='" + optionC + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }
}

