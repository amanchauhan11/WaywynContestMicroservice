package com.example.WaywynContestMicroservice.model;

public class SuccessFailureResponseDTO {

    private Boolean success;
    private String message;
    private Object DTO;

    public SuccessFailureResponseDTO() {
    }

    public SuccessFailureResponseDTO(Boolean success, String message, Object object) {
        this.DTO = object;
        this.success = success;
        this.message = message;
    }
}
