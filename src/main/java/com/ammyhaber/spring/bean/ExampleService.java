package com.ammyhaber.spring.bean;

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
public class ExampleService {

    public void test(String appNo) {
        System.out.println("执行test方法" + appNo);
        throw new RuntimeException("这里有一个异常" + appNo);
    }
}
