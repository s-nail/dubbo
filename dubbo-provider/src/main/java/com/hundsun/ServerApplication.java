package com.hundsun;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * https://www.cnblogs.com/wdss/p/11141051.html
 * https://blog.csdn.net/zht741322694/article/details/83756101
 *
 * Spring Boot 应用启动类
 */
@EnableDubboConfiguration
@SpringBootApplication
public class ServerApplication {

    public static void main(String[] args) {
        //ClassNotFoundException: org.aspectj.lang.annotation.Pointcut
        // 程序启动入口
        // 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
        SpringApplication.run(ServerApplication.class, args);
    }
}
