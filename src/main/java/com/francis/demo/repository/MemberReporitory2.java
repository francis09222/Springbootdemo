package com.francis.demo.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.francis.demo.entity.MemberEntity;

@Repository
public interface MemberReporitory2 extends JpaRepository<MemberEntity,String > {
	
	@Query(value="SELECT D FROM MemberEntity D",nativeQuery = false)
	public List<MemberEntity> getAll();
	
}
