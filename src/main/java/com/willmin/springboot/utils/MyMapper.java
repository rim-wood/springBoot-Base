package com.willmin.springboot.utils;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

	
/**
 * 继承自己的MyMapper
 * @author WLM
 * @date 2016年7月4日
 * @param <T>
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
	    //TODO
	    //FIXME 特别注意，该接口不能被扫描到，否则会出错
}
