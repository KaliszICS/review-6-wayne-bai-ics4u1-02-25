

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int sum(int arg1, int arg2) {
		return arg1 + arg2;
	}

	public static int difference(int arg1, int arg2) {
		return arg1 - arg2;
	}

	public static double product(double arg1, double arg2) {
		return arg1 * arg2;
	}
	
	public static String removeFirst(String arg) {
		return arg.substring(1, arg.length());
	}

	public static int combinedLength(String arg1, String arg2) {
		return arg1.length() + arg2.length();
	}
	public static boolean isEven(int arg1) {
		return arg1 % 2 == 0;
	}

	public static boolean isOdd(int arg1) {
		return !isEven(arg1);
	}

	public static boolean isPositive(int arg1) {
		return arg1 > 0;
	}
	public static boolean isNegative(int arg1) {
		return arg1 < 0;
	}
}

/*
# Instructions  

  ## Questions
1. Create a Method called _sum_, which takes two integers as parameters.  Return the sum of the two parameters as an integer.
2. Create a Method called _difference_, which takes in two integers as parameters.  Return the difference of the two parameters (subtract them) as an integer.
3. Create a Method called _product_, which takes two doubles as parameters.  Return the product of the two parameters(multiply them), as a double.
4. Create a method called _removeFirst_, which takes in a string as a parameter.  Return the string with the first character removed.
5. Create a method called _combinedLength_ that accepts two Strings as paramters.
Return the length of the two strings combined.
6. Create a method called _isEven_ that accepts an integer as a parameter.
Return true if it is even, false if it is not. (0 will be considered even).
7. Create a method called _isOdd_ that accepts an integer as a parameter.
Return true if it is odd, false if it is not. (0 will be considered even).
8. Create a method called _isPositive_ that accepts an integer as a parameter.
Return true if it is positive, false if it is not.
9. Create a method called _isNegative_ that accepts an integer as a parameter.
Return true if it is negative, false if it is not.
*/