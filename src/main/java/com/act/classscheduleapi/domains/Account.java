package com.act.classscheduleapi.domains;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.*;
import lombok.*;
import lombok.NoArgsConstructor;




@Entity(name=" account ")
@Data
@Transactional
@NoArgsConstructor
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(max = 16, min = 4)
    @Column(nullable = false)
    @NotBlank(message = "First name cannot be empty")
    private String firstName;

    @Size(max = 16, min = 4)
    @Column(nullable =false)
    @NotBlank(message = "Last name cannot be blank")
    private String lastName;

    @Column(nullable =false,unique = true)
    @NotBlank(message = "Phone number cannot be blank")
    private String phoneNumber;

    @Column(nullable = false, unique = true)
    @NotBlank(message = "Email cannot be empty")
    private String email;

    @Column(nullable = false, unique = true)
    @NotBlank(message = "department can not be blank")
    private String department;

    @Column(nullable = false)
    @NotNull(message = "pin must be set")
    private Integer pin;

    @OneToOne(mappedBy = "account", cascade = CascadeType.ALL)
    private Schedule schedule;


}
