package com.dao;

import com.entity.DiscusszhishidianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusszhishidianVO;
import com.entity.view.DiscusszhishidianView;


/**
 * 知识点评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-12 14:19:39
 */
public interface DiscusszhishidianDao extends BaseMapper<DiscusszhishidianEntity> {
	
	List<DiscusszhishidianVO> selectListVO(@Param("ew") Wrapper<DiscusszhishidianEntity> wrapper);
	
	DiscusszhishidianVO selectVO(@Param("ew") Wrapper<DiscusszhishidianEntity> wrapper);
	
	List<DiscusszhishidianView> selectListView(@Param("ew") Wrapper<DiscusszhishidianEntity> wrapper);

	List<DiscusszhishidianView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusszhishidianEntity> wrapper);
	
	DiscusszhishidianView selectView(@Param("ew") Wrapper<DiscusszhishidianEntity> wrapper);
	
}
