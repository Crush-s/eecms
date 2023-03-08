package com.haolijun.eecms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.haolijun.eecms.entitry.TbUser;
import com.haolijun.eecms.service.TbUserService;
import com.haolijun.eecms.dao.TbUserDao;
import java.util.HashMap;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author crush
* @description 针对表【tb_user】的数据库操作Service实现
* @createDate 2023-03-08 09:49:15
*/
@Service
public class TbUserServiceImpl extends ServiceImpl<TbUserDao, TbUser>
    implements TbUserService{

    @Autowired
    private TbUserDao userDao;


    @Override
    public Set<String> searchUserRole(Integer userId) {
        Set<String> roles = userDao.searchUserRole(userId);
        return roles;
    }

    @Override
    public Integer login(HashMap map) {
        Integer userId = userDao.login(map);
        return userId;
    }

}




