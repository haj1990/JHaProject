//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03c
{
	public static void main( String[] args )
   {
		Scanner s = new Scanner(System.in);
		Quadratic newQuad = new Quadratic(2, -8, -24);
		newQuad.setEquation(2, -8, -24);
		newQuad.calcRoots();
		newQuad.print();	
		
		Quadratic newQuad2 = new Quadratic(4, 10, -1);
		newQuad2.setEquation(4, 10, -1);
		newQuad2.calcRoots();
		newQuad2.print();	
	}
}