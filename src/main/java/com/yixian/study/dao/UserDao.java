package com.yixian.study.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yixian.study.dto.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author yixian
 * @title: UserDao
 * @projectName study
 * @description: null
 * @date 2023-02-22 17:58
 */
@Mapper
public interface UserDao extends BaseMapper<User> {

}
