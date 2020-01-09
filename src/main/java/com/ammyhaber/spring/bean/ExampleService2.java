package com.ammyhaber.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 功能描述
 *
 * @author wangzhaori
 * @version 1.0
 * @type ExampleService
 * @date 2020/1/9 17:08
 */
@Service
public class ExampleService2 {

    @Autowired
    private ExampleBean exampleBean;

    public void test(String appNo) {
        exampleBean.test(appNo);
    }
}
