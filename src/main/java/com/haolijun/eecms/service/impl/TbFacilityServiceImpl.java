package com.haolijun.eecms.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.haolijun.eecms.entitry.TbBreakage;
import com.haolijun.eecms.entitry.TbFacility;
import com.haolijun.eecms.service.TbFacilityService;
import com.haolijun.eecms.dao.TbFacilityDao;
import org.springframework.stereotype.Service;

/**
* @author crush
* @description 针对表【tb_facility】的数据库操作Service实现
* @createDate 2023-03-08 09:49:15
*/
@Service
public class TbFacilityServiceImpl extends ServiceImpl<TbFacilityDao, TbFacility>
    implements TbFacilityService{

    @Override
    public TbFacility select(TbFacility tbFacility) {
        return baseMapper.selectOne(new LambdaQueryWrapper<TbFacility>().setEntity(tbFacility));
    }

}




