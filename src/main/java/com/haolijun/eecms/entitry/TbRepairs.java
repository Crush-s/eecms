package com.haolijun.eecms.entitry;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @TableName tb_repairs
 */
@TableName(value ="tb_repairs")
@Data
public class TbRepairs implements Serializable {
    private Integer id;

    private Integer userId;

    private Integer facilityId;

    private Date applyTime;

    private Integer status;

    private Integer amount;

    private String desc;

    private String images;

    private static final long serialVersionUID = 1L;
}
