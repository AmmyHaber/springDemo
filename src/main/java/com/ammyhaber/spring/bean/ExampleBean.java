package com.ammyhaber.spring.bean;

/**
 * @author wangzhaori
 * @date 2019/11/20
 */
public class ExampleBean {

    private void init() {
        System.out.println("execute init method");
    }

    public void execute() {
        System.out.println("execute execute method");
    }

    private void destroy() {
        System.out.println("execute destroy method");
    }
}
