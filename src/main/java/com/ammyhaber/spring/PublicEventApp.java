package com.ammyhaber.spring;

import com.ammyhaber.spring.event.StartEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 功能描述
 *
 * @author wangzhaori
 * @version 1.0
 * @type PublicEventApp
 * @date 2019/12/6 14:26
 */
public class PublicEventApp {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.ammyhaber.spring");
        StartEvent startEvent = new StartEvent("this is start event");
//        StartEvent endEvent = new StartEvent("this is end event");
        context.publishEvent(startEvent);
//        context.publishEvent(endEvent);
        context.publishEvent("I'm coming home, coming home");
        System.out.println("----------------");
    }
}
