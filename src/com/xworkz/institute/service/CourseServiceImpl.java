package com.xworkz.institute.service;

import java.time.*;

import com.xworkz.institute.dao.*;
import com.xworkz.institute.dto.CourseDTO;

public class CourseServiceImpl implements CourseService {

	private CourseDAO dao;

	public CourseServiceImpl(CourseDAO dao) {

		this.dao = dao;
	}

	@Override
	public boolean checkAndSave(CourseDTO dto) {
		if (dto != null) {
			Float time = dto.getDuration();
			LocalDate moreThanSixDays = LocalDate.now().plusDays(6);

			System.out.println("Here checking details of course...");

			if (!(dto.getId() > 0)) {
				System.out.println("id is valid");
				return false;
			}
			if (!(dto.getCourseName() != null && dto.getCourseName().length() >= 3
					&& dto.getCourseName().length() < 30)) {
				System.out.println("course name is valid ");
				return false;
			}
			if (!(time > 0 && time < 6)) {
				System.out.println("duration is valid");
				return false;
			}
			if (!(dto.getFees() > 0 && dto.getFees() < 50000)) {
				System.out.println("fees is valid");
				return false;
			}
			if (!(dto.getStartDate().isAfter(moreThanSixDays))) {
				System.out.println("date is valid");
				return false;
			}

		}
		boolean saved = dao.saveTheData(dto);
		System.out
				.println("Checking the details and after checking we are saving the data" + " " + dto + " \n" + saved);
		return false;

	}

}
