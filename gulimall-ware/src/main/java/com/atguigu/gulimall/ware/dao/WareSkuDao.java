package com.atguigu.gulimall.ware.dao;

import com.atguigu.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author huyelong
 * @email huyelong312@gmail.com
 * @date 2022-12-24 21:03:55
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
