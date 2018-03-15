//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class GradeBookRunner
{
   public static void main( String args[] )
   {
		out.println("Welcome to the Class Stats program!");
		out.println("Name: ");
		Scanner keyboard = new Scanner(System.in);
		String cname = keyboard.nextLine();

		out.println("Students: ");
		int size = keyboard.nextInt();	
		
		Class test = new Class();	
		int count = 1;
		do 
		{
			out.println("Student " + count + " : ");
			String sname = keyboard.next();
			
			out.println("Grades: ");
			String grades = keyboard.next();
			
			test.addStudent(count-1,new Student(sname, grades));
		}while(count <= size);
		
		out.println(test);
		out.println("Failure List = " + test.getFailureList(70));	
		out.println("Highest Average = " + test.getStudentWithHighestAverage());
		out.println("Lowest Average = " + test.getStudentWithLowestAverage());
								
		out.println(String.format("Class Average = %.2f",test.getClassAverage()));	



















	}		
}