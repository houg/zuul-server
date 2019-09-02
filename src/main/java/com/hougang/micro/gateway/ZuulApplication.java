package com.hougang.micro.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Configuration;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;

/** 
* @Description: 路由启动类
* @version:V1.0
* @author: hougang_ahut@163.com
* @date: 2019年9月2日 下午5:00:59
*/ 
@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
@EnableApolloConfig
@Configuration
public class ZuulApplication {
	
	public static void main(String[] args) {
		 SpringApplication.run(ZuulApplication.class, args);

	}



	/**
	 * 解决上传文件重置问题
	 * @return
	 */
//	@Bean
//	public TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory(){
//		TomcatEmbeddedServletContainerFactory factory = new TomcatEmbeddedServletContainerFactory();
//
//		factory.addConnectorCustomizers((TomcatConnectorCustomizer) connector -> {
//			if(connector.getProtocolHandler() instanceof AbstractHttp11Protocol<?>){
//				( (AbstractHttp11Protocol<?>)connector.getProtocolHandler()).setMaxSwallowSize(-1);
//			}
//		});
//
//		return factory;
//	}

}
