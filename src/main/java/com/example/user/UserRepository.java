package com.example.user;

import java.util.List;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


public interface UserRepository extends CrudRepository<UserModel, String> {

	@Query("from UserModel u where u.client_id = 2")
	List<UserModel> findBySearchTerm(@Param("id") String id);
		
}
