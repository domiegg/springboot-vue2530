package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjingdianxiangmuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjingdianxiangmuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjingdianxiangmuView;


/**
 * 景点项目评论表
 *
 * @author 
 * @email 
 * @date 2022-04-28 17:06:54
 */
public interface DiscussjingdianxiangmuService extends IService<DiscussjingdianxiangmuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjingdianxiangmuVO> selectListVO(Wrapper<DiscussjingdianxiangmuEntity> wrapper);
   	
   	DiscussjingdianxiangmuVO selectVO(@Param("ew") Wrapper<DiscussjingdianxiangmuEntity> wrapper);
   	
   	List<DiscussjingdianxiangmuView> selectListView(Wrapper<DiscussjingdianxiangmuEntity> wrapper);
   	
   	DiscussjingdianxiangmuView selectView(@Param("ew") Wrapper<DiscussjingdianxiangmuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjingdianxiangmuEntity> wrapper);
   	

}

