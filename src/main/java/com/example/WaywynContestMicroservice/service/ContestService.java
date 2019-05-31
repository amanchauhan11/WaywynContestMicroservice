package com.example.WaywynContestMicroservice.service;

import com.example.WaywynContestMicroservice.entity.QuestionEntity;
import com.example.WaywynContestMicroservice.model.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

public interface ContestService {

    FetchContestByIdDTO getContestById(Integer contestId, Integer userId);

    List<ContestDefinitionDTO> getAllContests();

    ContestDefinitionDTO createContest(ContestDefinitionDTO contestDefinitionTable) throws ParseException;

    QuestionDTO addQuestion(Integer contestId, Integer questionId, Date startTimeOfQuestion, Date endTimeOfQuestion);

    String deleteQuestion(Integer contestId, Integer questionId);

    QuestionDTO getQuestionById(Integer questionId);

    List<QuestionDTO> getQuestionsOfContest(Integer contestId);

    List<ContestDefinitionDTO> getContestsByAdminName(String createdBy);

    QuestionEntity postQuestion(QuestionEntity questionEntity);
}
