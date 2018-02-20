//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Name
{
	private String name;

	public Name()
	{
		setName("");
	}

	public Name(String s)
	{
		setName(s);
	}

   public void setName(String s)
   {
	   name = s;
   }

	public String getFirst()
	{
		int loc=name.indexOf(" ");
		return name.substring(0,loc);
	}

	public String getLast()
	{
		int loc=name.indexOf(" ");
		return name.substring(loc+1);
	}

 	public String toString()
 	{
 		return name+"\n\n";
	}
}