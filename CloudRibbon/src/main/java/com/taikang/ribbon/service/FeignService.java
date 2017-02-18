package com.taikang.ribbon.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.taikang.ribbon.configuration.MyFeignConfiguration;

@FeignClient(name="hystrix",configuration=MyFeignConfiguration.class)
public interface FeignService {

	@RequestMapping("/helloSpringBoot")
	public String hello();
	
}
