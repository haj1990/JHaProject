//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class GuessingGame
{
	private int upperBound;
	private int randomInt;
	private int numGuesses;

	public GuessingGame(int stop)
	{
	upperBound = stop;
	}

	public void playGame()
	{
		randomInt = (int) Math.round(Math.random() * (upperBound-1) + 1);
		int num = 0;
		while (num != randomInt) {
			System.out.println("Enter a number 1 to " + upperBound);
			Scanner keyboard = new Scanner(System.in);
			num = keyboard.nextInt();
			if (num > upperBound) {
				System.out.println("Number is not in range.");
		}
			numGuesses++;
		}

	}

	public String toString()
	{
		double percent = ((double) (numGuesses - 1) / (double) (numGuesses)) * 100;
		String output="You guessed " + numGuesses +" times to guess " + randomInt + ". You guessed wrong " + percent + " percent of the time.";
		return output;
	}
}