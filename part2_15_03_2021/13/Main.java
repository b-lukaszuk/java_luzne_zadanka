import classes.PodstOperMatem;

public class Main {

    public static void main(String[] args) {

	double num1 = 12;
	double num2 = 4;

	System.out.println("Creating an object of class PodstOperMatem: " +
			   "new PodstOperMatem(" +
			   String.valueOf(num1) + ", " +
			   String.valueOf(num2) + ")\n");

	PodstOperMatem podstOperMatem = new PodstOperMatem(12, 4);

	System.out.printf("The results of four basic " +
			  "mathematical operations:%n");
	System.out.printf("%.2f + %.2f = %.2f%n", num1, num2,
			  podstOperMatem.resOfAddition);
	System.out.printf("%.2f - %.2f = %.2f%n", num1, num2,
			  podstOperMatem.resOfSubtraction);
	System.out.printf("%.2f * %.2f = %.2f%n", num1, num2,
			  podstOperMatem.resOfMultiplication);
	System.out.printf("%.2f / %.2f = %.2f%n", num1, num2,
			  podstOperMatem.resOfDivision);

	System.out.println("\nThat's all. Goodbye");
    }
}
