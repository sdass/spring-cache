package com.subra.springcache;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.cache.Cache;

@RestController
@RequestMapping(value="/rest/search")
public class TryController {
	
	@Autowired
	UserCacheManager userCacheManager;
	
	@Autowired
	CacheManager cachemanager;
	
	
	@Autowired
	UserRepository repo; //just to see /all names to test cache by curl
	
	@GetMapping(value="/{name}") 
	@ResponseBody
	public User getUser(@PathVariable("name") String name){
		
		User u =  userCacheManager.getUserFromCache(name);
		
		System.out.println("Retrieving getUser at controller " + u);
		return u;	
	}
	
	/*
	@GetMapping(value="inspect/{name}") 
	@ResponseBody
	public User getUserInspect(@PathVariable("name") String name){
		
		
		Cache cache =  cachemanager.getCache("USERS_CAHE");
		cache.
		//User u =  userCacheManager.getUserFromCache(name);
		
		System.out.println("getUserInspect: Retrieving getUser at controller " + u);
		return u;
		
	}
		*/
	
	
	@GetMapping(value="/all") 
	@ResponseBody
	public List<User> getUser(){
		
		List<User> users =  repo.findAll(); //direct no cache to ease testing
		for(User u : users){
			System.out.println("Retrieving getUser at controller " + u);			
		}

		return users;
		
	}

}
