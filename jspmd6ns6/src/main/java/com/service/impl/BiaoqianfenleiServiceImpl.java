package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.BiaoqianfenleiDao;
import com.entity.BiaoqianfenleiEntity;
import com.service.BiaoqianfenleiService;
import com.entity.vo.BiaoqianfenleiVO;
import com.entity.view.BiaoqianfenleiView;

@Service("biaoqianfenleiService")
public class BiaoqianfenleiServiceImpl extends ServiceImpl<BiaoqianfenleiDao, BiaoqianfenleiEntity> implements BiaoqianfenleiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BiaoqianfenleiEntity> page = this.selectPage(
                new Query<BiaoqianfenleiEntity>(params).getPage(),
                new EntityWrapper<BiaoqianfenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BiaoqianfenleiEntity> wrapper) {
		  Page<BiaoqianfenleiView> page =new Query<BiaoqianfenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BiaoqianfenleiVO> selectListVO(Wrapper<BiaoqianfenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BiaoqianfenleiVO selectVO(Wrapper<BiaoqianfenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BiaoqianfenleiView> selectListView(Wrapper<BiaoqianfenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BiaoqianfenleiView selectView(Wrapper<BiaoqianfenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
