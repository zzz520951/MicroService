package com.zzz.myrule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;

@Configuration
public class MySelfRule {
	
	@Bean
	public IRule mySelfRule() {
		
		return new RoundRobinRule();
		//return new RondomRule_ZZZ();
	}

}
