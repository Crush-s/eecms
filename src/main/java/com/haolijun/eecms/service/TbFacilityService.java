package com.haolijun.eecms.service;

import com.haolijun.eecms.entitry.TbBreakage;
import com.haolijun.eecms.entitry.TbFacility;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author crush
* @description 针对表【tb_facility】的数据库操作Service
* @createDate 2023-03-08 09:49:15
*/
public interface TbFacilityService extends IService<TbFacility> {

    TbFacility select(TbFacility tbFacility);

}
