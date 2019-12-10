package com.ammyhaber.spring.listener;

import com.ammyhaber.spring.event.StartEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 功能描述
 *
 * @author wangzhaori
 * @version 1.0
 * @type StartEventListener
 * @date 2019/12/6 14:38
 */
@Component
public class StartEventListener implements ApplicationListener<StartEvent> {
    @Override
    public void onApplicationEvent(StartEvent event) {
        System.out.println("StartEventListener be called:" + event.getSource());
    }
}
