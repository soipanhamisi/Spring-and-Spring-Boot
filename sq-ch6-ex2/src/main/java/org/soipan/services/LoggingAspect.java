package org.soipan.services;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.soipan.model.Comment;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.logging.Logger;

@Component
@Aspect
public class LoggingAspect {
    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around(" execution(* org.soipan.services.*.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();

        logger.info("method: " + methodName +
        ", paramteters " +
                Arrays.asList(args) + "Will execute");

        Comment comment = new Comment();
        comment.setComment("The new comment is Hello World!");

        Object [] newArgs = {comment};
        Object [] returnedByObject = new Object[]{joinPoint.proceed(newArgs)};
        logger.info("the method executed and returned" + Arrays.asList(returnedByObject));
        return "FAILED";
    }
}
