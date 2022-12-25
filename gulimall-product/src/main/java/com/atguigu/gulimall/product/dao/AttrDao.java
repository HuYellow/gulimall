package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author huyelong
 * @email huyelong312@gmail.com
 * @date 2022-12-24 00:13:20
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
