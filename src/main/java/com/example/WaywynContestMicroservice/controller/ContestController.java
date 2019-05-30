package com.example.WaywynContestMicroservice.controller;

import com.example.WaywynContestMicroservice.service.ContestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContestController {
    @Autowired
    ContestService contestService;



}
