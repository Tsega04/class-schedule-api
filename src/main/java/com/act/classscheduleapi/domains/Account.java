package com.act.classscheduleapi.domains;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity(name="account")
@Data
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Size(max = 16, min = 4)
    @Column(nullable = false)
    @NotBlank(message = "First name can not be empty")
    private String FirstName;

    @Size(max = 16, min = 4)
    @Column(nullable = false)
    @NotBlank(message = "Last name can not be empty")
    private String LastName;

    @Column(nullable = false,unique = true)
    @NotBlank(message = "phone number can not be empty")
    private String PhoneNumber;

    @Column(nullable = false,unique = true)
    @NotBlank(message = "Email can not be empty")
    private String Email;

    @Column(nullable = false,unique = true)
    @NotBlank(message = "Department can not be empty")
    private String Department;
    @Size(max = 8, min = 4)
    @Column(nullable = false)
    @NotBlank(message = "Pin can not be empty")
    private Integer Pin;



}
