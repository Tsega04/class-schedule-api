package com.act.classscheduleapi.services;

import com.act.classscheduleapi.Repository.AccountRepository;
import com.act.classscheduleapi.domains.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    @Autowired private AccountRepository accountRepository;
    public Account Registeraccount(Account account){
        return accountRepository.save(account);
    }
}
