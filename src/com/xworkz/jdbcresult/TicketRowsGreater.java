package com.xworkz.jdbcresult;

import java.sql.*;

import com.xworkz.jdbcresult.constant.ResultSqlProperties;

public class TicketRowsGreater {

	public static void main(String[] args) {
		// get all rows where rowsnumber gretaer than two
		String sql = "select *from Movie_Ticket where ROW_NO>2";

		try (Connection connection = DriverManager.getConnection(ResultSqlProperties.URL.getValue(),
				ResultSqlProperties.USERNAME.getValue(), ResultSqlProperties.PASSWORD.getValue());
				Statement statement = connection.createStatement()) {

			ResultSet result = statement.executeQuery(sql);

			String userData = "";

			while (result.next()) {
				userData = result.getInt(1) + ": " + result.getInt(2) + " " + result.getInt(3) + " "
						+ result.getString(4) + " " + result.getString(5);
				System.out.println(userData);

			}

		}

		catch (Exception e) {
			System.out.println(e);
		}

	}
}
