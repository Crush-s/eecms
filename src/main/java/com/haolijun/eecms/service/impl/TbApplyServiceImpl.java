package com.haolijun.eecms.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.haolijun.eecms.entitry.TbActive;
import com.haolijun.eecms.entitry.TbApply;
import com.haolijun.eecms.service.TbApplyService;
import com.haolijun.eecms.dao.TbApplyDao;
import org.springframework.stereotype.Service;

/**
 * @author crush
 * @description 针对表【tb_apply】的数据库操作Service实现
 * @createDate 2023-03-08 09:49:15
 */
@Service
public class TbApplyServiceImpl extends ServiceImpl<TbApplyDao, TbApply>
        implements TbApplyService {


    @Override
    public TbApply select(TbApply tbApply) {
        return baseMapper.selectOne(new LambdaQueryWrapper<TbApply>().setEntity(tbApply));
    }
}




