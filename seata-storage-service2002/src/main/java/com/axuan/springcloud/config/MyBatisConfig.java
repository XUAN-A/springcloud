package com.axuan.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author axuan
 * @date 2022/4/24 下午7:52
 */
@Configuration
@MapperScan({"com.axuan.springcloud.dao"})
public class MyBatisConfig {
}

