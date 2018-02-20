//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03d
{
	public static void main( String[] args )
	{
		Distance newDist = new Distance(2, 2, 4, 4);
		newDist.setCoordinates(2, 2, 4, 4);
		newDist.calcDistance();
		newDist.print();
		
		Distance newDist2 = new Distance(10, 2, 3, 5);
		newDist2.setCoordinates(10, 2, 3, 5);
		newDist2.calcDistance();
		newDist2.print();
	}
}