package com.jyk.gulimail.member.dao;

import com.jyk.gulimail.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author jyk
 * @email jyk@gmail.com
 * @date 2023-03-21 13:56:47
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
