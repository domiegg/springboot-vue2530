package com.dao;

import com.entity.YonghushangchuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YonghushangchuanVO;
import com.entity.view.YonghushangchuanView;


/**
 * 用户上传
 * 
 * @author 
 * @email 
 * @date 2022-04-28 17:06:53
 */
public interface YonghushangchuanDao extends BaseMapper<YonghushangchuanEntity> {
	
	List<YonghushangchuanVO> selectListVO(@Param("ew") Wrapper<YonghushangchuanEntity> wrapper);
	
	YonghushangchuanVO selectVO(@Param("ew") Wrapper<YonghushangchuanEntity> wrapper);
	
	List<YonghushangchuanView> selectListView(@Param("ew") Wrapper<YonghushangchuanEntity> wrapper);

	List<YonghushangchuanView> selectListView(Pagination page,@Param("ew") Wrapper<YonghushangchuanEntity> wrapper);
	
	YonghushangchuanView selectView(@Param("ew") Wrapper<YonghushangchuanEntity> wrapper);
	

}
