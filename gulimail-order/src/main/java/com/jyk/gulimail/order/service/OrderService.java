package com.jyk.gulimail.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jyk.common.utils.PageUtils;
import com.jyk.gulimail.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author jyk
 * @email jyk@gmail.com
 * @date 2023-03-21 14:00:57
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

