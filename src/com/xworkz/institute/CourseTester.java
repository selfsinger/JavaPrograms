package com.xworkz.institute;




import java.time.*;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.institute.dto.CourseDTO;
import com.xworkz.institute.service.*;

public class CourseTester {

	public static void main(String[] args) {

		CourseDTO dto1 = new CourseDTO(1, "JAVA", 5.5f, 45000, LocalDate.of(2022, Month.JUNE, 14), true);
		CourseDTO dto2 = new CourseDTO(2, "SQL", 5.0f, 48000, LocalDate.of(2022, Month.JUNE, 14), true);
		CourseDTO dto3 = new CourseDTO(3, "WEB Technology", 5.5f, 42000, LocalDate.of(2022,Month.JUNE,13), true);
//		CourseDTO dto4 = new CourseDTO(4, "JavaScript", 16.70f, 40000, LocalDate.of(2022,Month.JUNE, 12), true);
//		CourseDTO dto5 = new CourseDTO(5, "BootStrap", 7.70f, 30000, LocalDate.of(2022,Month.JUNE, 14), true);
		try(ClassPathXmlApplicationContext application=new ClassPathXmlApplicationContext("resources/Spring.xml")){
		CourseService service=application.getBean(CourseService.class);
		boolean saved=service.checkAndSave(dto1);
		boolean saved1=service.checkAndSave(dto2);	
		System.out.println(saved+"\n"+saved1+"\n"+"\n"+service.checkAndSave(dto3));
		
		
		
		}
	

}
}
