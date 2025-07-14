package org.soipan.services;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
@Aspect
public class LoggingAspect {
    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());
    @Around("@annotation(org.soipan.services.ToLog)")
    public Object log(ProceedingJoinPoint joinPoint){
        logger.info("Executing method: " + joinPoint.getSignature().getName());
        try {
            return joinPoint.proceed();
        } catch (Throwable throwable) {
            logger.severe("Exception thrown: " + throwable.getMessage());
            throw new RuntimeException(throwable);
        }
    }
}
