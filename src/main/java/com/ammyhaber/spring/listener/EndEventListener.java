package com.ammyhaber.spring.listener;

import com.ammyhaber.spring.event.EndEvent;
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
public class EndEventListener implements ApplicationListener<EndEvent> {
    @Override
    public void onApplicationEvent(EndEvent event) {
        System.out.println("EndEventListener be called:" + event.getSource());
    }
}
