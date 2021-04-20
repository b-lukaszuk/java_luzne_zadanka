package classes;

public class PodstOperMatem {

    // results of 4 basic mathematical operations
    // for easier demonstration public fields, no getters/setters
    public double resOfAddition;
    public double resOfSubtraction;
    public double resOfMultiplication;
    public double resOfDivision;

    public PodstOperMatem(double digit1, double digit2) {
	resOfAddition = digit1 + digit2;
	resOfSubtraction = digit1 - digit2;
	resOfMultiplication = digit1 * digit2;
	// trivial protection against dividing by 0
	resOfDivision = digit2 != 0 ? digit1 / digit2 : digit1/1;
    }

    public static void main(String[] args) {

    }
}
