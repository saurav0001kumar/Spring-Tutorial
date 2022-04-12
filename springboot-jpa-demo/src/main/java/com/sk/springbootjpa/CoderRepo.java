package com.sk.springbootjpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sk.springbootjpa.models.Coder;

public interface CoderRepo extends JpaRepository<Coder, Integer> {

	List<Coder> findByCnameOrderByCidDesc(String cname); // Query DSL

	// ----------OR----------------------------------------------------

	@Query("from Coder where cname= :name order by cid desc")
	List<Coder> find(@Param("name") String cname); // Query Annotation

}
