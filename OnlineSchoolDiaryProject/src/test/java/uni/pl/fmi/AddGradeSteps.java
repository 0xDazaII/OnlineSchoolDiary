package uni.pl.fmi;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.pl.fmi.models.AddGradesModel;

public class AddGradeSteps {
private AddGradesModel addGradeModel = new AddGradesModel();
	
	@Given("^Учителя отваря екрана за попълване в дневника$")
	public void openAddGradeScreen() throws Throwable {
		addGradeModel.navigateToMe();
	}

	@When("^Учителя въвежда оценка на ученика (\\d+)$")
	public void addGrade(Integer grade) throws Throwable {
		addGradeModel.setGrade(grade);
	}

	@When("^Въвежда име на предмет по която е оценката \"([^\"]*)\"$")
	public void addSubjectName(String subjectName) throws Throwable {
		addGradeModel.setSubject(subjectName);
	}

	@When("^Въвежда име на ученика \"([^\"]*)\"$")
	public void addStudentName(String studentName) throws Throwable {
		addGradeModel.setStudentName(studentName);
	}

	@When("^Въвежда Фамилия на ученика \"([^\"]*)\"$")
	public void addStudentLastName(String studentLastName) throws Throwable {
		addGradeModel.setStudentLastName(studentLastName);
	}
	
	@When("^Въвежда номер на ученика (\\d+)$")
	public void addStudentNumber(Integer studentNumber) throws Throwable {
		addGradeModel.setStudentNumber(studentNumber);
	}

	@When("^Натисне върху бутона за добавяне на данните в дневника$")
	public void clickAddButton() throws Throwable {
		addGradeModel.clickAddButton();
	}

	@Then("^Вижда съобщение \"([^\"]*)\"$")
	public void checkAddGradeMessage(String expectedMessage) throws Throwable {
	    assertEquals(expectedMessage, addGradeModel.getAddMessage());
	}
}
