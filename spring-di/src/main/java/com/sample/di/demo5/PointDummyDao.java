package com.sample.di.demo5;

public class PointDummyDao implements PointDao{

	public void updatePoint(String id, int point) {
		System.out.println(id + "님" + point + "포인트 증가되었습니다.");
		
	}
}
