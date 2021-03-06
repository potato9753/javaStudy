package com.app5_의존성감소;

import java.util.List;

import com.app5_의존성감소.DBService;
import com.app5_의존성감소.OracleDAO;

public class TestMain {

	public static void main(String[] args) {
		
		DBService service = new DBService();
		
		service.setDB(new MySQLDAO());
		List<String> list = service.list();
		System.out.println(list); 
		
		service.setDB(new OracleDAO()); // DB 변경시 DAO클래스와 Service클래스를 변경해야 사용 가능하다
		list = service.list();
		System.out.println(list);
	}

}
