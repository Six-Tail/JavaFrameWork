package com.rubypaper.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rubypaper.domain.Course;
import com.rubypaper.domain.StudentVo;

@RestController
public class StudentController {
    
    // 학생 정보를 조회하는 메서드
	@GetMapping("/getStudentList")
	public StudentVo getStudent() {
		// 학생 정보 객체 생성 및 설정
		StudentVo student = new StudentVo();
		student.setStudentId(202007026); // 학번
		student.setStudentName("배지호"); // 학생 이름
		student.setGender("남자"); // 성별
		student.setDateOfBirth(LocalDate.of(2001, 12, 15)); // 생년월일
		student.setAddress("서울시 금천구"); // 주소
		student.setContactNumber("010-5408-8917"); // 연락처
		student.setDepartment("컴퓨터소프트웨어 공학과"); // 학과
		student.setGrade(3); // 학년

		// 수강과목 추가
		List<Course> courses = new ArrayList<>();
		Course course1 = new Course();
		course1.setCourseName("JAVAFrameWork"); // 수강 과목명
		course1.setGrade("A+"); // 성적

		courses.add(course1);

		student.setCourses(courses);

		student.setEnrolled(true); // 등록 여부
		student.setEnrollmentDate(LocalDate.of(2020, 03, 02)); // 등록일
		student.setExpectedGraduationDate(LocalDate.of(2025, 03, 03)); // 예정 졸업일

		System.out.println(student); // 현재 정보 출력
		return student;
	}
}
