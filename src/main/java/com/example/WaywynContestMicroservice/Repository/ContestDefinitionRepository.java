package com.example.WaywynContestMicroservice.Repository;

import com.example.WaywynContestMicroservice.entity.CategoriesTableEntity;
import com.example.WaywynContestMicroservice.entity.ContestDefinitionEntity;
import com.example.WaywynContestMicroservice.model.ContestDefinitionDTO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContestDefinitionRepository extends CrudRepository<ContestDefinitionEntity, Integer>{


    List<ContestDefinitionEntity> findByCreatedBy(String createdBy);
    ContestDefinitionDTO findByContestId(Integer contestId);

}
