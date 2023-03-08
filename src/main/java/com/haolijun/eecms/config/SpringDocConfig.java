package com.haolijun.eecms.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName SpringDocConfig
 * @Description SpringDoc的配置类
 * @Author hljstart
 * @Date 2023/3/6 22:17
 * @Version 1.0
 */
@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "eecms-api",
                description = "Eecms后端Java项目",
                version = "1.0"
        )
)
@SecurityScheme(
        name = "token",
        type = SecuritySchemeType.HTTP,
        bearerFormat = "JWT",
        scheme = "bearer"
)
public class SpringDocConfig {
}
