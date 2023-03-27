package com.jyk.gulimail.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jyk.common.utils.PageUtils;
import com.jyk.gulimail.order.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author jyk
 * @email jyk@gmail.com
 * @date 2023-03-21 14:24:19
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

