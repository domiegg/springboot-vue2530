package com.dao;

import com.entity.JingdianxiangmuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JingdianxiangmuVO;
import com.entity.view.JingdianxiangmuView;


/**
 * 景点项目
 * 
 * @author 
 * @email 
 * @date 2022-04-28 17:06:53
 */
public interface JingdianxiangmuDao extends BaseMapper<JingdianxiangmuEntity> {
	
	List<JingdianxiangmuVO> selectListVO(@Param("ew") Wrapper<JingdianxiangmuEntity> wrapper);
	
	JingdianxiangmuVO selectVO(@Param("ew") Wrapper<JingdianxiangmuEntity> wrapper);
	
	List<JingdianxiangmuView> selectListView(@Param("ew") Wrapper<JingdianxiangmuEntity> wrapper);

	List<JingdianxiangmuView> selectListView(Pagination page,@Param("ew") Wrapper<JingdianxiangmuEntity> wrapper);
	
	JingdianxiangmuView selectView(@Param("ew") Wrapper<JingdianxiangmuEntity> wrapper);
	

}
