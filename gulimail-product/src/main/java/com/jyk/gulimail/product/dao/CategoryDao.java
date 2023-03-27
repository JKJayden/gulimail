package com.jyk.gulimail.product.dao;

import com.jyk.gulimail.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author jyk
 * @email jyk@gmail.com
 * @date 2023-03-21 00:03:13
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
