package Test;
import Q_3_IMtech.*;

public class Q_3_Test {

    public static void main(String[] args) {
        Q_3_Imtech_Integer n1 = new Q_3_Imtech_Integer(25);
        Q_3_Imtech_Integer n2 = new Q_3_Imtech_Integer(5);

        System.out.println("INTEGER");
        System.out.println("Number 1 = " + n1);
        System.out.println("Number 2 = " + n2);
        System.out.println("Digit at position 0 = " + n1.getDigit(0));
        System.out.println("Digit at position 1 = " + n1.getDigit(1));
        System.out.println("Is 25 prime? = " + n1.is_prime());
        System.out.println("Equal = " + n1.equals_To(n2));
        System.out.println("Compare = " + n1.compare_To(n2));
        System.out.println("Addition = " + n1.add_To(n2));
        System.out.println("Subtraction = " + n1.sub_From(n2));
        System.out.println("Multiplication = " + n1.muti_With(n2));
        System.out.println("Division = " + n1.divide_By(n2));

        Q_3_IMtech_Complex c1 = new Q_3_IMtech_Complex(3, 4);
        Q_3_IMtech_Complex c2 = new Q_3_IMtech_Complex(1, 2);
        System.out.println();
        System.out.println("Complex 1 = " + c1);
        System.out.println("Complex 2 = " + c2);
        System.out.println("Real part = " + c1.getReal());
        System.out.println("Imaginary part = " + c1.getImag());
        System.out.println("Magnitude = " + c1.getMag());
        System.out.println("Equal = " + c1.equals_To(c2));
        System.out.println("Compare = " + c1.compare_To(c2));
        System.out.println("Addition = " + c1.add_To(c2));
        System.out.println("Subtraction = " + c1.sub_From(c2));
        System.out.println("Multiplication = " + c1.muti_With(c2));
        System.out.println("Division = " + c1.divide_By(c2));

        System.out.println("MIXED ADDITION");

        System.out.println("Integer + Complex = " + n1.add_To(c1));
        System.out.println("Complex + Integer = " + c1.add_To(n1));
    }
}