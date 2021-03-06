//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.lang.System;
import java.lang.Math;
import java.util.Scanner;

import javax.sound.sampled.Line;

public class Grades
{
	private double[] nums;
	
	public Grades() {
	}
	
	public Grades(double[] list1) {
		setGrades(list1);
	}

	public void setGrades(double[] list1) {
		nums = list1; 
	}



	private double getSum()
	{
		double sum=0.0;
		for (int i = 0; i<nums.length; i++) {
			sum = sum + nums[i];
		}
		return sum;
	}

	public double getAverage()
	{
		double average=0.0;
		int total = 0;
		for (int i = 0; i<nums.length; i++) {
			total = total + 1;
		}
		average = getSum() / total;
		return average;
	}

	public String toString() {
		String output = " ";
		for (int i = 0; i<nums.length; i++) {
			System.out.println("Grade: " + nums[i]);
		}
		output = "Average: " + getAverage();
		return output;
	}



}