package com.jyk.gulimail.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jyk.common.utils.PageUtils;
import com.jyk.gulimail.coupon.entity.MemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author jyk
 * @email jyk@gmail.com
 * @date 2023-03-21 13:45:35
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

