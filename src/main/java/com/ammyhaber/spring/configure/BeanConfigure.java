package com.ammyhaber.spring.configure;

import com.ammyhaber.spring.bean.ExampleBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author wangzhaori
 * @date 2019/11/20
 */
@Configuration
@EnableAsync
@EnableAspectJAutoProxy
public class BeanConfigure {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public ExampleBean createExampleBean() {
        return new ExampleBean();
    }
}
