package uni.pl.fmi.models;

import uni.pl.fmi.services.AddGradeService;

public class AddGradesModel {
	
	private Integer grade;
	private String subjectName;
	private String studentName;
	private String studentLastName;
	private Integer studentNumber; 
	private String message;
	
	public void navigateToMe() {
		System.out.println("Отворена е страницата за добавяне на оценки в дневника!");
	}
	
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
	
	public void setSubject(String subject) {
		this.subjectName = subject;
	}
	
	public void setStudentName(String firstNameOfStudent) {
		this.studentName = firstNameOfStudent;
	}
	
	public void setStudentLastName(String lastNameOfStudent) {
		this.studentLastName = lastNameOfStudent;
	}
	
	public void setStudentNumber(Integer numberOfStudent) {
		this.studentNumber = numberOfStudent;
	}

	public void clickAddButton() 
	{
		message = AddGradeService.add(grade, subjectName, studentName, studentLastName, studentNumber);{
			
		}
	}
	
	public String getAddMessage() {
		return message;
	}
}
