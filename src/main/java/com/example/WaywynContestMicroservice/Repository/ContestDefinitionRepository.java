package com.example.WaywynContestMicroservice.Repository;

import com.example.WaywynContestMicroservice.entity.CategoriesTableEntity;
import com.example.WaywynContestMicroservice.entity.ContestDefinitionEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContestDefinitionRepository extends CrudRepository<ContestDefinitionEntity, Integer>{

}
