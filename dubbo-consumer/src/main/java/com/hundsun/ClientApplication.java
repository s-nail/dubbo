package com.hundsun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * Spring Boot 应用启动类
 *
 * @SpringBootApplication ：Spring Boot 应用的标识
 *
 * exclude = DataSourceAutoConfiguration.class：排除自动注入数据源的配置（取消数据库配置），一般使用在客户端（消费者）服务中
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class ClientApplication {

    public static void main(String[] args) {
        // 程序启动入口
        // 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
        SpringApplication.run(ClientApplication.class, args);
    }
}
