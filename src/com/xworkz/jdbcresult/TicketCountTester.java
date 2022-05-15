package com.xworkz.jdbcresult;

import java.sql.*;

import com.xworkz.jdbcresult.constant.ResultSqlProperties;

public class TicketCountTester {

	public static void main(String[] args) {

		String sql = "select count(*) AS  no_of_rows from Movie_Ticket";

		try (Connection connection = DriverManager.getConnection(ResultSqlProperties.URL.getValue(),
				ResultSqlProperties.USERNAME.getValue(), ResultSqlProperties.PASSWORD.getValue());
				Statement statement = connection.createStatement()) {

			ResultSet result = statement.executeQuery(sql);

			result.next();

			int count = result.getInt(1);
			System.out.println(count);

		}

		catch (Exception e) {
			System.out.println(e);
		}
	}

}
