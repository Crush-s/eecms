package com.haolijun.eecms.service;

import com.haolijun.eecms.entitry.TbApply;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author crush
* @description 针对表【tb_apply】的数据库操作Service
* @createDate 2023-03-08 09:49:15
*/
public interface TbApplyService extends IService<TbApply> {

    TbApply select(TbApply tbApply);
}
