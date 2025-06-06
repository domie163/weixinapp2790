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


import com.dao.ZhishidianDao;
import com.entity.ZhishidianEntity;
import com.service.ZhishidianService;
import com.entity.vo.ZhishidianVO;
import com.entity.view.ZhishidianView;

@Service("zhishidianService")
public class ZhishidianServiceImpl extends ServiceImpl<ZhishidianDao, ZhishidianEntity> implements ZhishidianService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhishidianEntity> page = this.selectPage(
                new Query<ZhishidianEntity>(params).getPage(),
                new EntityWrapper<ZhishidianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhishidianEntity> wrapper) {
		  Page<ZhishidianView> page =new Query<ZhishidianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhishidianVO> selectListVO(Wrapper<ZhishidianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhishidianVO selectVO(Wrapper<ZhishidianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhishidianView> selectListView(Wrapper<ZhishidianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhishidianView selectView(Wrapper<ZhishidianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
