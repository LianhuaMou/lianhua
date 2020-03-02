package com.start.controller;


import com.google.gson.Gson;
import com.start.service.accountService.AccountService;
import com.start.utils.StringUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
@RequestMapping("/test")
public class TestController {


    @Autowired
    private AccountService accountService;

    /**
     * 获取Account 对象通过userId
     *
     * @param userId
     * @return
     */
    @RequestMapping(value = "/queryAccount")
    @ResponseBody
    public String queryAccount(String userId) {
        Gson gson = StringUtil.getGson();
        System.out.println(accountService.queryAccount(userId));
        return gson.toJson(accountService.queryAccount(userId));
    }



}
