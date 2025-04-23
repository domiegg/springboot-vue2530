package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YonghushangchuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YonghushangchuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YonghushangchuanView;


/**
 * 用户上传
 *
 * @author 
 * @email 
 * @date 2022-04-28 17:06:53
 */
public interface YonghushangchuanService extends IService<YonghushangchuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YonghushangchuanVO> selectListVO(Wrapper<YonghushangchuanEntity> wrapper);
   	
   	YonghushangchuanVO selectVO(@Param("ew") Wrapper<YonghushangchuanEntity> wrapper);
   	
   	List<YonghushangchuanView> selectListView(Wrapper<YonghushangchuanEntity> wrapper);
   	
   	YonghushangchuanView selectView(@Param("ew") Wrapper<YonghushangchuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YonghushangchuanEntity> wrapper);
   	

}

