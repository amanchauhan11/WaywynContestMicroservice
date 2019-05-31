package com.example.WaywynContestMicroservice.Repository;

import com.example.WaywynContestMicroservice.entity.ContestQuestionEntity;
import com.example.WaywynContestMicroservice.entity.QuestionEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ContestQuestionRepository extends CrudRepository<ContestQuestionEntity,Integer>{
    @Query(
            value = "SELECT question_id FROM contestquestion u  WHERE u.contest_id = :contentId",
            nativeQuery = true)
    List<Integer> findAllByContestId(@Param("contentId") Integer contentId);
}
