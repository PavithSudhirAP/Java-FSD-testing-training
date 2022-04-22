package com.ust1.spring.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/ust1/spring/springjdbc/config.xml");
		JdbcTemplate demo = (JdbcTemplate) ac.getBean("jdbcTemplate");
		String sql = "insert into employee values(?,?,?)";
		
		int res = demo.update(sql, 1, "John", "McClane");
		System.out.println("Number of records inserted:" + res);
		
//		int res2 = demo.update(sql, 2, "Jim", "Jam");
//		System.out.println("Number of records inserted:" + res2);
		
		
		
	}
}