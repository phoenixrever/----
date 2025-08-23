package com.atguigu.ioc_03;

import org.springframework.stereotype.Service;

/**
 * projectName: com.atguigu.ioc_03
 *
 * 
 * description:
 */
@Service
public class NewUserServiceImpl implements UserService {

    @Override
    public String show() {
        return "NewUserServiceImpl show();";
    }
}
