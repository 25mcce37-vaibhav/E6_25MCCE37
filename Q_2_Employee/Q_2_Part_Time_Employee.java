package Q_2_Employee;

public class Q_2_Part_Time_Employee extends Q_2_Employee{
    int hourly_rate;
    public Q_2_Part_Time_Employee(int hourly_rate){
        super();
        this.hourly_rate = hourly_rate;
    }
    public int computePay(int hours_worked) {
        this.yearToDateEarnings = this.hourly_rate * hours_worked;
        return this.yearToDateEarnings;
    }

}
