package com.entity.view;

import com.entity.DiscusszhishidianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 知识点评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-12 14:19:39
 */
@TableName("discusszhishidian")
public class DiscusszhishidianView  extends DiscusszhishidianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusszhishidianView(){
	}
 
 	public DiscusszhishidianView(DiscusszhishidianEntity discusszhishidianEntity){
 	try {
			BeanUtils.copyProperties(this, discusszhishidianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
