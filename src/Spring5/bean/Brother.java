package Spring5.bean;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author Eric
 * @date 2021/1/24 14:19
 */
@Component
@Aspect
public class Brother {
    @Pointcut(value = "execution(* Spring5.bean.Sister.say(..))")
    public void point(){

    }
    @Before(value = "point()")
    public void before(){
        System.out.println("oh!");
    }
    @AfterReturning(value = "point()")
    public void afterRunning(){
        System.out.println("good");
    }
    @After(value = "point()")
    public void after(){
        System.out.println("do it");
    }
    @AfterThrowing (value = "point()")
    public void afterThrowing(){
        System.out.println("your pussy are tight");
    }
    @Around( value = "point()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("do before");
        proceedingJoinPoint.proceed();
        System.out.println("xi job");
    }
}
