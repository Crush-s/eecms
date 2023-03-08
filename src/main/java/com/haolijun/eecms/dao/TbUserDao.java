package com.haolijun.eecms.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.haolijun.eecms.entitry.TbUser;
import java.util.HashMap;
import java.util.Set;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName TbUserDao
 * @Description TODO
 * @Author hljstart
 * @Date 2023/3/7 20:35
 * @Version 1.0
 */
@Mapper
public interface TbUserDao extends BaseMapper<TbUser> {

    // 获取用户的权限
    public Set<String> searchUserRole(@Param("userId") Integer userId);

    // 用户登录
    public Integer login(HashMap map);

}




