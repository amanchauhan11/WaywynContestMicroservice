package com.example.WaywynContestMicroservice.controller;

import com.example.WaywynContestMicroservice.Repository.CategoriesTableRepository;
import com.example.WaywynContestMicroservice.Repository.ContestDefinitionRepository;
import com.example.WaywynContestMicroservice.Repository.QuestionRepository;
import com.example.WaywynContestMicroservice.entity.CategoriesTableEntity;
import com.example.WaywynContestMicroservice.entity.ContestQuestionEntity;
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

    @Autowired
    private CategoriesTableRepository categoriesTableRepository;

    @Autowired
    private ContestDefinitionRepository contestDefinitionRepository;


    @GetMapping("/contestOfUser")
    public FetchContestByIdDTO getContestById(Integer contestId, Integer userId) {
        return contestService.getContestById(contestId, userId);
    }

    @GetMapping("/getall")
    public List<ContestDefinitionDTO> getAllContests() {
        return contestService.getAllContests();
    }

    @PostMapping("/addContest")
    public ContestDefinitionDTO createContest(@RequestBody ContestDefinitionDTO contestDefinitionDTO) throws ParseException {

        return contestService.createContest(contestDefinitionDTO);
    }


    @PostMapping("/addContestQuestion")
    public ContestQuestionEntity addQuestion(@RequestBody ContestQuestionEntity contestQuestionEntity) {
        return contestService.addQuestionInContest(contestQuestionEntity);
    }

    @DeleteMapping("/postcontest/dynamic/deletequestion")
    public String deleteQuestion(Integer questionId) {
        return contestService.deleteQuestion(questionId);
    }

    @GetMapping("/fetchquestionbyid")
    public QuestionDTO getQuestionById(@RequestParam Integer questionId) {
        return contestService.getQuestionById(questionId);
    }

    @GetMapping("/getQuestionOfContest")
    public List<QuestionDTO> getQuestionsOfContest(Integer contestId) {
        return contestService.getQuestionsOfContest(contestId);
    }

    @GetMapping("/contestByCreater")
    public List<ContestDefinitionDTO> getContestsByAdminName(String createdBy) {
        return contestService.getContestsByAdminName(createdBy);
    }

    @PostMapping("/postQuestion")
    public QuestionEntity postQuestions(@RequestBody QuestionEntity questionEntity) {
        return contestService.postQuestion(questionEntity);
    }


    @PostMapping("/addCategory")
    public CategoriesTableEntity addCategory(@RequestBody  CategoriesTableEntity categoriesTableEntity){
        return categoriesTableRepository.save(categoriesTableEntity);
    }

    @GetMapping("/getContestDefinition")
    public ContestDefinitionDTO getContestDefinition(@RequestParam Integer contestId){
        return contestDefinitionRepository.findByContestId(contestId);
    }

}
