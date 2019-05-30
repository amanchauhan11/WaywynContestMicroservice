package com.example.WaywynContestMicroservice.service;

import com.example.WaywynContestMicroservice.model.ContestDefinitionDTO;
import com.example.WaywynContestMicroservice.model.ContestQuestionDTO;
import com.example.WaywynContestMicroservice.model.QuestionDTO;

import java.util.List;

public interface ContestService {

    ContestQuestionDTO fetchContestById(Integer contestId,Integer userId);
    ContestDefinitionDTO fetchAllContests();
    ContestDefinitionDTO postAContest(ContestDefinitionDTO contestDefinitionDTO, List<Integer> questionId);
    String updateAContestByAdding(ContestQuestionDTO contestQuestionDTO);
    String updateACOntestByDeleting(ContestQuestionDTO contestQuestionDTO);
    QuestionDTO fetchQuestionById(Integer questionId);
    String postADynamicContest(ContestDefinitionDTO contestDefinitionDTO);
    ContestDefinitionDTO getContestByAdmin(String createdBy);
}
