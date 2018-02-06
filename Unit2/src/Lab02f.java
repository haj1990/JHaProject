//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Lab02f
{
	public static void main( String[] args )
   {
		Line newLine = new Line(2, 2, 4, 4);
		newLine.setCoordinates(2, 2, 4, 4);
		newLine.calculateSlope();
		newLine.print();
		
		Line newLine2 = new Line(10, 2, 3, 5);
		newLine2.setCoordinates(10, 2, 3, 5);
		newLine2.calculateSlope();
		newLine2.print();
		
	}
}