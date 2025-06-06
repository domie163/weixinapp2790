package com.dao;

import com.entity.ZhishidianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhishidianVO;
import com.entity.view.ZhishidianView;


/**
 * 知识点
 * 
 * @author 
 * @email 
 * @date 2021-04-12 14:19:38
 */
public interface ZhishidianDao extends BaseMapper<ZhishidianEntity> {
	
	List<ZhishidianVO> selectListVO(@Param("ew") Wrapper<ZhishidianEntity> wrapper);
	
	ZhishidianVO selectVO(@Param("ew") Wrapper<ZhishidianEntity> wrapper);
	
	List<ZhishidianView> selectListView(@Param("ew") Wrapper<ZhishidianEntity> wrapper);

	List<ZhishidianView> selectListView(Pagination page,@Param("ew") Wrapper<ZhishidianEntity> wrapper);
	
	ZhishidianView selectView(@Param("ew") Wrapper<ZhishidianEntity> wrapper);
	
}
