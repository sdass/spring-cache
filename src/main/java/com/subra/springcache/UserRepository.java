package com.subra.springcache;

import javax.jws.soap.SOAPBinding.Use;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.lang.String;
import com.subra.springcache.User;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	//List<User> findByName(String name);
	User findByName(String name);
}
