package com.spring.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.rest.model.DemoData;

@Repository
public interface DemoDataRepository extends JpaRepository<DemoData, Long> {
	

}
