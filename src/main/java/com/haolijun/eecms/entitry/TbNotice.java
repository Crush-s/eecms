package com.haolijun.eecms.entitry;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @TableName tb_notice
 */
@TableName(value ="tb_notice")
@Data
public class TbNotice implements Serializable {
    private Integer id;

    private String title;

    private String content;

    private Date publishTime;

    private Integer userId;

    private Integer amount;

    private Integer liked;

    private String images;

    private static final long serialVersionUID = 1L;
}
