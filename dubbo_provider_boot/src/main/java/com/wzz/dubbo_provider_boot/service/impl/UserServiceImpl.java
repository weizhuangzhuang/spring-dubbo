package com.wzz.dubbo_provider_boot.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.wzz.service.IUserService;
import org.springframework.stereotype.Component;

@Component
@Service
public class UserServiceImpl implements IUserService {
    @Override
    public String hello() {
        return "hello dubbo-boot!!!";
    }
}
