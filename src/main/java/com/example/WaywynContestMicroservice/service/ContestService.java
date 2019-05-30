package com.example.WaywynContestMicroservice.service;

import com.example.WaywynContestMicroservice.model.ContestDefinitionTable;
import com.example.WaywynContestMicroservice.model.ContestQuestionDTO;
import com.example.WaywynContestMicroservice.model.ContestQuestionTable;
import com.example.WaywynContestMicroservice.model.QuestionTable;

import java.util.List;

public interface ContestService {

    ContestQuestionDTO fetchContestById(Integer contestId,Integer userId);
    ContestDefinitionTable fetchAllContests();
    String postAContest(ContestDefinitionTable contestDefinitionTable, List<Integer> questionId);
    String updateAContestByAdding(ContestQuestionTable contestQuestionTable);
    String updateACOntestByDeleting(ContestQuestionTable contestQuestionTable);
    QuestionTable fetchQuestionById(Integer questionId);
    String postADynamicContest(ContestDefinitionTable contestDefinitionTable);
    ContestDefinitionTable getContestByAdmin(String createdBy);
}
