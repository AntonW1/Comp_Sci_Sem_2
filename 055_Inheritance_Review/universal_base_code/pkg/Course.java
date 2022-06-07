package pkg;
import java.util.Scanner;
import java.util.Random;


public class Course {
	String Teacher;
	int grade;
	int credit;

	public Course(String Teacher, int grade) {
		this.Teacher = Teacher;
		this.grade = grade;
		calcCredit();
		
	}
	
	public void calcCredit() {
		if (grade >= 90) {
			credit = 4;
		}
		else if (grade >= 80) {
			credit = 3;
		}
		else if (grade >= 70) {
			credit = 2;
		}
		else if (grade >= 60) {
			credit = 1;
		}
		else {
			credit = 0;
		}
	}
	public void setTeacher(String Teacher) {
		this.Teacher = Teacher;
	}
	
	public String getTeacher() {
		return Teacher;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public void setCredit(int credit) {
		this.credit = credit;
	}
	
	public int getCredit() {
		return credit;
	}
	
	public String toString() {
		return ("Teacher: " + Teacher + "/nCredit: " + credit);
	}
	
	public boolean equals(Course other) {
		if (!(other instanceof Course)) {
			return false;
		}
		else {
			return (this.Teacher == other.getTeacher());
		}
	}

}

