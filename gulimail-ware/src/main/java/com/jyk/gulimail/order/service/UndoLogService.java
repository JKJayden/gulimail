package com.jyk.gulimail.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jyk.common.utils.PageUtils;
import com.jyk.gulimail.order.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author jyk
 * @email jyk@gmail.com
 * @date 2023-03-21 14:24:19
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

