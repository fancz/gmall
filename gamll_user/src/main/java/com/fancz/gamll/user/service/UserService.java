package com.fancz.gamll.user.service;


import com.fancz.gamll.user.bean.UmsMember;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author fancz
 * @Title: ${file_name}
 * @date 2020/5/26 14:08
 */

public interface UserService {
    public List<UmsMember> getAllUser();
}
