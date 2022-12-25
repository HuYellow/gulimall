package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author huyelong
 * @email huyelong312@gmail.com
 * @date 2022-12-24 20:35:18
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
