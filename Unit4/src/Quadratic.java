//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Quadratic
{
	private int a, b, c;
	private double rootOne;
	private double rootTwo;

	public Quadratic()
	{


	}

	public Quadratic(int quadA, int quadB, int quadC)
	{
		a = quadA;
		b = quadB;
		c = quadC; 
	}

	public void setEquation(int quadA, int quadB, int quadC)
	{
		a = quadA;
		b = quadB;
		c = quadC; 
 	}

	public void calcRoots( )
	{
		rootTwo = (-(double)b - sqrt((double)b*(double)b - (4 * (double)a * (double)c))) / (2 * (double)a);
		rootOne = (-(double)b + sqrt((double)b*(double)b - (4 * (double)a * (double)c))) / (2 * (double)a);
	}

	public void print( )
	{
		System.out.println("Enter a:: " + a);
		System.out.println("Enter b:: " + b);
		System.out.println("Enter c:: " + c);
		System.out.println(" ");
		System.out.println("The roots are "+rootOne+" and "+rootTwo+".");
		System.out.println(" ");
	}
}