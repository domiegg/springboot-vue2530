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


import com.dao.YonghushangchuanDao;
import com.entity.YonghushangchuanEntity;
import com.service.YonghushangchuanService;
import com.entity.vo.YonghushangchuanVO;
import com.entity.view.YonghushangchuanView;

@Service("yonghushangchuanService")
public class YonghushangchuanServiceImpl extends ServiceImpl<YonghushangchuanDao, YonghushangchuanEntity> implements YonghushangchuanService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YonghushangchuanEntity> page = this.selectPage(
                new Query<YonghushangchuanEntity>(params).getPage(),
                new EntityWrapper<YonghushangchuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YonghushangchuanEntity> wrapper) {
		  Page<YonghushangchuanView> page =new Query<YonghushangchuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YonghushangchuanVO> selectListVO(Wrapper<YonghushangchuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YonghushangchuanVO selectVO(Wrapper<YonghushangchuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YonghushangchuanView> selectListView(Wrapper<YonghushangchuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YonghushangchuanView selectView(Wrapper<YonghushangchuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
