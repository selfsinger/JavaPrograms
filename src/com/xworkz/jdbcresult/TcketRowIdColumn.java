package com.xworkz.jdbcresult;

import java.sql.*;

import com.xworkz.jdbcresult.constant.ResultSqlProperties;

public class TcketRowIdColumn {

	public static void main(String[] args) {

		String sql = "select *from Movie_Ticket";
		try (Connection connection = DriverManager.getConnection(ResultSqlProperties.URL.getValue(),
				ResultSqlProperties.USERNAME.getValue(), ResultSqlProperties.PASSWORD.getValue());
				Statement statement = connection.createStatement()) {

			ResultSet result = statement.executeQuery(sql);

			while (result.next()) {

				int userData = result.getInt(1);
				System.out.println(userData);
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
