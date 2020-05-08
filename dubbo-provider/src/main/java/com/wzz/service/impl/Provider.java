package com.wzz.service.impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 启动spring容器
 */
public class Provider {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"classpath:/dubbo-provider.xml"});
        context.start();
        System.out.println("发布服务成功28801");
        System.in.read(); // 按任意键退出
    }
}
