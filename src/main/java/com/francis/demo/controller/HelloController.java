package com.francis.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.francis.demo.entity.MemberEntity;
import com.francis.demo.service.MemberService;

@RestController
@RequestMapping("/api")
public class HelloController {

	@Autowired
	private MemberService memberService;
	
	@GetMapping("/hello")
	public String sayHello() {
		MemberEntity memberEntity = new MemberEntity();
		memberEntity.setName("Mary");
		memberService.save(memberEntity);
		return "Hello";
	}
	
	@PostMapping("/hello")
	public List<MemberEntity> get(){
		return memberService.get();
	}
	
}
