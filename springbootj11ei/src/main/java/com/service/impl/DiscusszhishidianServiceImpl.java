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


import com.dao.DiscusszhishidianDao;
import com.entity.DiscusszhishidianEntity;
import com.service.DiscusszhishidianService;
import com.entity.vo.DiscusszhishidianVO;
import com.entity.view.DiscusszhishidianView;

@Service("discusszhishidianService")
public class DiscusszhishidianServiceImpl extends ServiceImpl<DiscusszhishidianDao, DiscusszhishidianEntity> implements DiscusszhishidianService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusszhishidianEntity> page = this.selectPage(
                new Query<DiscusszhishidianEntity>(params).getPage(),
                new EntityWrapper<DiscusszhishidianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusszhishidianEntity> wrapper) {
		  Page<DiscusszhishidianView> page =new Query<DiscusszhishidianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusszhishidianVO> selectListVO(Wrapper<DiscusszhishidianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusszhishidianVO selectVO(Wrapper<DiscusszhishidianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusszhishidianView> selectListView(Wrapper<DiscusszhishidianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusszhishidianView selectView(Wrapper<DiscusszhishidianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
