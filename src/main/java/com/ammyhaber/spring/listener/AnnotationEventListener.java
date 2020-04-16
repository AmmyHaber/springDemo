package com.ammyhaber.spring.listener;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * 功能描述
 *
 * @author wangzhaori
 * @version 1.0
 * @type AnnotationEventListener
 * @date 2020/4/16 15:11
 */
@Component
public class AnnotationEventListener {

    @Async
    @EventListener
    public void onEvent(String message) {
        System.out.println(String.format("Execute %s, param:%s", this.getClass().getMethods()[0], message));
    }
}
