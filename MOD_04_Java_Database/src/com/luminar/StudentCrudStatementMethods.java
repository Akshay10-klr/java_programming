package com.luminar;

//step 1:import jdbc api
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class StudentCrudStatementMethods {
	static Connection conn=null;
	static Statement stmt=null;
	static ResultSet rs=null;
	public static Connection connect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// step 3:establish connection
			 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/luminar_java", "root", "mysql");
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return conn;
	}
//=========================insert===================
	
	

	
//=========================retrieve===================
public static void view() {
	conn=connect();
	try {
		// step 2:lead register and driver
		
		 stmt = conn.createStatement();
		 rs = stmt.executeQuery("select * from doctors");
		System.out.println("DOCTOR ID\tDOCTOR NAME\tDOCTOR SALARY\n================================================");
		while (rs.next()) {
			System.out.println("\t"+rs.getInt(1)+"\t"+rs.getString(2)+"\t\t"+rs.getFloat(3));

		}
	
		rs.close();
		stmt.close();
		conn.close();
	} catch (Exception ex) {
		ex.printStackTrace();
}
}	
//=========================update===================

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String doctorName;
		float doctorSalary;
		
		System.out.println("enter the doctor name");
		doctorName=sc.nextLine();
		
		System.out.println("enter the doctor Salary");
		doctorSalary=sc.nextFloat();
		
		insert(doctorName,doctorSalary);
		view();
		
		
		}

	}


