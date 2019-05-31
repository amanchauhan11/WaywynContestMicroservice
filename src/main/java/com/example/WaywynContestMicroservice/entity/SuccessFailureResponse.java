package com.example.WaywynContestMicroservice.entity;

import javax.persistence.Entity;


public class SuccessFailureResponse {

    private Boolean success;
    private String message;
    private Object DTO;

    public SuccessFailureResponse(){

    }

    public SuccessFailureResponse(Boolean success, String message, Object object) {
        this.DTO = object;
        this.success = success;
        this.message = message;
    }

}
