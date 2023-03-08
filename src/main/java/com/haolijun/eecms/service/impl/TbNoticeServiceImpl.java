package com.haolijun.eecms.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.haolijun.eecms.entitry.TbNotice;
import com.haolijun.eecms.entitry.TbNoticeComments;
import com.haolijun.eecms.service.TbNoticeService;
import com.haolijun.eecms.dao.TbNoticeDao;
import org.springframework.stereotype.Service;

/**
* @author crush
* @description 针对表【tb_notice】的数据库操作Service实现
* @createDate 2023-03-08 09:49:15
*/
@Service
public class TbNoticeServiceImpl extends ServiceImpl<TbNoticeDao, TbNotice>
    implements TbNoticeService{

    @Override
    public TbNotice select(TbNotice tbNotice) {
        return baseMapper.selectOne(new LambdaQueryWrapper<TbNotice>().setEntity(tbNotice));
    }

}




