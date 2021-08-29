package com.francis.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.francis.demo.entity.MemberEntity;
import com.francis.demo.repository.MemberReporitory;
import com.francis.demo.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberReporitory memberReporitory;

	@Override
	public List<MemberEntity> get() {
		return memberReporitory.get();
	}

}
