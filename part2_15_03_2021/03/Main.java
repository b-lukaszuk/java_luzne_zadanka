import java.util.Arrays;

public class Main {
	private static int factorial(int number) {
	    int result = 1;
		for (int i = 1; i <= number; i++) {
		    result *= i;
		}
		return result;
	}

	public static void main(String[] args) {
		int num1 = 4;
		int num2 = 5;
		int num3 = 6;

		System.out.printf("Factorial of %d is: %s%n",
				  num1, factorial(num1));
		System.out.printf("Factorial of %d is: %s%n",
				  num2, factorial(num2));
		System.out.printf("Factorial of %d is: %s%n",
				  num3, factorial(num3));
	}
}
