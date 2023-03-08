package com.haolijun.eecms.entitry;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * @TableName tb_facility
 */
@TableName(value ="tb_facility")
@Data
public class TbFacility implements Serializable {
    private Integer id;

    private String name;

    private BigDecimal price;

    private String image;

    private Integer type;

    private Integer amount;

    private static final long serialVersionUID = 1L;
}
