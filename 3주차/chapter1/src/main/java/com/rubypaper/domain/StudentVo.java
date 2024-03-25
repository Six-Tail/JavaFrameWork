package com.rubypaper.domain;

import java.time.LocalDate;
import java.util.List;

public class StudentVo {
	private int studentId; // 학번
	private String studentName; // 학생 이름
	private String gender; // 성별
	private LocalDate dateOfBirth; // 생년월일
	private String address; // 주소
	private String contactNumber; // 연락처

	private String department; // 학과,전공
	private int grade; // 학년
	private List<Course> courses; // 수강과목 및 성적

	private boolean isEnrolled; // 현재 등록 여부
	private LocalDate enrollmentDate; // 등록일
	private LocalDate expectedGraduationDate; // 졸업 예정일

	// 생성자, getter, setter 등 필요한 메서드 구현
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate localDate) {
		this.dateOfBirth = localDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public boolean isEnrolled() {
		return isEnrolled;
	}

	public void setEnrolled(boolean isEnrolled) {
		this.isEnrolled = isEnrolled;
	}

	public LocalDate getEnrollmentDate() {
		return enrollmentDate;
	}

	public void setEnrollmentDate(LocalDate localDate) {
		this.enrollmentDate = localDate;
	}

	public LocalDate getExpectedGraduationDate() {
		return expectedGraduationDate;
	}

	public void setExpectedGraduationDate(LocalDate localDate) {
		this.expectedGraduationDate = localDate;
	}

	@Override
	public String toString() {
		return "StudentVo [studentId=" + studentId + ", studentName=" + studentName + ", gender=" + gender
				+ ", dateOfBirth=" + dateOfBirth + ", address=" + address + ", contactNumber=" + contactNumber
				+ ", department=" + department + ", grade=" + grade + ", courses=" + courses + ", isEnrolled="
				+ isEnrolled + ", enrollmentDate=" + enrollmentDate + ", expectedGraduationDate="
				+ expectedGraduationDate + "]";
	}
}
