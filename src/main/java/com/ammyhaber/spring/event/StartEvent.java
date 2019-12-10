package com.ammyhaber.spring.event;

import org.springframework.context.ApplicationEvent;

/**
 * 功能描述
 *
 * @author wangzhaori
 * @version 1.0
 * @type StartEvent
 * @date 2019/12/6 14:33
 */
public class StartEvent extends ApplicationEvent {
    /**
     * Create a new {@code ApplicationEvent}.
     *
     * @param source the object on which the event initially occurred or with
     *               which the event is associated (never {@code null})
     */
    public StartEvent(Object source) {
        super(source);
    }
}
