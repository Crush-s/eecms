package com.haolijun.eecms.controller;

import cn.dev33.satoken.stp.StpUtil;
import cn.hutool.json.JSONUtil;
import com.haolijun.eecms.controller.form.LoginForm;
import com.haolijun.eecms.service.TbUserService;
import com.haolijun.eecms.utils.R;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Set;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author hljstart
 * @Date 2023/3/7 22:31
 * @Version 1.0
 */
@RestController
@RequestMapping("/user")
@Tag(name = "UserController", description = "用户Web接口")
public class UserController {

    @Autowired
    private TbUserService tbUserService;

    @PostMapping("/login")
    public R login(@Valid @RequestBody LoginForm form) {
        HashMap map = JSONUtil.parse(form).toBean(HashMap.class);
        Integer userId = tbUserService.login(map);
        boolean result = userId != null;
        R r = R.ok().put("result", result);
        if (result) {
            // 登录成功
            StpUtil.login(userId);
            // 查询用户角色
            Set<String> roles = tbUserService.searchUserRole(userId);
            // 获取token
            String token = StpUtil.getTokenInfo().getTokenValue();
            // 返回给前端数据
            r.put("token", token).put("roles", roles);
        }
        return r;
    }

}
