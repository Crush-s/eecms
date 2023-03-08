package com.haolijun.eecms.service;

import com.haolijun.eecms.entitry.TbActive;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author crush
* @description 针对表【tb_active】的数据库操作Service
* @createDate 2023-03-08 09:36:32
*/
public interface TbActiveService extends IService<TbActive> {

    TbActive select(TbActive tbActive);
}
