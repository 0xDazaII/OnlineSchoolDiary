package uni.pu.fmi;


import java.util.*;

/**
 * 
 */
public class Student {

	private String firstName;
    private String lastName;
    private Integer numberInClass;
    public SchoolClassInfo classStudent;
    private Diary diary;
    public Set<Parent> parent;
    public Set<Exam> exam;

    /**
     * Default constructor
     */
    public Student() {
    }
    public Student(String firstName,
    			   String lastName,
    			   Integer numberInClass) 
    {
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.numberInClass = numberInClass;
    }

    /**
     * 
     */
    
    /**
     * @return
     */
    public String getFirstName() 
    {
        return firstName;
    }

    /**
     * @param firstName 
     * @return
     */
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    /**
     * @return
     */
    public String getLastName() 
    {
        return lastName;
    }

    /**
     * @param lastName 
     * @return
     */
    public void setLastName(String lastName) 
    {
        this.lastName = lastName;
    }

    /**
     * @return
     */
    public Integer getNumberInClass() 
    {
    	return numberInClass;
    }

    /**
     * @param numberInClass 
     * @return
     */
    public void setNumberInClass(Integer numberInClass) 
    {
      this.numberInClass = numberInClass;  
    }

}