package com.example.WaywynContestMicroservice.service.Impl;

import com.example.WaywynContestMicroservice.Repository.ContestDefinitionRepository;
import com.example.WaywynContestMicroservice.Repository.QuestionRepository;
import com.example.WaywynContestMicroservice.entity.ContestDefinitionEntity;
import com.example.WaywynContestMicroservice.entity.QuestionEntity;
import com.example.WaywynContestMicroservice.model.ContestDefinitionDTO;
import com.example.WaywynContestMicroservice.model.FetchContestByIdDTO;
import com.example.WaywynContestMicroservice.model.QuestionDTO;
import com.example.WaywynContestMicroservice.model.SuccessFailureResponseDTO;
import com.example.WaywynContestMicroservice.service.ContestService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
//@Transactional(readOnly = true,propagation = Propagation.REQUIRES_NEW)
public class ContestServiceImplementation implements ContestService {

    @Autowired
    ContestDefinitionRepository contestRepository;

    @Autowired
    private QuestionRepository questionRepository;

    @Override
    public FetchContestByIdDTO getContestById(Integer contestId, Integer userId) {
        return null;
    }

    @Override
    public List<ContestDefinitionDTO> getAllContests() {
        return null;
    }

    @Override
    public ContestDefinitionDTO createContest(ContestDefinitionDTO contestDefinitionTable) throws ParseException {
        ContestDefinitionEntity contestDefinitionEntity = new ContestDefinitionEntity();
        BeanUtils.copyProperties(contestDefinitionTable,contestDefinitionEntity);
        ContestDefinitionDTO contestDefinitionDTO = new ContestDefinitionDTO();
        contestDefinitionEntity.setCreatedOnDate(new SimpleDateFormat("yyyy-MM-dd").parse("2018-09-18"));
        ContestDefinitionEntity contestDefinitionEntity1 = contestRepository.save(contestDefinitionEntity);
        BeanUtils.copyProperties(contestDefinitionEntity1,contestDefinitionDTO);

        return contestDefinitionDTO;
    }

    @Override
    public QuestionDTO addQuestion( Integer contestId, Integer questionId, Date startTimeOfQuestion, Date endTimeOfQuestion) {
        String url =  "ip:port/question/getQuestion?quesId="+questionId;

        RestTemplate restTemplate = new RestTemplate();



        return null;
    }

    @Override
    public String deleteQuestion(Integer contestId, Integer questionId) {
        return null;
    }

    @Override
    public QuestionDTO getQuestionById(Integer questionId) {

        QuestionEntity questionEntity = questionRepository.findOne(questionId);
        QuestionDTO questionDTO = new QuestionDTO();
        questionDTO.setAnswerType(questionEntity.getAnswerType());
        questionDTO.setBinaryFilePath(questionEntity.getBinaryFilePath());
        questionDTO.setCategoryOfQuestion(questionEntity.getCategoryOfQuestion());
        questionDTO.setDifficultyLevel(questionEntity.getDifficultyLevel());
        questionDTO.setOptionA(questionEntity.getOptionA());
        questionDTO.setOptionB(questionEntity.getOptionB());
        questionDTO.setOptionC(questionEntity.getOptionC());
        questionDTO.setQuestionText(questionEntity.getQuestionText());
        questionDTO.setQuestionType(questionEntity.getQuestionType());
        questionDTO.setQuestionId(questionEntity.getQuestionId());
        return questionDTO;
    }

    @Override
    public List<QuestionDTO> getQuestionsOfContest(Integer contestId) {
        return null;
    }

    @Override
    public List<ContestDefinitionDTO> getContestsByAdminName(String createdBy) {
        return null;
    }

    @Override
    public QuestionEntity postQuestion(QuestionEntity questionEntity) {
        return questionRepository.save(questionEntity);
    }


}
