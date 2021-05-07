package com.thepirates.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
//DB의 테이블과 같음
@Entity
public class Customer {
	@Id//primary key
	//generationType.identity는 시퀀스값주는것
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	@Column(length=1024)//컬럼 크기 부여하는것
	private String address;
}
