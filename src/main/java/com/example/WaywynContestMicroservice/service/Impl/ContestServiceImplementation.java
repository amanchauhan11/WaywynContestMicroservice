package com.example.WaywynContestMicroservice.service.Impl;

import com.example.WaywynContestMicroservice.Repository.ContestRepository;
import com.example.WaywynContestMicroservice.entity.ContestDefinitionEntity;
import com.example.WaywynContestMicroservice.model.ContestDefinitionDTO;
import com.example.WaywynContestMicroservice.model.FetchContestByIdDTO;
import com.example.WaywynContestMicroservice.model.QuestionDTO;
import com.example.WaywynContestMicroservice.model.SucessFailureResponseDTO;
import com.example.WaywynContestMicroservice.service.ContestService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
//@Transactional(readOnly = true,propagation = Propagation.REQUIRES_NEW)
public class ContestServiceImplementation implements ContestService {

    @Autowired
    ContestRepository contestRepository;

    @Override
    public FetchContestByIdDTO getContestById(int contestId, int userId) {
        return null;
    }

    @Override
    public List<ContestDefinitionDTO> getAllContests() {
        return null;
    }

    @Override
    public SucessFailureResponseDTO createContest(ContestDefinitionDTO contestDefinitionTable) {
        ContestDefinitionEntity contestDefinitionEntity = new ContestDefinitionEntity();
        BeanUtils.copyProperties(contestDefinitionTable,contestDefinitionEntity);
        try {
            contestRepository.save(contestDefinitionEntity);
        }catch (Exception e){
            return new SucessFailureResponseDTO(false,"Failed :" + e.getMessage());
        }

        return new SucessFailureResponseDTO(true,"contest created");
    }

    @Override
    public SucessFailureResponseDTO addQuestion(int contestId, int questionId, Date startTimeOfQuestion, Date endTimeOfQuestion) {


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
