package com.example.WaywynContestMicroservice.controller;

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
public class ContestController {


    @Autowired
    private ContestService contestService;

    @GetMapping("/contest/contestbyid")
    public FetchContestByIdDTO getContestById (int contestId,int userId ){
        return contestService.getContestById(contestId,userId);
    }
    @GetMapping("/contest/contests")
    public List<ContestDefinitionDTO> getAllContests(){
        return contestService.getAllContests();
    }

    @PostMapping("/contest/postcontest")
    public ContestDefinitionDTO createContest(@RequestBody  ContestDefinitionDTO contestDefinitionDTO) throws ParseException {

        return contestService.createContest(contestDefinitionDTO);
    }
    @PostMapping("/contest/postcontest/addquestion")
    public SuccessFailureResponseDTO addQuestion(int contestId, int questionId, Date startTimeOfQuestion, Date endTimeOfQuestion){
        return contestService.addQuestion(contestId,questionId,startTimeOfQuestion,endTimeOfQuestion);
    }

    @DeleteMapping("/contest/postcontest/dynamic/deletequestion")
    public String deleteQuestion(int contestId,int questionId){
        return contestService.deleteQuestion(contestId,questionId);
    }

    @GetMapping("/contest/fetchquestionbyid")
    public QuestionDTO getQuestionById(int questionId){
        return contestService.getQuestionById(questionId);
    }

    @GetMapping("/contest/contests/contestId/questions")
    public List<QuestionDTO> getQuestionsOfContest(int contestId){
        return contestService.getQuestionsOfContest(contestId);
    }

    @GetMapping("/contest/contests/byusername")
    public List<ContestDefinitionDTO> getContestsByAdminName(String createdBy){
        return contestService.getContestsByAdminName(createdBy);
    }
}
