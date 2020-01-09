package com.ammyhaber.spring.configure;

import com.ammyhaber.spring.bean.ExampleBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author wangzhaori
 * @date 2019/11/20
 */
@Configuration
@EnableAspectJAutoProxy
public class BeanConfigure {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public ExampleBean createExampleBean() {
        return new ExampleBean();
    }
}
