package uni.pu.fmi;


import java.util.*;

/**
 * 
 */
public class Teacher {

	private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private Set<SchoolClassInfo> classRelation;
    private Set<Exam> exam;
    private Diary grades;
    
    
    /**
     * Default constructor
     */
    public Teacher() {
    }
    
    public Teacher(String firstName,
    				String lastName,
    				String email,
    				String phoneNumber) 
    {
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.email = email;
    	this.phoneNumber = phoneNumber;
    }

    public String getFirstName(){
    	return firstName;
    }
    
    public void setFirstName(String firstName)
    {
    	this.firstName = firstName;
    }
    
    public String getLastName(){
    	return lastName;
    }
    
    public void setLastName(String lastName)
    {
    	this.lastName = lastName;
    }
    
    public String getEmail()
    {
    	return email;
    }
    
    public void setEmail(String email)
    {
    	this.email = email;
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