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


import com.dao.JingdianxiangmuDao;
import com.entity.JingdianxiangmuEntity;
import com.service.JingdianxiangmuService;
import com.entity.vo.JingdianxiangmuVO;
import com.entity.view.JingdianxiangmuView;

@Service("jingdianxiangmuService")
public class JingdianxiangmuServiceImpl extends ServiceImpl<JingdianxiangmuDao, JingdianxiangmuEntity> implements JingdianxiangmuService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JingdianxiangmuEntity> page = this.selectPage(
                new Query<JingdianxiangmuEntity>(params).getPage(),
                new EntityWrapper<JingdianxiangmuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JingdianxiangmuEntity> wrapper) {
		  Page<JingdianxiangmuView> page =new Query<JingdianxiangmuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JingdianxiangmuVO> selectListVO(Wrapper<JingdianxiangmuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JingdianxiangmuVO selectVO(Wrapper<JingdianxiangmuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JingdianxiangmuView> selectListView(Wrapper<JingdianxiangmuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JingdianxiangmuView selectView(Wrapper<JingdianxiangmuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
