package org.soipan.services;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class LoggingAspect {
    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());
    @Around("execution(* org.soipan.services.CommentService.publishComment(..))")
    public void log(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("Executing method ");
        joinPoint.proceed();
        logger.info("Method executed successfully");
    }
}
