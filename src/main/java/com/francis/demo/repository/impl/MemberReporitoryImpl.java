package com.francis.demo.repository.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.francis.demo.entity.MemberEntity;
import com.francis.demo.repository.MemberReporitory;

@Component
public class MemberReporitoryImpl implements MemberReporitory {

	@Override
	public List<MemberEntity> get() {

		List<MemberEntity> lists = new ArrayList<>();

		MemberEntity me1 = new MemberEntity();

		me1.setId("1");
		me1.setName("ali");

		lists.add(me1);

		return lists;
	}

}
