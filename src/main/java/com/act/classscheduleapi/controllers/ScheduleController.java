package com.act.classscheduleapi.controllers;

import com.act.classscheduleapi.domains.Schedule;
import com.act.classscheduleapi.services.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
@RequestMapping
@RestController
@Component
public class ScheduleController {

    @Autowired private ScheduleService scheduleService;
 //@GetMapping("/{id}")
 //public ResponseEntity<Schedule>getSecheduleByid(@PathVariable Long id){
   //  Schedule schedule = scheduleService.getscheduleById(id);
     //return ResponseEntity.ok(schedule);}
    @PostMapping("/api/schedules")
    public Schedule CreateSchedule(@RequestBody Schedule schedule){
       return  scheduleService.createSchedule(schedule);
    }
}


