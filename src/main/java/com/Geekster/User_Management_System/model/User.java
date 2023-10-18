package com.Geekster.User_Management_System.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {

    @Id
    private Integer userId;

    @NotBlank(message = "Username cannot be blank")
    private String userName;

    @Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}", message = "Date of Birth should be in the format yyyy-MM-dd")
    private String dateOfBirth;

    @Email(message = "Invalid email address")
    private String email;

    @Pattern(regexp = "\\d{12}", message = "Phone number should be 12 digits")
    private String phoneNumber;

    @NotNull
    private LocalDateTime dateTime;


}
