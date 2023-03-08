package com.haolijun.eecms.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.haolijun.eecms.entitry.TbActive;
import com.haolijun.eecms.service.TbActiveService;
import com.haolijun.eecms.dao.TbActiveDao;
import org.springframework.stereotype.Service;

/**
 * @author crush
 * @description 针对表【tb_active】的数据库操作Service实现
 * @createDate 2023-03-08 09:36:32
 */
@Service
public class TbActiveServiceImpl extends ServiceImpl<TbActiveDao, TbActive>
        implements TbActiveService {

    @Override
    public TbActive select(TbActive tbActive) {
        return baseMapper.selectOne(new LambdaQueryWrapper<TbActive>().setEntity(tbActive));
    }
}




