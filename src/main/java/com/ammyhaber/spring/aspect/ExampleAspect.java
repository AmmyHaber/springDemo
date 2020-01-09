package com.ammyhaber.spring.aspect;

import com.ammyhaber.spring.bean.ExampleBean;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 功能描述
 *
 * @author wangzhaori
 * @version 1.0
 * @type ExampleAspect
 * @date 2020/1/9 16:56
 */
@Aspect
@Component
public class ExampleAspect {

    private final ExampleBean exampleBean;

    public ExampleAspect(ExampleBean exampleBean) {
        this.exampleBean = exampleBean;
    }

    @Pointcut("execution(* com.ammyhaber.spring.bean.ExampleService.test(..))")
    public void inService() {

    }

    @AfterThrowing(pointcut = "inService() && args(appNo)", throwing = "e")
    public void test(Exception e, String appNo) {
        System.out.println("进入了切面方法中, " + e.getMessage());
        System.out.println("appNo为：" + appNo);
    }
}
