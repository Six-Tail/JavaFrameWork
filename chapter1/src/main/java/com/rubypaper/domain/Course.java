package com.rubypaper.domain;

public class Course {
    private String courseName; // 수강 과목명
    private String grade; // 성적

    // 생성자, getter, setter 등 필요한 메서드 구현
    public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
    
    @Override
    public String toString() {
        return "Course [courseName=" + courseName + ", grade=" + grade + "]";
    }
}
