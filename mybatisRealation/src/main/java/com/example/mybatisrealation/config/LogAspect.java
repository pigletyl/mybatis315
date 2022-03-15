package com.example.mybatisrealation.config;

import com.example.mybatisrealation.Server.SysLogService;
import com.example.mybatisrealation.bean.SysLog;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Date;

/*
 * @Author yang
 * @Description //TODO $ 自定义一个日志切面类
 * @Date
 **/
@Component
@Aspect
public class LogAspect {
    private final static Logger log = org.slf4j.LoggerFactory.getLogger(LogAspect.class);
    @Autowired
    private SysLogService sysLogService;

    @Pointcut("@annotation(com.example.mybatisrealation.config.Log)")
    public void pointput(){}

    @Around("pointput()")
    public Object around(ProceedingJoinPoint point){
        Object result = null;
        long beginTime = System.currentTimeMillis();
        try {
            log.info("在目标方式之前执行——————");
            result = point.proceed();
            long endTime = System.currentTimeMillis();
            insertLog(point,endTime-beginTime);
        }catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return result;
    }
    private void insertLog(ProceedingJoinPoint point,long time){
        MethodSignature signature = (MethodSignature) point.getSignature();
        Method method = signature.getMethod();
        SysLog sl = new SysLog();
        sl.setCreateTime(new Date());
        sl.setId(2);
        sl.setUserId(2);
        //获取注解上面的描述
        Log userAction = method.getAnnotation(Log.class);
        if(userAction !=null){
            sl.setUserAction(userAction.value());
        }
        //获取类名
        String className = point.getTarget().getClass().getClass().getName();
        //获取方法名
        String name = method.getName();
        //获取参数
        String args = Arrays.toString(point.getArgs());
        sysLogService.addLog(sl);
        log.info(className+"___"+name+"______"+args);
    }

    //当执行这个controller包下的所有controller则会走下面这个切面
    @Pointcut("execution(public * com.example.mybatisrealation.controller.*.*(..))")
    public void pointCuntOfController(){

    }
    @Before("pointCuntOfController()")
    public void beforeAdvice(JoinPoint point){
        String methodMam = point.getSignature().getDeclaringTypeName()+"."+point.getSignature().getName();
        String params = Arrays.toString(point.getArgs());
        log.info("请求了"+methodMam+"参数是："+params);
    }
}
