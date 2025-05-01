package com.example.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;


//execution(modifiers-pattern? ret-type-pattern declaring-type-pattern?name-pattern(param-pattern)
//        throws-pattern?)


@Aspect
@Component
@Order(2)
public class LoggerAspect {
    private Logger logger=Logger.getLogger(LoggerAspect.class.getName());

    @Around("execution(* com.examplefg.Services.*.*(..))")    //around is an advice, execution is pointcut
    public void log(ProceedingJoinPoint joinPoint) throws Throwable{
        logger.info(joinPoint.getSignature().getName()+"method execution started.");
        Instant start= Instant.now();
        joinPoint.proceed();
        Instant finish= Instant.now();
        long timeElapsed= Duration.between(start,finish).toMillis();
        logger.info(joinPoint.getSignature().getName()+"method took "+timeElapsed+ " time.");
        logger.info(joinPoint.getSignature().getName()+"method execution end.");

    }

    @Around("@annotation(com.example.interfaces.LogAspect)")    //around is an advice, execution is pointcut
    public void logWithAnnotation(ProceedingJoinPoint joinPoint) throws Throwable{
        logger.info(joinPoint.getSignature().getName()+"method execution started.");
        Instant start= Instant.now();
        joinPoint.proceed();
        Instant finish= Instant.now();
        long timeElapsed= Duration.between(start,finish).toMillis();
        logger.info(joinPoint.getSignature().getName()+"method took "+timeElapsed+ " time.");
        logger.info(joinPoint.getSignature().getName()+"method execution end.");

    }


    @AfterThrowing(value="execution(* com.example.Services.*.*(..))",throwing = "ex")
    public void logException(JoinPoint joinPoint, Exception ex)
    {
        logger.log(Level.SEVERE,joinPoint.getSignature().getName()+" method threw exception "+ex.getMessage());
    }

    @AfterReturning(value = "execution(* com.example.Services.*.*(..))",returning = "retVal")
    public void logStatus(JoinPoint joinPoint, Object retVal)
    {
        logger.log(Level.INFO,joinPoint.getSignature().getName()+ " method ran successfully and return value : "+retVal.toString());
    }
}
