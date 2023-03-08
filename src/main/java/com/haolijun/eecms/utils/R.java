package com.haolijun.eecms.utils;

import cn.hutool.json.JSONUtil;
import java.util.Optional;
import org.apache.http.HttpStatus;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hljstart
 * @version 1.0.0
 * @ClassName R.java
 * @Description 前后端分离，封装返回给前端的数据的格式
 */
public class R extends HashMap<String, Object> {

    public R() {
        put("code", HttpStatus.SC_OK);
        put("msg", "success");
    }

    public R put(String key, Object value) {
        super.put(key, value);
        return this;
    }

    /**
     * 返回一个R类，默认状态为200,success
     *
     * @return
     */
    public static R ok() {
        return new R();
    }

    /**
     * 自定义msg信息
     *
     * @param msg
     * @return
     */
    public static R ok(String msg) {
        R r = new R();
        r.put("msg", msg);
        return r;
    }

    /**
     * 自定义msg信息
     *
     * @param object
     * @return
     */
    public static R ok(Object object) {
        R r = new R();
        r.putAll(
                JSONUtil.toBean(JSONUtil.toJsonStr(Optional.ofNullable(object).orElse("")),
                Map.class));
        return r;
    }

    public static R ok(Map<String, Object> map) {
        R r = new R();
        r.putAll(map);
        return r;
    }

    /**
     * 返回错误信息
     *
     * @param code
     * @param msg
     * @return
     */
    public static R error(int code, String msg) {
        R r = new R();
        r.put("code", code);
        r.put("msg", msg);
        return r;
    }

    /**
     * 自定义错误信息
     *
     * @param msg
     * @return
     */
    public static R error(String msg) {
        return error(HttpStatus.SC_INTERNAL_SERVER_ERROR, msg);
    }

    public static R error() {
        return error(HttpStatus.SC_INTERNAL_SERVER_ERROR, "未知异常，请联系管理员");
    }
}
