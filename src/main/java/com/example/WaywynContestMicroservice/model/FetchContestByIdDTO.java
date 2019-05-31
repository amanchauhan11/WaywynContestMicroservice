package com.example.WaywynContestMicroservice.model;


import java.util.List;

public class FetchContestByIdDTO {

    ContestDefinitionDTO contestDefinitionDTO;

    List<QuestionDTO> questionDTOList;

    UserResponseDTO userResponseDTO;

    public ContestDefinitionDTO getContestDefinitionDTO() {
        return contestDefinitionDTO;
    }

    public void setContestDefinitionDTO(ContestDefinitionDTO contestDefinitionDTO) {
        this.contestDefinitionDTO = contestDefinitionDTO;
    }

    public List<QuestionDTO> getQuestionDTOList() {
        return questionDTOList;
    }

    public void setQuestionDTOList(List<QuestionDTO> questionDTOList) {
        this.questionDTOList = questionDTOList;
    }

    public UserResponseDTO getUserResponseDTO() {
        return userResponseDTO;
    }

    public void setUserResponseDTO(UserResponseDTO userResponseDTO) {
        this.userResponseDTO = userResponseDTO;
    }

    @Override
    public String toString() {
        return "FetchContestByIdDTO{" +
                "contestDefinitionDTO=" + contestDefinitionDTO +
                ", questionDTOList=" + questionDTOList +
                ", userResponseDTO=" + userResponseDTO +
                '}';
    }
}
