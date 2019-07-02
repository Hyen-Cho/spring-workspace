package kr.co.jhta.app;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.jhta.dao.CustomerDao;
import kr.co.jhta.vo.Customers;

public class CustomerApp {

	public static void main(String[] args) {
		String resource = "classpath:/META-INF/spring/context.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(resource);

		CustomerDao customerDao = ctx.getBean(CustomerDao.class);
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("\n");
			System.out.println("------------------------------------------------------");
			System.out.println("1.전체조회 2.검색 3.등록 4.수정 5.삭제 0.종료");
			System.out.println("------------------------------------------------------");
			
			System.out.print("메뉴선택> ");
			int menu = scanner.nextInt();
			
			if (menu == 1) {
				System.out.println("---전체조회---");
				
				List<Customers> customers = customerDao.getAllCustomers();
				for (Customers c : customers) {
					System.out.println("고객번호: " + c.getNo());
					System.out.println("고객이름: " + c.getName());
					System.out.println("닉 네 임: " + c.getNickname());
					System.out.println("전화번호: " + c.getTel());
					System.out.println("이 메 일: " + c.getEmail());
					System.out.println("사 는 곳: " + c.getCity());
					System.out.println("포 인 트: " + c.getPoint());
					System.out.println("가입일: " + c.getCreateDate());
					System.out.println();
				}
			} else if (menu == 2) {
				System.out.println("번호 입력: ");
				int no = scanner.nextInt();
				
				Customers customer = customerDao.getCustomerById(no);
				System.out.println("고객번호: " + customer.getNo());
				System.out.println("고객이름: " + customer.getName());
				System.out.println("닉 네 임: " + customer.getNickname());
				System.out.println("전화번호: " + customer.getTel());
				System.out.println("이 메 일: " + customer.getEmail());
				System.out.println("사 는 곳: " + customer.getCity());
				System.out.println("포 인 트: " + customer.getPoint());
				System.out.println("가입일: " + customer.getCreateDate());
				
				
			} else if (menu == 3) {
				
			} else if (menu == 4) {
				
			} else if (menu == 5) {
				
			} else if (menu == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
		}
		
	}
}
