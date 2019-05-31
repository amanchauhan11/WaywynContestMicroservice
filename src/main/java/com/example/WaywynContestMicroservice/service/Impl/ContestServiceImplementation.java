package com.example.WaywynContestMicroservice.service.Impl;

import com.example.WaywynContestMicroservice.Repository.ContestDefinitionRepository;
import com.example.WaywynContestMicroservice.entity.ContestDefinitionEntity;
import com.example.WaywynContestMicroservice.model.ContestDefinitionDTO;
import com.example.WaywynContestMicroservice.model.FetchContestByIdDTO;
import com.example.WaywynContestMicroservice.model.QuestionDTO;
import com.example.WaywynContestMicroservice.model.SuccessFailureResponseDTO;
import com.example.WaywynContestMicroservice.service.ContestService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
//@Transactional(readOnly = true,propagation = Propagation.REQUIRES_NEW)
public class ContestServiceImplementation implements ContestService {

    @Autowired
    ContestDefinitionRepository contestRepository;

    @Override
    public FetchContestByIdDTO getContestById(int contestId, int userId) {
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
    public SuccessFailureResponseDTO addQuestion(int contestId, int questionId, Date startTimeOfQuestion, Date endTimeOfQuestion) {


        return null;
    }

    @Override
    public String deleteQuestion(int contestId, int questionId) {
        return null;
    }

    @Override
    public QuestionDTO getQuestionById(int questionId) {
        return null;
    }

    @Override
    public List<QuestionDTO> getQuestionsOfContest(int contestId) {
        return null;
    }

    @Override
    public List<ContestDefinitionDTO> getContestsByAdminName(String createdBy) {
        return null;
    }



}
