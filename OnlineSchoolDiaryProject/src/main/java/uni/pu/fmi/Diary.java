package uni.pu.fmi;

import java.util.*;

/**
 * 
 */
public class Diary {

	private Integer grade;
    private String firstNameOfStudent;
    private String lastNameOfStudent;
    private Integer numberInClassOfStudent;
    private String subjectName;
    
    public Set<Parent> parent;
    public Set<Teacher> teacher;

    /**
     * 
     */
	
    public Diary() {
    }
    
    public Diary(Integer grade,
    				String firstNameOfStudent, 
    				String lastNameOfStudent,
    				Integer numberInClassOfStudent, 
    				String subjectName) 
    {
    	
    }

    //public SchoolClassInfo classs;

    public void showGrades() {
    	System.out.println(getGrade());

    }

    /**
     * @return
     */
    public Integer getGrade() {
        return grade;
    }

    /**
     * @param grade 
     * @return
     */
    public void setGrade(Integer grade) {
    	this.grade = grade;
    }
    
    public String getSubjectName() {
        return subjectName;
    }
    
    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
    
    /**
     * @return
     */
    public String getFirstNameOfStudent() {
        return firstNameOfStudent;
    }

    /**
     * @param firstNameOfStudent 
     * @return
     */
    public void setFirstNameOfStudent(String firstNameOfStudent) {
    	this.firstNameOfStudent = firstNameOfStudent;
    }

    /**
     * @return
     */
    public String getLastNameOfStudent() {
        return lastNameOfStudent;
    }

    /**
     * @param lastNameOfStudent 
     * @return
     */
    public void setLastNameOfStudent(String lastNameOfStudent) {
    	this.lastNameOfStudent = lastNameOfStudent;
    }

    /**
     * @return
     */
    public Integer getNumberInClassOfStudent() {
    	return numberInClassOfStudent;
    }

    /**
     * @param numberInClassOfStudent 
     * @return
     */
    public void setNumberInClassOfStudent(Integer numberInClassOfStudent) {
        this.numberInClassOfStudent = numberInClassOfStudent;
    }

}