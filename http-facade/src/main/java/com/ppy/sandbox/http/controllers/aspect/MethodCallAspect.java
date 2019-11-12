package com.ppy.sandbox.http.controllers.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class MethodCallAspect {
    @Around("execution(* com.ppy.sandbox.http.controllers.aspect.*MethodClass.*(..))")
    public void logAroundAllMethods(ProceedingJoinPoint joinPoint) throws Throwable
    {
        System.out.println("****LoggingAspect.logAroundAllMethods() : " + joinPoint.getSignature().getDeclaringType().getCanonicalName() + "#" + joinPoint.getSignature().getName() + ": Before Method Execution");
        try {
            joinPoint.proceed();
        } finally {
            //Do Something useful, If you have
        }
        System.out.println("****LoggingAspect.logAroundAllMethods() : " + joinPoint.getSignature().getDeclaringType().getCanonicalName() + "#" + joinPoint.getSignature().getName() + ": After Method Execution");
    }
}
