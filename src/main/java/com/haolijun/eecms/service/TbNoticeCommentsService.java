package com.haolijun.eecms.service;

import com.haolijun.eecms.entitry.TbFacility;
import com.haolijun.eecms.entitry.TbNoticeComments;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author crush
* @description 针对表【tb_notice_comments】的数据库操作Service
* @createDate 2023-03-08 09:49:15
*/
public interface TbNoticeCommentsService extends IService<TbNoticeComments> {

    TbNoticeComments select(TbNoticeComments tbNoticeComments);

}
