package com.haolijun.eecms.entitry;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @TableName tb_active
 */
@TableName(value = "tb_active")
@Data
public class TbActive implements Serializable {

    private Integer id;

    private String title;

    private String depict;

    private Date startTime;

    private Date endTime;

    private Date createTime;

    private Integer userId;

    private static final long serialVersionUID = 1L;
}
