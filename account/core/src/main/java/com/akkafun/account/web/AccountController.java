package com.akkafun.account.web;

import com.akkafun.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liubin on 2016/3/29.
 */
@RestController
public class AccountController {

    @Autowired
    AccountService accountService;

    @RequestMapping(value = "/accounts/enough", method = RequestMethod.GET)
    public String checkAccountBalanceEnough(@RequestParam("userId") Long userId,
                                                    @RequestParam("balance") Long balance) {
        boolean result = accountService.checkEnoughBalance(userId, balance);
        return String.valueOf(result);
    }


}
