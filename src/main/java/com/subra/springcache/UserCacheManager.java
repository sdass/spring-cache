package com.subra.springcache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Configuration
@Service
@CacheConfig(cacheNames ={"USERS_CAHE"})
public class UserCacheManager {

	@Autowired
	UserRepository repo;
	
	@Cacheable(value="USERS_CAHE", key="#name") //with or without #
	public User getUserFromCache(String name){
		System.out.println("Retrieving from database name =" + name );
		return repo.findByName(name);
	}
	//https://stackoverflow.com/questions/55482051/spring-boot-native-cache-how-to-expire-remove-cache-data-by-individual-keys-el
	@CacheEvict(cacheNames={"USERS_CAHE"}, allEntries=true, beforeInvocation=true)
	public void evictAllCache(){
		System.out.println("Evitcting cache of all user...");
		
	}
}
