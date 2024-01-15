//Steven Yan
//115780161
import java.util.Scanner;

public class Rational {
    private int num;
    private int den;

    Rational() {
        this.num = 0;
        this.den = 1;
    }

    Rational(int num, int den) {
        int a = num;
        int b = den;
        
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        
        this.num = num / a;
        this.den = den / a;
    }

    public static Rational add(Rational num1, Rational num2) {
        int newNum = num1.num * num2.den + num2.num * num1.den;
        int newDen = num1.den * num2.den;
        return new Rational(newNum, newDen);
    }

    public static Rational sub(Rational num1, Rational num2) {
        int newNum = num1.num * num2.den - num2.num * num1.den;
        int newDen = num1.den * num2.den;
        return new Rational(newNum, newDen);
    }

    public static Rational mult(Rational num1, Rational num2) {
        int newNum = num1.num * num2.num;
        int newDen = num1.den * num2.den;
        return new Rational(newNum, newDen);
    }

    public static Rational div(Rational num1, Rational num2) {
        int newNum = num1.num * num2.den;
        int newDen = num2.num * num1.den;
        return new Rational(newNum, newDen);
    }

    public String print() {
        return this.num + "/" + this.den;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter numerator for the first rational number: ");
        int num1 = input.nextInt();
        System.out.println("Enter a non-zero denominator for the first rational number: ");
        int den1 = input.nextInt();
        Rational frac1 = new Rational(num1, den1);

        System.out.println("Enter numerator for the second rational number: ");
        int num2 = input.nextInt();
        System.out.println("Enter a non-zero denominator for the second rational number: ");
        int den2 = input.nextInt();
        Rational frac2 = new Rational(num2, den2);

        System.out.println("First rational number is: " + frac1.print());
        System.out.println("Second rational number is: " + frac2.print());

        System.out.println("Addition of the rational numbers: " + Rational.add(frac1, frac2).print());
        System.out.println("Subtraction of the rational numbers: " + Rational.sub(frac1, frac2).print());
        System.out.println("Multiplication of the rational numbers: " + Rational.mult(frac1, frac2).print());
        System.out.println("Division of the rational numbers: " + Rational.div(frac1, frac2).print());
    }
}
