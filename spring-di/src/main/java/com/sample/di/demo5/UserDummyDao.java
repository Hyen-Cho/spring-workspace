package com.sample.di.demo5;

public class UserDummyDao implements UserDao{

	public void insertUser(String name, String id, String password) {
		System.out.println("신규 회원 등록");
		System.out.println("회원 이름 : " + name);
		System.out.println("아 이 디 : " + id);
		System.out.println("비밀 번호 : " + password);
		
	}
}
