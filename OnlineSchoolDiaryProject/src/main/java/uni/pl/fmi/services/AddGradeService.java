package uni.pl.fmi.services;

import java.util.ArrayList;
import java.util.List;

import uni.pu.fmi.Diary;

public class AddGradeService
{
	public static String add(Integer grade,
								String subjectName,
								String studentFirstName,
								String studentLastName,
								Integer studentNumber)
	{
		//Проверка дали всички полета са празни
		if (grade == null && subjectName == null && studentFirstName == null && studentLastName == null && studentNumber == null) {
			return "Не сте въвели ученически данни!";
		}
		//Проверка дали е написана оценка
		if (grade == null) {
			return "Въведете оценка на ученика!";
		}
		//Проверка дали е въведена невалидна оценка
		if (grade < 2 || grade >6) {
			return "Въведете валидна оценка на ученика!";
		}
		//Проверка дали е въведено име на предмета
		if (subjectName == null) {
			return "Въведете име на Предмета!";
		}
		//Проверка дали е въведено име на ученика
		if (studentFirstName == null) {
			return "Въведете име на ученика!";
		}
		//Проверка дали е въведена фамилия на ученика
		if (studentLastName == null) {
			return "Въведете фамилия на ученика!";
		}
		//Проверка дали е въведен номер на ученика
		if (studentNumber == null) {
			return "Въведете номер в клас на ученика!";
		}
		
		final String isAllFilledCorrect;;
		return isAllFilledCorrect = "Успешно добавихте оценка в дневника!";
	}
	
	//Лист за съхраняване на въведените данни в дневника
	public static List<Diary>getDiary() {
		final Diary diary = new Diary();
		diary.setGrade(5);
		diary.setFirstNameOfStudent("Ivan");
		diary.setLastNameOfStudent("Ivanov");
		diary.setSubjectName("Geografiq");
		diary.setNumberInClassOfStudent(15);
		final List<Diary>result = new ArrayList<>();
		result.add(diary);
		return result;
		
	}
	
}
