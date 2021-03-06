package com.gaurav.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gaurav.dao.EmployeeDao;
import com.gaurav.dao.PlayerDao;
import com.gaurav.dao.config.JdbcConfig;
import com.gaurav.model.Employee;
import com.gaurav.model.Player;

public class SpringJdbcMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);

		PlayerDao playerDao = (PlayerDao) context.getBean("playerDao");

//		playerDao.addPlayer(new Player(122,"kesagaurav",23,"male","warnagal","cricket","129109101",1));
//		System.out.println("\n Player added");

		// Player player=playerDao.getPlayerById(107);
		// System.out.println(player);

		// playerDao.deletePlayer(121);

		// String name="gaurav";
		// int id=23;
		// playerDao.updatePlayer(name, id);

//		
		List<Player> playerList = playerDao.getAllPlayers();
		playerList.stream().forEach(e -> System.out.println(e));

//	
		EmployeeDao employeeDao = (EmployeeDao) context.getBean("EmployeeDao");
//	employeeDao.addEmployee(new Employee(7,"sutya","80000","ifg"));
//	System.out.println("employee added successfully");
//	
		employeeDao.deleteEmployee(2);
		Employee employee = new Employee();
		employee.setEmpid(1);
		employee.setSalarly("100000");
		employee.setDesignation("powerprogrammer");

		employeeDao.updateEmployee(employee);
		// System.out.println(updateEmployee1);

		System.out.println("\n the list of employees");
		List<Employee> empList = employeeDao.getAllEmployees();
		empList.stream().forEach(g -> System.out.println(g));

		System.out.println("\n the employee with id 3 are");
		Employee e = employeeDao.getEmployeeById(3);
		System.out.println(e);
//	
//	List<Player> playersBySportsName = playerDao.getPlayersBySportsName("cricket");
//	System.out.println(playersBySportsName);

		System.out.println("the employee with name gaurav are");
		List<Employee> byNames = employeeDao.getByNames("gaurav");
		System.out.println(byNames);

		System.out.println("\n player with city are");
		List<Player> playersByCity = playerDao.getPlayersByCity("warnagal");
		System.out.println(playersByCity);

		System.out.println("\n player with age");
		List<Player> age = playerDao.getPlayersByAge(23);
		System.out.println(age);
		
		System.out.println("\n player with gender");
		List<Player> playersByGender = playerDao.getPlayersByGender("male");
		System.out.println(playersByGender);
		
		System.out.println("deleted the id with 7");
		employeeDao.deleteEmployee(7);
		
	}

}
