package com.ammyhaber.spring;

import com.ammyhaber.spring.bean.ExampleService2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wangzhaori
 * @date 2019/11/20
 */
public class GetBeanApp {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.ammyhaber.spring");
        ExampleService2 exampleBean = context.getBean(ExampleService2.class);
        exampleBean.test("这是appNo");
    }
}
