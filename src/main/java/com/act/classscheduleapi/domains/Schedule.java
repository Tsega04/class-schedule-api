package com.act.classscheduleapi.domains;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

 @Entity(name="schedule")
 @Data
 @Transactional
  @NoArgsConstructor
  public class Schedule {
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
   @Size(max = 16, min = 4)
   @Column(nullable = false)
   @NotEmpty(message = "Name cannot be blank")
   private String Name;

   @Column(nullable = false)
   @NotEmpty(message = "course cannot be blank")
   private String course;

   @Column(nullable = false)
   @NotEmpty(message = "Classroom cannot be blank")
   private String Classroom;

  @Column(nullable = false)
  private LocalDate Date;

  @Column(nullable = false)
  @NotEmpty(message = "DayOfWeek cannot be blank")
  private String DayOfWeek;
  @Column(nullable = false)
  private String StartTime;

  @Column(nullable = false)
  private  String EndTime;


   @OneToOne
   @JoinColumn(name = "account_id")
    private Account account;

}
