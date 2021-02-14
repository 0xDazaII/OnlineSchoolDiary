package uni.pu.fmi;


import java.util.*;

/**
 * 
 */
public class SchoolClassInfo {

	private String className;
    private Integer classGrade;
    private Set<String> subjects;
    private String classTeacherFirstName;
    private String classTeacherLastName;
    public Set<Teacher> teacher;
    public Set<Student> student;
    public Diary diary;
    
    public SchoolClassInfo() {
    }
    
    public SchoolClassInfo(String className,
    		Integer classGrade,
    		String classTeacherFirstName,
    		String classTeacherLastName) 
    {
    	this.className = className;
    	this.classGrade = classGrade;
    	this.classTeacherFirstName = classTeacherFirstName;
    	this.classTeacherLastName = classTeacherLastName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className; 
    }

    public Integer getClassGrade() {
        return classGrade;
    }
    
    public void setClassGrade(Integer classGrade) {
        this.classGrade = classGrade;
    }

    public Set<String> getSubjects() {
        return subjects;
    }

    public void setSubject(Set<String> subjects) {
        this.subjects = subjects;
        
    }

    public String getClassTeacherFirstName() {
       return classTeacherFirstName;
    }

    public void setClassTeacherFirstName(String classTeacherFirstName) {
        this.classTeacherFirstName = classTeacherFirstName;
        
    }

    public String getClassTeacherLastName() {
        return classTeacherLastName;
    }

    public void setClassTeacherLastName(String classTeacherLastName) {
        this.classTeacherLastName = classTeacherLastName;
        
    }

}