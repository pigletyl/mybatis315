package com.yl.learntransaction.controller;

import com.yl.learntransaction.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/*
 * @Author yang
 * @Description //TODO $
 * @Date
 **/
@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;
    @RequestMapping("/transfer")
    public int transfer(String acountId, String acountIdEd, BigDecimal money){
        Map<String,Object> map = new HashMap<>();
        map.put("acountId",acountId);
        map.put("acountIdEd",acountIdEd);
        map.put("money",money);
        return accountService.transferMoney(map);
    }
}
