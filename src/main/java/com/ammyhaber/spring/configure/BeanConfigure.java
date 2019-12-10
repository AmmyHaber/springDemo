package com.ammyhaber.spring.configure;

import com.ammyhaber.spring.bean.ExampleBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wangzhaori
 * @date 2019/11/20
 */
@Configuration
public class BeanConfigure {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public ExampleBean createExampleBean() {
        return new ExampleBean();
    }
}
