package com.example.WaywynContestMicroservice.service.Impl;

import com.example.WaywynContestMicroservice.Repository.CategoriesTableRepository;
import com.example.WaywynContestMicroservice.Repository.ContestDefinitionRepository;
import com.example.WaywynContestMicroservice.Repository.ContestQuestionRepository;
import com.example.WaywynContestMicroservice.Repository.QuestionRepository;
import com.example.WaywynContestMicroservice.entity.CategoriesTableEntity;
import com.example.WaywynContestMicroservice.entity.ContestDefinitionEntity;
import com.example.WaywynContestMicroservice.entity.ContestQuestionEntity;
import com.example.WaywynContestMicroservice.entity.QuestionEntity;
import com.example.WaywynContestMicroservice.model.ContestDefinitionDTO;
import com.example.WaywynContestMicroservice.model.FetchContestByIdDTO;
import com.example.WaywynContestMicroservice.model.QuestionDTO;
import com.example.WaywynContestMicroservice.model.SuccessFailureResponseDTO;
import com.example.WaywynContestMicroservice.service.ContestService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
//@Transactional(readOnly = true,propagation = Propagation.REQUIRES_NEW)
public class ContestServiceImplementation implements ContestService {

    @Autowired
    private CategoriesTableRepository categoriesTableRepository;

    @Autowired
    private ContestDefinitionRepository contestRepository;

    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private ContestQuestionRepository contestQuestionRepository;

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
    public ContestQuestionEntity addQuestionInContest(ContestQuestionEntity contestQuestionEntity) {
        System.out.println(contestQuestionEntity.toString());
        ContestQuestionEntity contestQuestionEntity1= contestQuestionRepository.save(contestQuestionEntity);
        return  contestQuestionEntity1;
    }

    @Override
    public String deleteQuestion(Integer questionId) {
         questionRepository.delete(questionId);
         return "successfully deleted!!!!";

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
        List<Integer> questionEntityList = contestQuestionRepository.findAllByContestId(contestId);
        List<QuestionDTO> response = new ArrayList<>();
        for(int a:questionEntityList)
        {
            QuestionEntity questionEntity =  questionRepository.findOne(a);
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
            response.add(questionDTO);
        }
        return response;

    }

    @Override
    public List<ContestDefinitionDTO> getContestsByAdminName(String createdBy) {
        List<ContestDefinitionEntity> contestDefinitionEntityList = new ArrayList<>();
        contestDefinitionEntityList = contestRepository.findByCreatedBy(createdBy);
        //System.out.println(contestDefinitionEntityList.get(0).toString());
        List<ContestDefinitionDTO> contestDefinitionDTOList = new ArrayList<>();
        ContestDefinitionDTO d=new ContestDefinitionDTO();

        for(ContestDefinitionEntity e : contestDefinitionEntityList) {
            BeanUtils.copyProperties(e, d);
            contestDefinitionDTOList.add(d);
            //System.out.println(contestDefinitionDTOList);
        }
        return contestDefinitionDTOList;
    }

    @Override
    public QuestionEntity postQuestion(QuestionEntity questionEntity) {
        return questionRepository.save(questionEntity);
    }


}
