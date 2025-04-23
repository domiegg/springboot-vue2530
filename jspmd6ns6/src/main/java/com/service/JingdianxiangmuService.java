package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JingdianxiangmuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JingdianxiangmuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JingdianxiangmuView;


/**
 * 景点项目
 *
 * @author 
 * @email 
 * @date 2022-04-28 17:06:53
 */
public interface JingdianxiangmuService extends IService<JingdianxiangmuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JingdianxiangmuVO> selectListVO(Wrapper<JingdianxiangmuEntity> wrapper);
   	
   	JingdianxiangmuVO selectVO(@Param("ew") Wrapper<JingdianxiangmuEntity> wrapper);
   	
   	List<JingdianxiangmuView> selectListView(Wrapper<JingdianxiangmuEntity> wrapper);
   	
   	JingdianxiangmuView selectView(@Param("ew") Wrapper<JingdianxiangmuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JingdianxiangmuEntity> wrapper);
   	

}

