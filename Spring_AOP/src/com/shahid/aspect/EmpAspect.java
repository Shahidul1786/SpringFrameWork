
package com.shahid.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;






@Aspect
@Component
public class EmpAspect {
    
    @Before("AllAspects()") // use wildcard method 2 times call before main method;
    public void beforeAspect(){
        System.out.println("Aspect run....");
    }
    
    @Before("AllAspects()") // use wildcard method 2 times call before main method;
    public void secondAspect(){
        System.out.println("second Aspect run....");
    }
    
    
    @Pointcut("execution(public * get*())") // use poincut, all method  call before main method;
    public void AllAspects(){
       
    }
    
}
