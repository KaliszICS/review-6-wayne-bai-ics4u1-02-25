
class Notes {
	public static void main(String[] args) {
		int num = 3;
		//values that are provided to functions/methods are called arguments
		System.out.println(add(num, 5));
		System.out.println(add(2, 4));
		System.out.println(add(1, 1));
		System.out.println(num);

		int result = add(2, 7);
		System.out.println(result);

		printString("Hello");

	}

	//Create functions in java
	//Create a function, it needs to be outside your main method
	//A function definition does not run until you use it

	//public - makes it accessible by others
	//static - this makes it accessible without needing to create an object
	//int - return type
	//int addNum1, int addNum2 - parameters (inputs)
	//return is what gets send back from the function (output)
	//the return value must match the datatype you specified in your definition
	public static int add(int addNum1, int addNum2) {
		int additionResult;
		addNum1 = addNum1 + 1;
		additionResult = addNum1 + addNum2;
		return additionResult; //returning ends your function
	}

	//void type functions do not return anything and do not require a return
	public static void printString(String word) {
		System.out.println(word);
	}

	//only the return type has to match, parameters can be anything
	public static boolean randomFunction(int num, String word, char c) {
		return true;
	}
}
