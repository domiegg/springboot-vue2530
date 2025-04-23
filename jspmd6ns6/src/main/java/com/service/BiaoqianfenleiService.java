package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BiaoqianfenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BiaoqianfenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BiaoqianfenleiView;


/**
 * 标签分类
 *
 * @author 
 * @email 
 * @date 2022-04-28 17:06:53
 */
public interface BiaoqianfenleiService extends IService<BiaoqianfenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BiaoqianfenleiVO> selectListVO(Wrapper<BiaoqianfenleiEntity> wrapper);
   	
   	BiaoqianfenleiVO selectVO(@Param("ew") Wrapper<BiaoqianfenleiEntity> wrapper);
   	
   	List<BiaoqianfenleiView> selectListView(Wrapper<BiaoqianfenleiEntity> wrapper);
   	
   	BiaoqianfenleiView selectView(@Param("ew") Wrapper<BiaoqianfenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BiaoqianfenleiEntity> wrapper);
   	

}

