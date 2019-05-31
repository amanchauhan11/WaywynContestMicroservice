package com.example.WaywynContestMicroservice.controller;

import com.example.WaywynContestMicroservice.Repository.QuestionRepository;
import com.example.WaywynContestMicroservice.entity.QuestionEntity;
import com.example.WaywynContestMicroservice.model.ContestDefinitionDTO;
import com.example.WaywynContestMicroservice.model.FetchContestByIdDTO;
import com.example.WaywynContestMicroservice.model.QuestionDTO;
import com.example.WaywynContestMicroservice.model.SuccessFailureResponseDTO;
import com.example.WaywynContestMicroservice.service.ContestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/contest")
public class ContestController {


    @Autowired
    private ContestService contestService;


    @GetMapping("/contestOfUser")
    public FetchContestByIdDTO getContestById(Integer contestId, Integer userId) {
        return contestService.getContestById(contestId, userId);
    }

    @GetMapping("/all")
    public List<ContestDefinitionDTO> getAllContests() {
        return contestService.getAllContests();
    }

    @PostMapping("/add")
    public ContestDefinitionDTO createContest(@RequestBody ContestDefinitionDTO contestDefinitionDTO) throws ParseException {

        return contestService.createContest(contestDefinitionDTO);
    }


    @PostMapping("/addContestQuestion")
    public QuestionDTO addQuestion(int contestId, int questionId, Date startTimeOfQuestion, Date endTimeOfQuestion) {
        return contestService.addQuestion(contestId, questionId, startTimeOfQuestion, endTimeOfQuestion);
    }

    @DeleteMapping("/postcontest/dynamic/deletequestion")
    public String deleteQuestion(int contestId, int questionId) {
        return contestService.deleteQuestion(contestId, questionId);
    }

    @GetMapping("/fetchquestionbyid")
    public QuestionDTO getQuestionById(@RequestParam Integer questionId) {
        return contestService.getQuestionById(questionId);
    }

    @GetMapping("/getQuestionOfContest")
    public List<QuestionDTO> getQuestionsOfContest(Integer contestId) {
        return contestService.getQuestionsOfContest(contestId);
    }

    @GetMapping("/byusername")
    public List<ContestDefinitionDTO> getContestsByAdminName(String createdBy) {
        return contestService.getContestsByAdminName(createdBy);
    }

    @PostMapping("/postQuestion")
    public QuestionEntity postQuestions(@RequestBody QuestionEntity questionEntity) {
        return contestService.postQuestion(questionEntity);
    }
}
