package com.srm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedDatabaseDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int regno = sc.nextInt();
		String connectionUrl = "jdbc:mysql://localhost:3307/srm";
		String userName = "root";
		String password = "Amar@1953";
		String query = "select * from student where regno=?";
		// Class.forName("com.mysql.cj.jdbc.Driver");
		try (Connection connection = DriverManager.getConnection(connectionUrl, userName, password);
				PreparedStatement statement = connection.prepareStatement(query)) {
			statement.setInt(1, regno)
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				System.out.print(resultSet.getInt(1));
				System.out.print("\t" + resultSet.getString(2));
				System.out.print("\t" + resultSet.getDouble(3));
				System.out.print("\t" + resultSet.getString(4) + "\n");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		sc.close();

	}

}
