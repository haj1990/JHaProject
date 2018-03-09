//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class MadLib
{
	private ArrayList<String> verbs;
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;
	
	public MadLib()
	{
		verbs = new ArrayList<String>();
		nouns = new ArrayList<String>();
		adjectives = new ArrayList<String>();

	}

	public MadLib(String fileName)
	{
		//load stuff
		this();
		loadNouns();
		loadVerbs();
		loadAdjectives();
		
		
		try{
			Scanner file = new Scanner(new File(fileName));
		
			while(file.hasNext()) {
				String test= file.next();
				if(test.equals("#")){
					System.out.print(getRandomNoun() + " ");
				}
				else if(test.equals("@")) {
					System.out.print(getRandomVerb() + " ");
				}
				else if(test.equals("&")) {
					System.out.print(getRandomAdjective() + " ");
				}
				else {
					System.out.print(test + " ");
				}
			}
		}
		catch(Exception e)
		{
			
			out.println("Houston we have a problem!");
		}
		
	}

	public void loadNouns()
	{
		try{
			Scanner inputNouns = new Scanner (new File("C:\\Users\\haj1990\\Desktop\\Unit10-2016\\Unit10-Assignments\\Lab16d\\nouns.dat"));
			while(inputNouns.hasNext()) {
				nouns.add(inputNouns.next());
		}
	
		}
		catch(Exception e)
		{
			System.out.println("Error 1");
		}	
		
	}
	
	public void loadVerbs()
	{
		try{
			Scanner inputVerbs = new Scanner (new File("C:\\Users\\haj1990\\Desktop\\Unit10-2016\\Unit10-Assignments\\Lab16d\\verbs.dat"));
			while(inputVerbs.hasNext()) {
				verbs.add(inputVerbs.next());
		}
	
		}
		catch(Exception e)
		{
			System.out.println("Error 2");
		}	
		
	}

	public void loadAdjectives()
	{
		try{
			Scanner inputAdjectives = new Scanner (new File("C:\\Users\\haj1990\\Desktop\\Unit10-2016\\Unit10-Assignments\\Lab16d\\adjectives.dat"));
			while(inputAdjectives.hasNext()) {
				adjectives.add(inputAdjectives.next());
		}
	
		}
		catch(Exception e)
		{
			System.out.println("Error 3");
		}	
		
	}

	public String getRandomVerb()
	{
		int random = (int)Math.round(((Math.random())*(verbs.size()-1)));
		return verbs.get(random);
	}
	
	public String getRandomNoun()
	{
		
		int random = (int)Math.round(((Math.random())*(nouns.size()-1)));
		return nouns.get(random);
	}
	
	public String getRandomAdjective()
	{
		
		int random = (int)Math.round(((Math.random())*(adjectives.size()-1)));
		return adjectives.get(random);
	}		

	public String toString()
	{
	   return "\n\n\n";
	}
}