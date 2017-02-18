package com.taikang.ribbon.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.RetryableException;
import feign.Retryer;

@Configuration
public class MyFeignConfiguration {

	@Bean
	public Retryer getRetryer(){
		return new Retryer(){

			@Override
			public void continueOrPropagate(RetryableException e) {
				
				throw e;
				
			}

			@Override
			public Retryer clone() {
				
				return this;
			}
			
		};
		
	}
}
