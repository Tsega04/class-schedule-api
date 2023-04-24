package com.act.classscheduleapi.Repository;

import com.act.classscheduleapi.domains.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {}