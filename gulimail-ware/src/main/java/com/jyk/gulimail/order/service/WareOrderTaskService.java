package com.jyk.gulimail.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jyk.common.utils.PageUtils;
import com.jyk.gulimail.order.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author jyk
 * @email jyk@gmail.com
 * @date 2023-03-21 14:24:19
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

