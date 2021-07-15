package cn.me.wardemo.service.impl;

import cn.me.wardemo.service.UserService;
import com.alibaba.dubbo.config.annotation.Service;


/**
 * @Classname UserServiceImpl
 * @Description TODO
 * @Date 2021/7/15 10:23
 * @Created by yuhousheng
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String findName() {
        return "hahhhahah";
    }
}
