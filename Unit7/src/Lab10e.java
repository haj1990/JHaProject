//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class Lab10e
{
	public static void main(String args[])
	{
		System.out.println("Guessing Game: Guess a number ");
		Scanner keyboard = new Scanner(System.in);
		int response = keyboard.nextInt();
		GuessingGame test = new GuessingGame(response);
		test.playGame();
		System.out.println(test);
			
	}
}