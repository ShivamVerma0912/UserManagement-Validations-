package com.geekster.UserManagement.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @NotNull
    private String userId;
    @NotBlank
    private String userName;
    @JsonFormat(pattern = "yyyy-mm-dd")
    private LocalDate dateOfBirth;
    @Pattern(regexp = "[A-Za-z]+[0-9]+@[A-Za-z]+\\.[A-Za-z]+")
    private String email;
    @Size(max = 12, min = 10)
    private String phoneNumber;
    @JsonFormat(pattern = "yyyy-mm-dd")
    private String date;
    private LocalTime time = LocalTime.now();


}
