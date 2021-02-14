package uni.pu.fmi;


import java.util.*;

/**
 * 
 */
public class Parent {
	
	private String firstName;
    private String lastName;
    private String phoneNumber;
    public Set<Student> student;
    private Set<Diary> diary;
	
    /**
     * Default constructor
     */
    public Parent() {
    }
    
    public Parent(String firstName,String lastName)
    {
    	this.firstName = firstName;
    	this.lastName = lastName;
    }
    
    /**
     * @param grades 
     * @return
     */
    public void checkOwnChildrenGrades(Diary grades) {
        grades.showGrades();        
    }

    /**
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName 
     * @return
     */
    public void setFirstName(String firstName) {
    	this.firstName = firstName;
    }

    /**
     * @return
     */
    public String getLastName() {
    	return lastName;
    }

    /**
     * @param lastName 
     * @return
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber()
    {
    	return phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber)
    {
    	this.phoneNumber = phoneNumber;
    }
}