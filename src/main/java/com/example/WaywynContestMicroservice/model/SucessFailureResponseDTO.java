package com.example.WaywynContestMicroservice.model;

public class SucessFailureResponseDTO {

    Boolean success;
    String message;

    public SucessFailureResponseDTO() {
    }

    public SucessFailureResponseDTO(Boolean success, String message) {
        this.success = success;
        this.message = message;
    }
}
