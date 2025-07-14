package org.soipan.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
@Aspect
@Order(1)
public class SecurityAspect {
    private Logger logger = Logger.getLogger(SecurityAspect.class.getName());
    @Around("@annotation(org.soipan.advices.ToLog)")
    public Object secure(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("Security Aspect: Calling intercepted method");
        Object returnedValue = joinPoint.proceed();
        logger.info("Security aspect executed successfully: returned value " + returnedValue);
        return returnedValue;
    }
}
