package com.sample.di.demo5;

public class UserService {

	private UserDao userDao;
	private PointDao pointDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	public void setPointDao(PointDao pointDao) {
		this.pointDao = pointDao;
	}
	
	void addNewUser(String name, String id, String password) {
		// 신규 회원 등록 기능
		userDao.insertUser(name, id, password);
		// 신규 회원의 표인트를 10으로 변경하는 기능
		pointDao.updatePoint(id, 10);
		
	}
}
