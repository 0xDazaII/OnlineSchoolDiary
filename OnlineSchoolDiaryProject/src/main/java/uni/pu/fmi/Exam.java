package uni.pu.fmi;


import java.util.*;

public class Exam {

	private String subjectName;
    private Integer numberOfExam;
    private Integer gradeOfExam;
    public Set<Student> student;
    public Teacher teacher;
	
    /**
     * Default constructor
     */
    public Exam() {
    }

    public Exam(String subjectName,
    			Integer numberOfExam,
    			Integer gradeOfExam) 
    {
    	this.subjectName = subjectName;
    	this.numberOfExam = numberOfExam;
    	this.gradeOfExam = gradeOfExam;	
    }
    

    /**
     * @return
     */
    public String getSubjectName() {
    	
        return subjectName;
    }

    /**
     * @param subjectName 
     * @return
     */
    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
       
    }

    /**
     * @return
     */
    public Integer getNumberOfExam() {
        return numberOfExam;
    }

    /**
     * @param numberOfExam 
     * @return
     */
    public void setNumberOfExam(Integer numberOfExam) {
        this.numberOfExam = numberOfExam;
    }

    /**
     * @return
     */
    public Integer getGradeOfExam() {
        return gradeOfExam;
    }

    /**
     * @param gradeOfExam 
     * @return
     */
    public void setGradeOfExam(Integer gradeOfExam) {
       this.gradeOfExam = gradeOfExam;
        
    }

}