package com.fancz.gamll.user.mapper;

import com.fancz.gamll.user.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author fancz
 * @Title: ${file_name}
 * @date 2020/5/26 14:14
 */
public interface UserMapper extends Mapper<UmsMember> {
    public List<UmsMember> selectAllUser();
}
