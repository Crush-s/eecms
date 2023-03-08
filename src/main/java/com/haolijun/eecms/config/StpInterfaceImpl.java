package com.haolijun.eecms.config;

import cn.dev33.satoken.stp.StpInterface;
import com.haolijun.eecms.dao.TbUserDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @ClassName StpInterfaceImpl
 * @Description TODO
 * @Author hljstart
 * @Date 2023/3/7 21:40
 * @Version 1.0
 */
public class StpInterfaceImpl implements StpInterface {

    @Autowired
    private TbUserDao userDao;

    @Override
    public List<String> getPermissionList(Object o, String s) {
        List<String> list = new ArrayList<>();
        return list;
    }

    @Override
    public List<String> getRoleList(Object loginId, String loginType) {
        int userId = Integer.parseInt(loginId.toString());
        Set<String> roles = userDao.searchUserRole(userId);
        List<String> list = new ArrayList<>();
        list.addAll(roles);
        return list;
    }
}
