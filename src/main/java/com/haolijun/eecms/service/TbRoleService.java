package com.haolijun.eecms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.haolijun.eecms.entitry.TbRepairs;
import com.haolijun.eecms.entitry.TbRole;

/**
 * @author crush
 * @description 针对表【tb_role】的数据库操作Service
 * @createDate 2023-03-08 09:49:15
 */
public interface TbRoleService extends IService<TbRole> {

    TbRole select(TbRole tbRole);

}
