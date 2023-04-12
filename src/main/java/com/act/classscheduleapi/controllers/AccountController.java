package com.act.classscheduleapi.controllers;

import com.act.classscheduleapi.domains.Account;
import com.act.classscheduleapi.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping
@RestController
public class AccountController {
    @Autowired private AccountService accountService;
    @PostMapping("/api/account")
    public Account Registeraccount(@RequestBody Account account) {
        return accountService.Registeraccount(account);
    }
}