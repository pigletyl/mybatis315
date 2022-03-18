package com.yl.learntransaction.service.imp;

import com.yl.learntransaction.mapper.AccountMapper;
import com.yl.learntransaction.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/*
 * @Author yang
 * @Description //TODO $
 * @Date
 **/

@Service
public class AccountServiceImp implements AccountService {
    @Resource
    private AccountMapper accountMapper;
    @Autowired
    private TransactionTemplate template;
    @Override
    @Transactional
    public int transferMoney(Map<String, Object> map) {
        Map<String, Object> param = new HashMap<>();
        String  id = (String) map.get("acountId");
        String  eid = (String)map.get("acountIdEd");
        BigDecimal money = accountMapper.getMoney(id);
        BigDecimal moneyed = accountMapper.getMoney(eid);
        BigDecimal transfermoney = (BigDecimal) map.get("money");
        param.put("id",id);
        param.put("money",money.subtract(transfermoney));
        accountMapper.updateMoney(param);
        int a = 10/0;
        param.put("id",eid);
        param.put("money",moneyed.add(transfermoney));
        accountMapper.updateMoney(param);
        return 0;
    }
    /*@Override
    *//**
     * 使用transactionTemplate进行编程式事务
     *//*
    public int transferMoney(Map<String, Object> map) {
        template.execute(new TransactionCallback<Object>() {
            @Override
            public Object doInTransaction(TransactionStatus status) {
                Map<String, Object> param = new HashMap<>();
                String  id = (String) map.get("acountId");
                String  eid = (String)map.get("acountIdEd");
                BigDecimal money = accountMapper.getMoney(id);
                BigDecimal moneyed = accountMapper.getMoney(eid);
                BigDecimal transfermoney = (BigDecimal) map.get("money");
                param.put("id",id);
                param.put("money",money.subtract(transfermoney));
                accountMapper.updateMoney(param);
                int a = 10/0;
                param.put("id",eid);
                param.put("money",moneyed.add(transfermoney));
                accountMapper.updateMoney(param);
                return null;
            }
        });
        return 0;
    }*/




}
