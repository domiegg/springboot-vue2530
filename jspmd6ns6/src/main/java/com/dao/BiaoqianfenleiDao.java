package com.dao;

import com.entity.BiaoqianfenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BiaoqianfenleiVO;
import com.entity.view.BiaoqianfenleiView;


/**
 * 标签分类
 * 
 * @author 
 * @email 
 * @date 2022-04-28 17:06:53
 */
public interface BiaoqianfenleiDao extends BaseMapper<BiaoqianfenleiEntity> {
	
	List<BiaoqianfenleiVO> selectListVO(@Param("ew") Wrapper<BiaoqianfenleiEntity> wrapper);
	
	BiaoqianfenleiVO selectVO(@Param("ew") Wrapper<BiaoqianfenleiEntity> wrapper);
	
	List<BiaoqianfenleiView> selectListView(@Param("ew") Wrapper<BiaoqianfenleiEntity> wrapper);

	List<BiaoqianfenleiView> selectListView(Pagination page,@Param("ew") Wrapper<BiaoqianfenleiEntity> wrapper);
	
	BiaoqianfenleiView selectView(@Param("ew") Wrapper<BiaoqianfenleiEntity> wrapper);
	

}
