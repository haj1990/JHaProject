//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word2 implements Comparable<Word2>
{
	private String word;

	public Word2( String s)
	{
		word = s;

	}

	private int numVowels()
	{
		String vowels = "AEIOUaeiou";
		int vowelCount=0;
		for (int i = 0; i<vowels.length(); i++) {
			for (int j = 0; j<word.length(); j++) {
				if (vowels.charAt(i) == word.charAt(j)) {
					vowelCount += 1;
				}
			}
		}
		return vowelCount;
	}

	public int compareTo(Word2 rhs)
	{
		if (numVowels() > rhs.numVowels()) {
			return 1;
		}
		else if (numVowels() > rhs.numVowels()) {
			return -1;
		}
		else {
			if (word.compareTo(rhs.toString()) > 0) {
				return 1;
			}
			else if (word.compareTo(rhs.toString()) < 0) {
				return -1;
			}	
			return 0;
		}
	}

	public String toString()
	{
		return word;
	}
}