package com.hougang.micro.gateway.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;


/** 
* @Description: 实现用户鉴权 
* @version:v1.0
* @author: hougang_ahut@163.com
* @date: 2019年9月2日 下午4:54:32
*/ 
@Component
public class TokenFilter extends ZuulFilter{
	private static Logger LOGGER = LoggerFactory.getLogger(TokenFilter.class);



	@Override
	public Object run() throws ZuulException {
		//zuul 使用时，上下文对象RequestContext，是共享的。 所以通过RequestContext 获取值
		
		return null;
	}





	/**
	 * 过滤器是否生效
	 * @return
	 */
	@Override
	public boolean shouldFilter() {
		//拦截
		return true;
	}

	@Override
	public int filterOrder() {
		return 10;
	}

	/**
	 * 前置过滤器
	 * @return
	 */
	@Override
	public String filterType() {
		return "error";
	}

}
