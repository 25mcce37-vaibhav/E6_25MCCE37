package Q_3_IMtech;

public class Q_3_Imtech_Integer implements Q_3_Imtech_Number{
    int num;
    int num_digits;
    boolean is_Prime;
    public Q_3_Imtech_Integer(){
        this.num =0;
        this.num_digits =1;
        this.is_Prime = false;
    }
    public Q_3_Imtech_Integer(int num){
        this.num = num;
        this.num_digits = countDigits(num);
        this.is_Prime = checkPrime(num);
    }
    private int countDigits(int n ){
        if(n==0){
            return 1;
        }
        int count =0;
        while(n>0){
            n = n/10 ;
            count++;
        }
        return count;

    }

    private boolean checkPrime(int n){
        if(n<2){
            return false;
        }
        else{
            for(int i = 2;i<=Math.sqrt(num);i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
        }
    }

    public int getDigit(int dnum){
            for(int i =0;i<dnum;i++){
                num = num/10;
            }
            return num%10;
    }

    public boolean  is_prime(){
        return is_Prime;
    }

    @Override
    public String toString(){
        return String.valueOf(num);
    }

    @Override
    public boolean equals_To(Q_3_Imtech_Number num){
        Q_3_Imtech_Integer num1 = (Q_3_Imtech_Integer) num;
        return this.num == num1.num ;
    }

    @Override
    public int compare_To(Q_3_Imtech_Number num){
        Q_3_Imtech_Integer  num1 = (Q_3_Imtech_Integer) num ;

        if(this.num > num1.num){
            return -1;
        }
        else if (this.num == num1.num) {
            return 0;
        }
        else {
            return 1;
        }

    }

    public Q_3_Imtech_Number add_To(Q_3_Imtech_Number n) {
        if (n instanceof Q_3_Imtech_Integer) {

            Q_3_Imtech_Integer other = (Q_3_Imtech_Integer) n;

            return new Q_3_Imtech_Integer(this.num + other.num);
        }

        else if (n instanceof Q_3_IMtech_Complex) {

            Q_3_IMtech_Complex other = (Q_3_IMtech_Complex) n;

            return new Q_3_IMtech_Complex(this.num + other.real, other.imag);
        }

        return null;
    }

    public Q_3_Imtech_Number sub_From(Q_3_Imtech_Number num){
        Q_3_Imtech_Integer other = (Q_3_Imtech_Integer) num;
        return new Q_3_Imtech_Integer(this.num + other.num);
    }
    public Q_3_Imtech_Number muti_With(Q_3_Imtech_Number num) {
        Q_3_Imtech_Integer other = (Q_3_Imtech_Integer) num;

        return new Q_3_Imtech_Integer(this.num * other.num);
    }

    public Q_3_Imtech_Number divide_By(Q_3_Imtech_Number num) {
        Q_3_Imtech_Integer other = (Q_3_Imtech_Integer) num;

        return new Q_3_Imtech_Integer(this.num / other.num);
    }




}
