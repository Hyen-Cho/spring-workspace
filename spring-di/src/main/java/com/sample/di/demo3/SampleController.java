package com.sample.di.demo3;

public class SampleController {

	// SampleDao가 필요해
	private SampleDao dao;
	
	public void setDao(SampleDao dao) {
		this.dao = dao;
	}
	
	public void add(String id, String password) {
		// 등록작업 처리
		// SampleDao의 insert기능 사용한다.
		dao.insert(id, password);
	}
}
