package com.jyk.gulimail.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jyk.common.utils.PageUtils;
import com.jyk.gulimail.coupon.entity.HomeAdvEntity;

import java.util.Map;

/**
 * 首页轮播广告
 *
 * @author jyk
 * @email jyk@gmail.com
 * @date 2023-03-21 13:45:35
 */
public interface HomeAdvService extends IService<HomeAdvEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

