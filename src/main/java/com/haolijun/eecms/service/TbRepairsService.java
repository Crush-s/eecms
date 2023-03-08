package com.haolijun.eecms.service;

import com.haolijun.eecms.entitry.TbNotice;
import com.haolijun.eecms.entitry.TbRepairs;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author crush
* @description 针对表【tb_repairs】的数据库操作Service
* @createDate 2023-03-08 09:49:15
*/
public interface TbRepairsService extends IService<TbRepairs> {

    TbRepairs select(TbRepairs tbRepairs);

}
