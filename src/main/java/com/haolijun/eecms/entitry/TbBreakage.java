package com.haolijun.eecms.entitry;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @TableName tb_breakage
 */
@TableName(value ="tb_breakage")
@Data
public class TbBreakage implements Serializable {
    private Integer id;

    private Integer userId;

    private Date applyTime;

    private String desc;

    private Integer type;

    private Integer status;

    private static final long serialVersionUID = 1L;
}
