package com.example.mybatisrealation.Server.imp;

import com.example.mybatisrealation.Server.SysLogService;
import com.example.mybatisrealation.bean.SysLog;
import com.example.mybatisrealation.mapper.SysLogMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/*
 * @Author yang
 * @Description //TODO $
 * @Date
 **/
@Service
public class SysLogServiceImp implements SysLogService {
    @Resource
    private SysLogMapper sysLogMapper;
    @Override
    public Integer addLog(SysLog log) {
        return sysLogMapper.insertLog(log);
    }
}
