//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class TriangleThree
{
   private int size;
   private String letter;

	public TriangleThree()
	{
		setTriangle("",0);
	}

	public TriangleThree(int count, String let)
	{
		setTriangle(let,count);
	}

	public void setTriangle( String let, int sz )
	{
		size = sz;
		letter = let;
	}

	public String getLetter()
	{
		return letter;
	}

	public String toString()
	{
		String output="";
		int thing = 1;
		int thing2 = size - 1;
		for (int i=0; i<(size); i++)
		{
			for (int k=0; k<(thing2); k++) {
				output = output + " ";
			}
		   for (int j=0; j<(thing); j++)
		   {
		       output = output + letter;
		   }   
		   output = output + "\n";
		   thing = thing + 1;
		   thing2 = thing2 - 1;
		}
		return output + "\n";
	}
}