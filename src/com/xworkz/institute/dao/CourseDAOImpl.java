package com.xworkz.institute.dao;

import java.sql.*;

import javax.sql.DataSource;

import com.xworkz.institute.dto.CourseDTO;

public class CourseDAOImpl implements CourseDAO {

	private DataSource dataSource;
	
	public CourseDAOImpl(DataSource dataSource) {
		this.dataSource=dataSource;
	}
	@Override
	public boolean saveTheData(CourseDTO dto) {
		// System.out.println("saving".concat(dto.toString()));

		String insertQuery = "insert into course_details values(?,?,?,?,?,?)";
		try (Connection connection = this.dataSource.getConnection();
				PreparedStatement statement = connection.prepareStatement(insertQuery)) {
			System.out.println("inserting sql:" + insertQuery);

			statement.setInt(1, dto.getId());
			statement.setString(2, dto.getCourseName());
			statement.setFloat(3, dto.getDuration());
			statement.setInt(4, dto.getFees());
			statement.setString(5, dto.getStartDate().toString());
			statement.setBoolean(6, dto.getFree());

			int rowsAffected = statement.executeUpdate();
			System.out.println("affected rows:"+rowsAffected);
			return rowsAffected > 0 ? true : false;
			

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}
}
