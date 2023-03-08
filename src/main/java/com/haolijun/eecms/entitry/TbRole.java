package com.haolijun.eecms.entitry;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName TbRole
 * @Description TODO
 * @Author hljstart
 * @Date 2023/3/7 20:55
 * @Version 1.0
 */
@Data
@TableName(value ="tb_role")
public class TbRole implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Integer id;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 备注信息
     */
    private String desc;

    /**
     * 是否为系统内置角色
     */
    private Boolean systemic;
}
