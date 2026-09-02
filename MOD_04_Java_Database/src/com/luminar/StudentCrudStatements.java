package com.luminar;

//step 1:import jdbc api
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
//database is already created using mysql
public class StudentCrudStatements {

	public static void main(String[] args) {
		try {
			// step 2:lead register and driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// step 3:establish connection
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/luminar_java", "root", "mysql");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from doctors");
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

}
