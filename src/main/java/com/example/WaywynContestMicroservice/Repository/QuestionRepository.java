package com.example.WaywynContestMicroservice.Repository;

import com.example.WaywynContestMicroservice.entity.QuestionEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface QuestionRepository extends CrudRepository<QuestionEntity,Integer> {


}
