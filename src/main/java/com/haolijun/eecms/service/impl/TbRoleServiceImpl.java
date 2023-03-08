package com.haolijun.eecms.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.haolijun.eecms.entitry.TbRepairs;
import com.haolijun.eecms.entitry.TbRole;
import com.haolijun.eecms.service.TbRoleService;
import com.haolijun.eecms.dao.TbRoleDao;
import org.springframework.stereotype.Service;

/**
* @author crush
* @description 针对表【tb_role】的数据库操作Service实现
* @createDate 2023-03-08 09:49:15
*/
@Service
public class TbRoleServiceImpl extends ServiceImpl<TbRoleDao, TbRole>
    implements TbRoleService{

    @Override
    public TbRole select(TbRole tbRole) {
        return baseMapper.selectOne(new LambdaQueryWrapper<TbRole>().setEntity(tbRole));
    }

}




