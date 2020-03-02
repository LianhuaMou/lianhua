package com.start.service.accountService;

import com.start.dao.mapper.AccountMapper;
import com.start.pojo.AccountPo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceClient implements AccountService {

    private static final ThreadLocal<String> THREAD_LOCAL = new ThreadLocal<>();

    static {
        THREAD_LOCAL.set("123456789");
    }

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public AccountPo queryAccount(String userId) {
        return accountMapper.queryAccount(userId);
    }


}
