import java.util.Scanner;

public class StringReverse{

	public static void main(String[] args) {

		// Scanner scan = new Scanner(System.in);
        // String str = scan.next();
		// System.out.println(reverse(str));

        // Integer x = scan.nextInt();
        // Integer y = scan.nextInt();
        // swapNumbers(x, y);
		// System.out.println(""+x+" " +y);

        // scan.close();

		// System.out.println(stringContainsVowels("Hello")); // true
		// System.out.println(stringContainsVowels("TV")); // false
		int n = 10;
		System.out.println(fibonacci(n));
	}

	public static String reverse(String in) {
		if (in == null)
			throw new IllegalArgumentException("Null is not valid input");

		StringBuilder out = new StringBuilder();

		char[] chars = in.toCharArray();

		for (int i = chars.length - 1; i >= 0; i--)
			out.append(chars[i]);

		return out.toString();
	}
    public static void swapNumbers(Integer a, Integer b) {
        System.out.println(""+a+" " +b);
        b = b + a;
        a = b - a;
        b = b - a;
        System.out.println(""+a+" " +b);
    }
    public static boolean stringContainsVowels(String input) {

		return input.toLowerCase().matches(".*[aeiou].*");

	}
    public static int fibonacci(int n) {
		if (n <= 1)
			return n;
		return fibonacci(n - 1) + fibonacci(n - 2);
	}



	
}