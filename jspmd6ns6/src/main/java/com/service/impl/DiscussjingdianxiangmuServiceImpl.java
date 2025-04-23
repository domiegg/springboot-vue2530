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


import com.dao.DiscussjingdianxiangmuDao;
import com.entity.DiscussjingdianxiangmuEntity;
import com.service.DiscussjingdianxiangmuService;
import com.entity.vo.DiscussjingdianxiangmuVO;
import com.entity.view.DiscussjingdianxiangmuView;

@Service("discussjingdianxiangmuService")
public class DiscussjingdianxiangmuServiceImpl extends ServiceImpl<DiscussjingdianxiangmuDao, DiscussjingdianxiangmuEntity> implements DiscussjingdianxiangmuService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjingdianxiangmuEntity> page = this.selectPage(
                new Query<DiscussjingdianxiangmuEntity>(params).getPage(),
                new EntityWrapper<DiscussjingdianxiangmuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjingdianxiangmuEntity> wrapper) {
		  Page<DiscussjingdianxiangmuView> page =new Query<DiscussjingdianxiangmuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjingdianxiangmuVO> selectListVO(Wrapper<DiscussjingdianxiangmuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjingdianxiangmuVO selectVO(Wrapper<DiscussjingdianxiangmuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjingdianxiangmuView> selectListView(Wrapper<DiscussjingdianxiangmuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjingdianxiangmuView selectView(Wrapper<DiscussjingdianxiangmuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
