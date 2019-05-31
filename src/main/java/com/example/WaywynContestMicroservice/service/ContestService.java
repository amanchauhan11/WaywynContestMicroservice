package com.example.WaywynContestMicroservice.service;

import com.example.WaywynContestMicroservice.model.*;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

public interface ContestService {

    FetchContestByIdDTO getContestById(int contestId, int userId);

    List<ContestDefinitionDTO> getAllContests();

    ContestDefinitionDTO createContest(ContestDefinitionDTO contestDefinitionTable) throws ParseException;

    SuccessFailureResponseDTO addQuestion(int contestId, int questionId, Date startTimeOfQuestion, Date endTimeOfQuestion);

    String deleteQuestion(int  contestId,int questionId);

    QuestionDTO getQuestionById(int questionId);

    List<QuestionDTO> getQuestionsOfContest(int contestId);

    List<ContestDefinitionDTO> getContestsByAdminName(String createdBy);
}
