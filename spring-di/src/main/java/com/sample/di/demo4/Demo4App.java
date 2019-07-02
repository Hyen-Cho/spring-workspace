package com.sample.di.demo4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo4App {

	public static void main(String[] args) {
		String resourse = "classpath:/com/sample/di/demo4/demo4.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(resourse);
		
		EventNoticeService s1 =  ctx.getBean("event", EventNoticeService.class);
		OrderService s2 =  ctx.getBean("order", OrderService.class);
		
		s1.notice("홈페이지가 등록되었습니다.");
		s2.sendOrderStatus();
	}
}
