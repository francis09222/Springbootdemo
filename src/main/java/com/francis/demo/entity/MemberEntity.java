package com.francis.demo.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class MemberEntity implements Serializable {

	private static final long serialVersionUID = 7656863163956895388L;

	private String id;
	
	private String name;
	
}
