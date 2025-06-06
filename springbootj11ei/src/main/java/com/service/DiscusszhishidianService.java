package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusszhishidianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusszhishidianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusszhishidianView;


/**
 * 知识点评论表
 *
 * @author 
 * @email 
 * @date 2021-04-12 14:19:39
 */
public interface DiscusszhishidianService extends IService<DiscusszhishidianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusszhishidianVO> selectListVO(Wrapper<DiscusszhishidianEntity> wrapper);
   	
   	DiscusszhishidianVO selectVO(@Param("ew") Wrapper<DiscusszhishidianEntity> wrapper);
   	
   	List<DiscusszhishidianView> selectListView(Wrapper<DiscusszhishidianEntity> wrapper);
   	
   	DiscusszhishidianView selectView(@Param("ew") Wrapper<DiscusszhishidianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusszhishidianEntity> wrapper);
   	
}

