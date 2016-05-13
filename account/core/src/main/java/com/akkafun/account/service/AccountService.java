package com.akkafun.account.service;

import org.springframework.stereotype.Service;

/**
 * Created by liubin on 2016/4/26.
 */
@Service
public class AccountService {

    public boolean checkEnoughBalance(Long userId, Long balance) {
        return true;
    }
}
