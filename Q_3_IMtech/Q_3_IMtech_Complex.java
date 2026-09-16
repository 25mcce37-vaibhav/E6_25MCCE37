package Q_3_IMtech;

public class Q_3_IMtech_Complex implements Q_3_Imtech_Number {

    int real;
    int imag;

    public Q_3_IMtech_Complex(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getMag() {
        return Math.sqrt(real * real + imag * imag);
    }

    public int getReal() {
        return real;
    }

    public int getImag() {
        return imag;
    }

    public String toString() {

        if (imag >= 0) {
            return real + " + " + imag + "i";
        }
        else {
            return real + " - " + (-imag) + "i";
        }
    }

    public boolean equals_To(Q_3_Imtech_Number n) {

        Q_3_IMtech_Complex other = (Q_3_IMtech_Complex) n;

        return real == other.real && imag == other.imag;
    }

    public int compare_To(Q_3_Imtech_Number n) {

        Q_3_IMtech_Complex other = (Q_3_IMtech_Complex) n;

        if (getMag() < other.getMag()) {
            return -1;
        }
        else if (getMag() == other.getMag()) {
            return 0;
        }
        else {
            return 1;
        }
    }

    public Q_3_Imtech_Number add_To(Q_3_Imtech_Number n) {

        if (n instanceof Q_3_IMtech_Complex) {

            Q_3_IMtech_Complex other = (Q_3_IMtech_Complex) n;

            return new Q_3_IMtech_Complex(
                    real + other.real,
                    imag + other.imag
            );
        }

        else if (n instanceof Q_3_Imtech_Integer) {

            Q_3_Imtech_Integer other = (Q_3_Imtech_Integer) n;

            return new Q_3_IMtech_Complex(
                    real + other.num,
                    imag
            );
        }

        return null;
    }

    public Q_3_Imtech_Number sub_From(Q_3_Imtech_Number n) {

        Q_3_IMtech_Complex other = (Q_3_IMtech_Complex) n;

        return new Q_3_IMtech_Complex(
                real - other.real,
                imag - other.imag
        );
    }

    public Q_3_Imtech_Number muti_With(Q_3_Imtech_Number n) {

        Q_3_IMtech_Complex other = (Q_3_IMtech_Complex) n;

        int r = real * other.real - imag * other.imag;

        int i = real * other.imag + imag * other.real;

        return new Q_3_IMtech_Complex(r, i);
    }

    public Q_3_Imtech_Number divide_By(Q_3_Imtech_Number n) {

        Q_3_IMtech_Complex other = (Q_3_IMtech_Complex) n;

        int denominator =
                other.real * other.real +
                        other.imag * other.imag;

        int r =
                (real * other.real + imag * other.imag)
                        / denominator;

        int i =
                (imag * other.real - real * other.imag)
                        / denominator;

        return new Q_3_IMtech_Complex(r, i);
    }
}