package com.fancz.gamll.user.service.impl;

import com.fancz.gamll.user.bean.UmsMember;
import com.fancz.gamll.user.mapper.UserMapper;
import com.fancz.gamll.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author fancz
 * @Title: ${file_name}
 * @date 2020/5/26 14:09
 */

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;


    @Override
    public List<UmsMember> getAllUser() {
        return userMapper.selectAll();
    }
}
