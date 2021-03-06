/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] string1 = {"King", "Queen", "Ace"};
		String[] string2 = {"Spade", "Diamond"};
		int[] int1 = {13, 12, 1};
		
		Deck test = new Deck(string1, string2, int1);
		System.out.println(test.isEmpty());
		System.out.println(test.size());
		System.out.println(test.deal());
		System.out.println(test.deal());
		System.out.println(test.deal());
		
		System.out.println(test);
	}
}
