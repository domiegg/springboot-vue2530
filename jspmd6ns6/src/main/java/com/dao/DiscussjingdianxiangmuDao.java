package com.dao;

import com.entity.DiscussjingdianxiangmuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjingdianxiangmuVO;
import com.entity.view.DiscussjingdianxiangmuView;


/**
 * 景点项目评论表
 * 
 * @author 
 * @email 
 * @date 2022-04-28 17:06:54
 */
public interface DiscussjingdianxiangmuDao extends BaseMapper<DiscussjingdianxiangmuEntity> {
	
	List<DiscussjingdianxiangmuVO> selectListVO(@Param("ew") Wrapper<DiscussjingdianxiangmuEntity> wrapper);
	
	DiscussjingdianxiangmuVO selectVO(@Param("ew") Wrapper<DiscussjingdianxiangmuEntity> wrapper);
	
	List<DiscussjingdianxiangmuView> selectListView(@Param("ew") Wrapper<DiscussjingdianxiangmuEntity> wrapper);

	List<DiscussjingdianxiangmuView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjingdianxiangmuEntity> wrapper);
	
	DiscussjingdianxiangmuView selectView(@Param("ew") Wrapper<DiscussjingdianxiangmuEntity> wrapper);
	

}
