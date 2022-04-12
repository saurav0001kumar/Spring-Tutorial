package com.sk.springbootaop;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sk.springbootaop.models.Coder;

public interface CoderRepo extends JpaRepository<Coder, Integer> {

	List<Coder> findByCnameOrderByCidDesc(String cname); // Query DSL

	// ----------OR-----------------------------------------------------

	@Query("from Coder where cname= :name order by cid desc")
	List<Coder> find(@Param("name") String cname); // Query Annotation

	// --for ascending order---------------------------------------------
	@Query("from Coder order by cid asc")
	List<Coder> getAllRowsAsc(); // Query Annotation

}
