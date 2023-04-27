package com.act.classscheduleapi.services;

import com.act.classscheduleapi.Repository.ScheduleRepository;
import com.act.classscheduleapi.domains.Schedule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.ScheduledExecutorService;


@Service
public class ScheduleService {
    @Autowired  private ScheduleRepository scheduleRepository;
    public  Schedule createSchedule(Schedule schedule){
        return scheduleRepository.save(schedule);
    }


}
