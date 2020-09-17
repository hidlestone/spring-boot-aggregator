package com.payn.cache.ehcache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @author: payn
 * @date: 2020/9/17 22:23
 */
@SpringBootApplication
@EnableCaching
public class SpringBootCacheEhcacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCacheEhcacheApplication.class, args);
	}
	
}
