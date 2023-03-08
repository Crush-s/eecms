package com.haolijun.eecms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.haolijun.eecms.entitry.TbUser;
import java.util.HashMap;
import java.util.Set;
import org.apache.ibatis.annotations.Param;

/**
* @author crush
* @description 针对表【tb_user】的数据库操作Service
* @createDate 2023-03-08 09:49:15
*/
public interface TbUserService extends IService<TbUser> {

    // 获取用户的权限
    Set<String> searchUserRole(@Param("userId") Integer userId);

    //
    Integer login(HashMap map);

}
