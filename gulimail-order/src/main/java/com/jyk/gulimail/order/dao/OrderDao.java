package com.jyk.gulimail.order.dao;

import com.jyk.gulimail.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author jyk
 * @email jyk@gmail.com
 * @date 2023-03-21 14:00:57
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
