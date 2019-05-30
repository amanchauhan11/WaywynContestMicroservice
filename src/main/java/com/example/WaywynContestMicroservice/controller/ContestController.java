package com.example.WaywynContestMicroservice.controller;

import com.example.WaywynContestMicroservice.model.ContestDefinitionTable;
import com.example.WaywynContestMicroservice.service.ContestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.PublicKey;
import java.util.List;

@RestController
public class ContestController {
    @Autowired
    ContestService contestService;



}
