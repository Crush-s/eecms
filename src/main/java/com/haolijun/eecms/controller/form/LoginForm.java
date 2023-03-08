package com.haolijun.eecms.controller.form;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

/**
 * @author hljstart
 * @version 1.0.0
 * @ClassName LoginForm.java
 * @Description 登录表单类
 */
@Schema(description = "登录表单类")
@Data
public class LoginForm {

    @NotBlank(message = "username不能为空")
    @Pattern(regexp = "^[a-zA-Z0-9]{5,20}$",message = "username内容不正确")
    @Schema(description = "用户名")
    private String username;

    @NotBlank(message = "密码不能为空")
    @Pattern(regexp = "^[a-zA-Z0-9]{6,20}$",message = "password密码格式不正确")
    @Schema(description = "密码")
    private String password;
}
