package com.jyk.gulimail.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jyk.common.utils.PageUtils;
import com.jyk.gulimail.member.entity.MemberCollectSubjectEntity;

import java.util.Map;

/**
 * 会员收藏的专题活动
 *
 * @author jyk
 * @email jyk@gmail.com
 * @date 2023-03-21 13:56:47
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

