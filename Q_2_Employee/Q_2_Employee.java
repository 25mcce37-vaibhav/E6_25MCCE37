package Q_2_Employee;

public abstract class Q_2_Employee {
    public int yearToDateEarnings ;

    public abstract  int computePay(int number);
    public Q_2_Employee(){
        this.yearToDateEarnings = 0;
    }

}
