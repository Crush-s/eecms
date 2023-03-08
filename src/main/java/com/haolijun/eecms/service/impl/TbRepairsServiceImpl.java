package com.haolijun.eecms.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.haolijun.eecms.entitry.TbNotice;
import com.haolijun.eecms.entitry.TbRepairs;
import com.haolijun.eecms.service.TbRepairsService;
import com.haolijun.eecms.dao.TbRepairsDao;
import org.springframework.stereotype.Service;

/**
* @author crush
* @description 针对表【tb_repairs】的数据库操作Service实现
* @createDate 2023-03-08 09:49:15
*/
@Service
public class TbRepairsServiceImpl extends ServiceImpl<TbRepairsDao, TbRepairs>
    implements TbRepairsService{

    @Override
    public TbRepairs select(TbRepairs tbRepairs) {
        return baseMapper.selectOne(new LambdaQueryWrapper<TbRepairs>().setEntity(tbRepairs));
    }

}




