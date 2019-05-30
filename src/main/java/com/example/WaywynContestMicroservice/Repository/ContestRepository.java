package com.example.WaywynContestMicroservice.Repository;

import com.example.WaywynContestMicroservice.entity.ContestDefinitionEntity;
import com.example.WaywynContestMicroservice.model.ContestDefinitionDTO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContestRepository extends CrudRepository<ContestDefinitionEntity, Integer> {
}
