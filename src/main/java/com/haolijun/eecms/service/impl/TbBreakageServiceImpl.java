package com.haolijun.eecms.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.haolijun.eecms.entitry.TbApply;
import com.haolijun.eecms.entitry.TbBreakage;
import com.haolijun.eecms.service.TbBreakageService;
import com.haolijun.eecms.dao.TbBreakageDao;
import org.springframework.stereotype.Service;

/**
* @author crush
* @description 针对表【tb_breakage】的数据库操作Service实现
* @createDate 2023-03-08 09:49:15
*/
@Service
public class TbBreakageServiceImpl extends ServiceImpl<TbBreakageDao, TbBreakage>
    implements TbBreakageService{

    @Override
    public TbBreakage select(TbBreakage tbBreakage) {
        return baseMapper.selectOne(new LambdaQueryWrapper<TbBreakage>().setEntity(tbBreakage));
    }

}




