import java.util.Arrays;

public class Numbers {
	public static void main(String[] args) {
		System.out.println(isGoofy(16));
		System.out.println(isGoofy(10));
		System.out.println(isGoofy(2));
		
		System.out.println(Arrays.toString(getSomeGoofyNumbers(3)));
		System.out.println(Arrays.toString(getSomeGoofyNumbers(5)));
		System.out.println(Arrays.toString(getSomeGoofyNumbers(10)));
		
	}
	public static boolean isGoofy(int num){
		int count1 = 0;
		String number1 = Integer.toString(num);
		for (int i = 0; i < number1.length(); i++) {
			char newnum = number1.charAt(i);
			int newnum1 = newnum - 48;
			if (newnum1 != 0) {
				if (num % newnum1 == 0) {
				count1 += newnum;
				}
		}
			}
		if (count1 % 2 == 1) {
			return true;
		}
		else {
			return false;
		}
	}
	public static int[] getSomeGoofyNumbers(int count) {
		int[] list = new int[count];
		int j = 0;
		int i = 0;
		while (j != count) {
			i++;
			if (isGoofy(i) == true) {
				list[j] = i;
				j++;
			}
		}
		return list;
	}
}
