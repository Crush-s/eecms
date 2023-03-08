package com.haolijun.eecms.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.haolijun.eecms.entitry.TbFacility;
import com.haolijun.eecms.entitry.TbNoticeComments;
import com.haolijun.eecms.service.TbNoticeCommentsService;
import com.haolijun.eecms.dao.TbNoticeCommentsDao;
import org.springframework.stereotype.Service;

/**
* @author crush
* @description 针对表【tb_notice_comments】的数据库操作Service实现
* @createDate 2023-03-08 09:49:15
*/
@Service
public class TbNoticeCommentsServiceImpl extends ServiceImpl<TbNoticeCommentsDao, TbNoticeComments>
    implements TbNoticeCommentsService{

    @Override
    public TbNoticeComments select(TbNoticeComments tbNoticeComments) {
        return baseMapper.selectOne(new LambdaQueryWrapper<TbNoticeComments>().setEntity(tbNoticeComments));
    }

}




