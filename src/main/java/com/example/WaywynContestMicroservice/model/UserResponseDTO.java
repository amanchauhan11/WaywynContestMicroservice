package com.example.WaywynContestMicroservice.model;

import java.util.Objects;

public class UserResponseDTO {

    String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserResponseDTO that = (UserResponseDTO) o;
        return Objects.equals(userName, that.userName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(userName);
    }

    @Override
    public String toString() {
        return "UserResponseDTO{" +
                "userName='" + userName + '\'' +
                '}';
    }
}
