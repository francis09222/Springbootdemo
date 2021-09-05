package com.francis.demo.service;

import java.util.List;

import com.francis.demo.entity.MemberEntity;

public interface MemberService {

	public List<MemberEntity> get();
	
	public void save(MemberEntity memberEntity);
	
}
