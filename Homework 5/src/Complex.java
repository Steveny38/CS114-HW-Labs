//Steven Yan
//115780161

import java.util.Scanner;

public class Complex {
	private double realPart;
	private double imaginaryPart;
	
	public Complex() {}
	
	public Complex(double realPart, double imaginaryPart) {
		this.realPart = realPart;
		this.imaginaryPart = imaginaryPart;
	}

	public static Complex addNum(Complex num1, Complex num2) {
		double real = num1.realPart + num2.realPart;
		double imaginary = num1.imaginaryPart+ num2.imaginaryPart;
		return new Complex(real, imaginary);
	}
	
	public static Complex subNum(Complex num1, Complex num2) {
		double real = num1.realPart - num2.realPart;
		double imaginary = num1.imaginaryPart - num2.imaginaryPart;
		return new Complex(real, imaginary);
	}
	
	public String print() {
		return "(" + this.realPart + "," + this.imaginaryPart + ")";
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Complex num1 = new Complex();
		Complex num2 = new Complex();
		
		System.out.println("Enter real part of the first complex number: ");
		num1.realPart = input.nextDouble();

		System.out.println("Enter imaginary part of the first complex number: ");
		num1.imaginaryPart = input.nextDouble();


		System.out.println("Enter real part of the second complex number: ");
		num2.realPart = input.nextDouble();

		System.out.println("Enter imaginary part of the second complex number: ");
		num2.imaginaryPart = input.nextDouble();
		
		System.out.println("First complex number is: " + num1.print());
		System.out.println("Second complex number is: " + num2.print());
		
		Complex sum = Complex.addNum(num1, num2);
		Complex diff = Complex.subNum(num1, num2);
		
		System.out.println("Addition of the complex numbers is: " + sum.print());
		System.out.println("Subtraction of the complex numbers is: " + diff.print());
		
	}

}
