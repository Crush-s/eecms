package com.haolijun.eecms.entitry;

import com.alibaba.druid.sql.visitor.functions.Char;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

import java.util.Date;

/**
 * @ClassName TbUser
 * @Description TODO
 * @Author hljstart
 * @Date 2023/3/7 21:04
 * @Version 1.0
 */
@Data
@TableName(value ="tb_user")
public class TbUser implements Serializable {

    private Integer id;

    private String username;

    private String password;

    private String photo;

    private String name;

    private Char sex;

    private String phone;

    private Date birthday;

    private Date createTime;

    private TbRole role;

    private Byte status;

    private static final long serialVersionUID = 1L;

}
