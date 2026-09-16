package Test;
import java.util.Scanner;
import Q_2_Employee.*;
public class Q_2_Test {
    public static void main(){
        Scanner input = new Scanner(System.in);
        System.out.println("please choose from one of the options :- ");
        System.out.println("1)permanent employee 2)temporary employee");
        int i = input.nextInt();
        input.nextLine();
        if(i==1){
            System.out.println("please enter the monthly rate of the employee , i.e salary");
            int mr = input.nextInt();
            input.nextLine();
            Q_2_Full_Time_Employee f1 = new Q_2_Full_Time_Employee(mr);
            System.out.println("enter the number of months worked ");
            int months = input.nextInt();
            System.out.println("total pay of the employee is " + f1.computePay(months));
        }
        else if(i==2){
            System.out.println("please enter the hourly rate of the employee");
            int hourly_rate = input.nextInt();
            input.nextLine();
            Q_2_Part_Time_Employee p1 = new Q_2_Part_Time_Employee(hourly_rate);
            System.out.println();
            System.out.println("please enter the number of hours worked by the part time employee");
            int hours = input.nextInt();
            System.out.println("total pay of the employee is " + p1.computePay(hours));
        }
        input.close();
    }
}
