package com.example.WaywynContestMicroservice.service;

import com.example.WaywynContestMicroservice.model.*;

import java.util.Date;
import java.util.List;

public interface ContestService {

    FetchContestByIdDTO getContestById(int contestId, int userId);

    List<ContestDefinitionDTO> getAllContests();

    SucessFailureResponseDTO createContest(ContestDefinitionDTO contestDefinitionTable);

    SucessFailureResponseDTO addQuestion(int contestId, int questionId, Date startTimeOfQuestion, Date endTimeOfQuestion);

    String deleteQuestion(int  contestId,int questionId);

    QuestionDTO getQuestionById(int questionId);

    List<QuestionDTO> getQuestionsOfContest(int contestId);

    List<ContestDefinitionDTO> getContestsByAdminName(String createdBy);
}
