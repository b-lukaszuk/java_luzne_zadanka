public class Factorial {

    private static byte number = 7;

    // no test for the corectness of input
    public static int factorial(byte number) {
	int result = 1;
	for (int i = 1; i <= number; i++) {
	    result *= i;
	}
	return result;
    }

    public static void main(String[] args) {

	System.out.println("Factorial of " + String.valueOf(number) +
			   " is: " + String.valueOf(factorial(number)));
    }
}
