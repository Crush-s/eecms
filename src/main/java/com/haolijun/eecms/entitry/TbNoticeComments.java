package com.haolijun.eecms.entitry;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @TableName tb_notice_comments
 */
@TableName(value ="tb_notice_comments")
@Data
public class TbNoticeComments implements Serializable {
    private Integer id;

    private Integer nId;

    private Integer userId;

    private String content;

    private Integer liked;

    private Integer parentId;

    private Date createTime;

    private static final long serialVersionUID = 1L;
}
