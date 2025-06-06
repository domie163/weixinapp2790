package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhishidianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhishidianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhishidianView;


/**
 * 知识点
 *
 * @author 
 * @email 
 * @date 2021-04-12 14:19:38
 */
public interface ZhishidianService extends IService<ZhishidianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhishidianVO> selectListVO(Wrapper<ZhishidianEntity> wrapper);
   	
   	ZhishidianVO selectVO(@Param("ew") Wrapper<ZhishidianEntity> wrapper);
   	
   	List<ZhishidianView> selectListView(Wrapper<ZhishidianEntity> wrapper);
   	
   	ZhishidianView selectView(@Param("ew") Wrapper<ZhishidianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhishidianEntity> wrapper);
   	
}

