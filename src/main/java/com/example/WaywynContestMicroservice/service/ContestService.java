package com.example.WaywynContestMicroservice.service;

import com.example.WaywynContestMicroservice.entity.ContestQuestionEntity;
import com.example.WaywynContestMicroservice.entity.QuestionEntity;
import com.example.WaywynContestMicroservice.model.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

public interface ContestService {

    FetchContestByIdDTO getContestById(Integer contestId, Integer userId); //abhay

    List<ContestDefinitionDTO> getAllContests(); //completed

    ContestDefinitionDTO createContest(ContestDefinitionDTO contestDefinitionTable) throws ParseException; //completed

    ContestQuestionEntity addQuestionInContest(ContestQuestionEntity contestQuestionEntity); //completed

    String deleteQuestion(Integer questionId); //completed

    QuestionDTO getQuestionById(Integer questionId); //completed

    List<QuestionDTO> getQuestionsOfContest(Integer contestId); //completed

    List<ContestDefinitionDTO> getContestsByAdminName(String createdBy); //completed

    QuestionEntity postQuestion(QuestionEntity questionEntity); //completed
}
