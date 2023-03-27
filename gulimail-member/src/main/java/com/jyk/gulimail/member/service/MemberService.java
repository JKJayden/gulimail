package com.jyk.gulimail.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jyk.common.utils.PageUtils;
import com.jyk.gulimail.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author jyk
 * @email jyk@gmail.com
 * @date 2023-03-21 13:56:47
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

