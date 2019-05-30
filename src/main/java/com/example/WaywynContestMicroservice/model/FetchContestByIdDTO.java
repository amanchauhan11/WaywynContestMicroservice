package com.example.WaywynContestMicroservice.model;

import java.util.Objects;

public class FetchContestByIdDTO {

    ContestDefinitionDTO contestDefinitionDTO;
    QuestionWithOnlyOptionsDTO questionDTO;
    UserResponseDTO userResponseDTO;

    public ContestDefinitionDTO getContestDefinitionDTO() {
        return contestDefinitionDTO;
    }

    public void setContestDefinitionDTO(ContestDefinitionDTO contestDefinitionDTO) {
        this.contestDefinitionDTO = contestDefinitionDTO;
    }

    public QuestionWithOnlyOptionsDTO getQuestionDTO() {
        return questionDTO;
    }

    public void setQuestionDTO(QuestionWithOnlyOptionsDTO questionDTO) {
        this.questionDTO = questionDTO;
    }

    public UserResponseDTO getUserResponseDTO() {
        return userResponseDTO;
    }

    public void setUserResponseDTO(UserResponseDTO userResponseDTO) {
        this.userResponseDTO = userResponseDTO;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FetchContestByIdDTO that = (FetchContestByIdDTO) o;
        return Objects.equals(contestDefinitionDTO, that.contestDefinitionDTO) &&
                Objects.equals(questionDTO, that.questionDTO) &&
                Objects.equals(userResponseDTO, that.userResponseDTO);
    }

    @Override
    public int hashCode() {

        return Objects.hash(contestDefinitionDTO, questionDTO, userResponseDTO);
    }

    @Override
    public String toString() {
        return "FetchContestByIdDTO{" +
                "contestDefinitionDTO=" + contestDefinitionDTO +
                ", questionDTO=" + questionDTO +
                ", userResponseDTO=" + userResponseDTO +
                '}';
    }
}
