package com.subra.springcache;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class H2DataLoader {

	@Autowired
	UserRepository repo;
	
	@PostConstruct
	public void loadData(){
		List<User> userList = new ArrayList<>(getData());
		repo.saveAll(userList);
	}
	
	private List<User>  getData(){
		List<User>  l = new ArrayList<>();
		l.add(new User("abc", "Nike", 5555.0));
		l.add(new User("gev", "Rad", 666.0));
		l.add(new User("mkc", "Sony", 333.0));
		l.add(new User("ttt", "Kiwi", 999.0));
		
		return l;
	}
}
