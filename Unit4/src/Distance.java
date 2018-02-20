//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance;

	public Distance()
	{



	}

	public Distance(int x1, int y1, int x2, int y2)
	{



	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
	}

	public void calcDistance()
	{
		distance = sqrt(((double) xTwo - (double) xOne) * ((double) xTwo - (double) xOne) + ((double) yOne- (double) yTwo) * ((double) yOne- (double) yTwo));

	}

	public void print( )
	{
		System.out.println("Enter x1:: " + xOne);
		System.out.println("Enter x2:: " + xTwo);
		System.out.println("Enter y1:: " + yOne);
		System.out.println("Enter y2:: " + yTwo);
		System.out.println(" ");
		System.out.printf("The distance is :: %.3f \n\n\n", distance);
		System.out.println(" ");

	}
}