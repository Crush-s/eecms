package com.haolijun.eecms.config;

import cn.dev33.satoken.exception.NotLoginException;
import cn.hutool.json.JSONObject;
import com.haolijun.eecms.exception.EECMSException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author hljstart
 * @version 1.0.0
 * @ClassName ExceptionAdvice.java
 * @Description TODO
 */
@RestControllerAdvice
@Slf4j
public class ExceptionAdvice {

    @ResponseBody
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    public String exceptionHandler(Exception e){
        JSONObject json = new JSONObject();
        // 处理后端验证失败产生的异常
        // 这里处理的是参数不符合规定错误 @Valid
        if(e instanceof MethodArgumentNotValidException){
            MethodArgumentNotValidException exception = (MethodArgumentNotValidException) e;
            json.set("error",exception.getBindingResult().getFieldError().getDefaultMessage());
        }
        // 这是处理运行时异常
        else if(e instanceof EECMSException){
            log.error("执行异常",e);
            EECMSException exception = (EECMSException) e;
            json.set("error",exception.getMsg());
        }
        // 处理其余的异常
        else {
            log.error("执行异常",e);
            json.set("error","执行异常");
        }
        return json.toString();
    }

    /**
     * 处理为登录异常
     * @param e
     * @return
     */
    @ResponseBody
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ExceptionHandler(NotLoginException.class)
    public String unLoginHandler(Exception e){
        JSONObject json = new JSONObject();
        json.set("error",e.getMessage());
        return json.toString();
    }
}
