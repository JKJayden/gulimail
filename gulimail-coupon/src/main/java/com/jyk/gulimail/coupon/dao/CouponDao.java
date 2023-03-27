package com.jyk.gulimail.coupon.dao;

import com.jyk.gulimail.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author jyk
 * @email jyk@gmail.com
 * @date 2023-03-21 13:45:35
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
