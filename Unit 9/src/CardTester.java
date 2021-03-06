/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card test = new Card("3", "Hearts", 3);
		Card test2 = new Card("3", "Hearts", 3);
		Card test3 = new Card("4", "Spades", 4);
		System.out.println(test.matches(test2));
		System.out.println(test.matches(test3));
		System.out.println(test);
	}
}
