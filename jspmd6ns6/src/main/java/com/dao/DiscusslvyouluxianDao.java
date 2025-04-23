package com.dao;

import com.entity.DiscusslvyouluxianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusslvyouluxianVO;
import com.entity.view.DiscusslvyouluxianView;


/**
 * 旅游路线评论表
 * 
 * @author 
 * @email 
 * @date 2022-04-28 17:06:54
 */
public interface DiscusslvyouluxianDao extends BaseMapper<DiscusslvyouluxianEntity> {
	
	List<DiscusslvyouluxianVO> selectListVO(@Param("ew") Wrapper<DiscusslvyouluxianEntity> wrapper);
	
	DiscusslvyouluxianVO selectVO(@Param("ew") Wrapper<DiscusslvyouluxianEntity> wrapper);
	
	List<DiscusslvyouluxianView> selectListView(@Param("ew") Wrapper<DiscusslvyouluxianEntity> wrapper);

	List<DiscusslvyouluxianView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusslvyouluxianEntity> wrapper);
	
	DiscusslvyouluxianView selectView(@Param("ew") Wrapper<DiscusslvyouluxianEntity> wrapper);
	

}
