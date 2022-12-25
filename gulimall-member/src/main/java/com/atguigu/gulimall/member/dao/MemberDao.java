package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author huyelong
 * @email huyelong312@gmail.com
 * @date 2022-12-24 20:48:19
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
