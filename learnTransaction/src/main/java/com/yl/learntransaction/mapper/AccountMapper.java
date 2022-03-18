package com.yl.learntransaction.mapper;

import java.math.BigDecimal;
import java.util.Map;

public interface AccountMapper {
    int updateMoney(Map<String,Object> map);
    BigDecimal getMoney(String id);
}
