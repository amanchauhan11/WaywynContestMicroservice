package com.example.WaywynContestMicroservice.service;

import com.example.WaywynContestMicroservice.model.ContestQuestionDTO;
import com.example.WaywynContestMicroservice.model.ContestDefinitionDTO;
import com.example.WaywynContestMicroservice.model.FetchContestByIdDTO;
import com.example.WaywynContestMicroservice.model.QuestionDTO;

import java.util.Date;
import java.util.List;

public interface ContestService {

    FetchContestByIdDTO getContestById(int contestId, int userId);

    List<ContestDefinitionDTO> getAllContests();

    String createContest(ContestDefinitionDTO contestDefinitionTable);

    String addQuestion(int contestId, int questionId, Date startTimeOfQuestion, Date endTimeOfQuestion);

    String deleteQuestion(int  contestId,int questionId);

    QuestionDTO getQuestionById(int questionId);

    List<QuestionDTO> getQuestionsOfContest(int contestId);

    List<ContestDefinitionDTO> getContestsByAdminName(String createdBy);
}
