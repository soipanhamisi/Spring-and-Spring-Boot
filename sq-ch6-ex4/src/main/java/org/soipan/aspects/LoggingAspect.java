package org.soipan.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import java.util.logging.Logger;

@Configuration
@Aspect
@Order(2)
public class LoggingAspect {
    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());
    @Around("@annotation(org.soipan.advices.ToLog)")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("Logging Aspect: Calling intercepted method");

        Object returnedValue = joinPoint.proceed();
        logger.info("Method executed successfully: returned value " + returnedValue);
        return returnedValue;
    }
}
