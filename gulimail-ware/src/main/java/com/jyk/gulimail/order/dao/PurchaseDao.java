package com.jyk.gulimail.order.dao;

import com.jyk.gulimail.order.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author jyk
 * @email jyk@gmail.com
 * @date 2023-03-21 14:24:19
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
