package com.zzz.springcloud;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.zzz.springcloud"})
@ComponentScan("com.zzz.springcloud")
public class DeptConsumer80Feign_App
{
	public static void main(String[] args)
	{
		SpringApplication.run(DeptConsumer80Feign_App.class, args);
	}
}
