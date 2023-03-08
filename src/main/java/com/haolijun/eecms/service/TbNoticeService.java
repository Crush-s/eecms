package com.haolijun.eecms.service;

import com.haolijun.eecms.entitry.TbNotice;
import com.baomidou.mybatisplus.extension.service.IService;
import com.haolijun.eecms.entitry.TbNoticeComments;

/**
* @author crush
* @description 针对表【tb_notice】的数据库操作Service
* @createDate 2023-03-08 09:49:15
*/
public interface TbNoticeService extends IService<TbNotice> {

    TbNotice select(TbNotice tbNotice);

}
