package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusslvyouluxianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusslvyouluxianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusslvyouluxianView;


/**
 * 旅游路线评论表
 *
 * @author 
 * @email 
 * @date 2022-04-28 17:06:54
 */
public interface DiscusslvyouluxianService extends IService<DiscusslvyouluxianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusslvyouluxianVO> selectListVO(Wrapper<DiscusslvyouluxianEntity> wrapper);
   	
   	DiscusslvyouluxianVO selectVO(@Param("ew") Wrapper<DiscusslvyouluxianEntity> wrapper);
   	
   	List<DiscusslvyouluxianView> selectListView(Wrapper<DiscusslvyouluxianEntity> wrapper);
   	
   	DiscusslvyouluxianView selectView(@Param("ew") Wrapper<DiscusslvyouluxianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusslvyouluxianEntity> wrapper);
   	

}

