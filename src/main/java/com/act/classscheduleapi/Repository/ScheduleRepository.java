package com.act.classscheduleapi.Repository;

import com.act.classscheduleapi.domains.Schedule;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;
//@NoRepositoryBean
@Repository
public interface ScheduleRepository extends CrudRepository<Schedule, Long> {}
