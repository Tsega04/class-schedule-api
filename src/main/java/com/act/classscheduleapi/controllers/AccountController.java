package com.act.classscheduleapi.controllers;

import com.act.classscheduleapi.domains.Account;
import com.act.classscheduleapi.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@RequestMapping
@RestController
@Component
public class AccountController  {
    @Autowired private AccountService accountService;
    @PostMapping("/api/accounts")
    public Account Registeraccount(@RequestBody Account account) {
      return accountService.registerAccount(account);
    }

}