package com.haolijun.eecms.entitry;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * @TableName tb_apply
 */
@TableName(value ="tb_apply")
@Data
public class TbApply implements Serializable {
    private Integer id;

    private Integer acId;

    private Integer userId;

    private static final long serialVersionUID = 1L;
}
