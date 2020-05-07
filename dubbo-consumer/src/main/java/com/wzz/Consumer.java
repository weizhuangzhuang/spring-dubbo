package com.wzz;

import com.wzz.service.IUserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"classpath:/dubbo-consumer.xml"});
        context.start();
        IUserService userService = context.getBean(IUserService.class); // 获取远程服务代理
        String hello = userService.hello(); // 执行远程方法
        System.out.println( hello ); // 显示调用结果
        System.in.read(); // 按任意键退出
    }
}