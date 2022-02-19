package com.tsm.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class LogAspect {
    @Pointcut(value = "execution(* com.tsm.service..*.*(..)) || execution(* com.tsm.mapper..*.*(..)) " +
            "|| execution(* com.tsm.controller..*.*(..))")
    public void logPointCut(){
    }
    @Before(value = "logPointCut()")
    public void beforeAdivce(JoinPoint joinPoint){
        log.debug(">>>>>>>>>>>>>>>>>>>>>>>>>>>>进入{}类的{}方法！",
                joinPoint.getTarget().getClass(),
                joinPoint.getSignature());
    }
    @After(value ="logPointCut()")
    public void afterAdivce(JoinPoint joinPoint){
        log.debug("<<<<<<<<<<<<<<<<<<<<<<<<<<<完成{}类的{}方法的调用！",
                joinPoint.getTarget().getClass(),
                joinPoint.getSignature());

    }
}
