package com.hundsun.service;

import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.spring.ServiceBean;
import com.alibaba.dubbo.config.spring.schema.DubboNamespaceHandler;
import com.hundsun.domain.City;
import com.hundsun.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

/**
 * 城市 Dubbo 服务消费者
 */
@Service
public class CityDubboConsumerService {
    private static int i = 0;

    @Reference
    CityDubboService cityDubboService;

    @Reference
    UserService userService;

    public void printCity() {
        String cityName = "广州";
        City city = cityDubboService.findCityByName(cityName);
        System.out.println(city.toString());
    }

    public User saveUser() {
        //ReferenceConfig 这个类的createProxy是用来生成远程服务的本地代理，最终交给RegistryProtocol来处理
       // DubboNamespaceHandler
        ApplicationContext context = ServiceBean.getSpringContext();
        User user = new User();
        user.setId(5);
        user.setUsername("Jackson");
        user.setPassword("admin@" + (i++));
        userService.saveUser(user);
        return user;
    }
}
