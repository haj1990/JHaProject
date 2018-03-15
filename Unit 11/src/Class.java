//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.util.ArrayList;

public class Class
{
	private String name;
	private ArrayList<Student> studentList;
	
	public Class()
	{
		name="";
		studentList = new ArrayList<Student>();
	}
	
	public Class(String name1, int stuCount)
	{
		name = name1;
		studentList = new ArrayList<Student>();
	}
	
	public void addStudent(int stuNum, Student s)
	{
		studentList.add(stuNum, s);
	}
	
	public String getClassName()
	{
	   return name;
	}
	
	public double getClassAverage()
	{
		double classAverage=0.0;
		double total = 0;
		for (int i = 0; i<studentList.size(); i++) {
			total = total + studentList.get(i).getAverage();
		}
		classAverage = total / studentList.size();
		return classAverage;
	}
	
	public double getStudentAverage(int stuNum)
	{
		return studentList.get(stuNum).getAverage();
	}

	public double getStudentAverage(String stuName)
	{
		double average = 0.0;
		for (int i = 0; i<studentList.size(); i++) {
			if (studentList.get(i).getName() == stuName) {
				average = studentList.get(i).getAverage();
			}
		}
		return average;
	}
	
	public String getStudentName(int stuNum)
	{
		return studentList.get(stuNum).getName();
	}

	public String getStudentWithHighestAverage()
	{
		sort();
		return getStudentName(studentList.size()-1);
	}

	public String getStudentWithLowestAverage()
	{
		sort();
		return getStudentName(0);
	}
	
	public String getFailureList(double failingGrade)
	{
		String output="";
		for (int i = 0; i<studentList.size(); i++) {
			if (studentList.get(i).getAverage() < failingGrade) {
				output += studentList.get(i).getName();
			}
		}
		return output;
	}
	
	public String toString()
	{
		String output=""+getClassName()+"\n";




		return output;
	}  	
	
	public void sort()
	{
		Collections.sort(studentList);
	}
}