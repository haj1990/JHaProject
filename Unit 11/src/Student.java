//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Student implements Comparable<Student>
{
	private String myName;
	private Grades myGrades;
	
	public Student()
	{
		setName("");
		setGrades("");
	}
	
	public Student(String name, String gradeList)
	{
		setName(name);
		setGrades(gradeList);

	}
	
	public void setName(String name)
	{
		myName = name;

	}	
	
	public void setGrades(String gradeList)
	{
		myGrades = new Grades(gradeList);
	}
	
	public void setGrade(int spot, double grade)
	{
		myGrades.setGrade(spot, grade);

	}

	public String getName()
	{
		return myName;
	}
	
	public int getNumGrades()
	{
		return myGrades.getNumGrades();
	}

	public double getSum()
	{
		return myGrades.getSum();
	}
	
	public double getAverage()
	{
		double average = 0.0;
		average = getSum() / getNumGrades();
		return average;
	}

	public double getAverageMinusLow()
	{
		double average = 0.0;
		average = (getSum() - getLowGrade()) / (getNumGrades() - 1);
		return average;
	}
	
	public double getHighGrade()
	{
		return myGrades.getHighGrade();		
	}
	
	public double getLowGrade()
	{
		return myGrades.getLowGrade();	
	}
	
	public String toString()
	{
		return myName + " = " + myGrades;
	}	
	
	public boolean equals(Student stu)
	{
		if (getAverage() == stu.getAverage()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int compareTo(Student stu)
	{
		if (getAverage() > stu.getAverage())
			return 1;
		else if (getAverage() < stu.getAverage())
			return -1;
		return 0;
	}
}