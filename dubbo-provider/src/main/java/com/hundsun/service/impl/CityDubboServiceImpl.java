package com.hundsun.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.hundsun.domain.City;
import com.hundsun.service.CityDubboService;

/**
 * 城市业务 Dubbo 服务层实现层
 *
 * 注册为 Dubbo 服务
 */
@Service(version = "1.0.0")
public class CityDubboServiceImpl implements CityDubboService {

    @Override
    public City findCityByName(String cityName) {
        return new City(1L,2L,"广州","是我的故乡");
    }
}
