// Payroll.java
// Main program to calculate regular and overtime pay for an employee
import java.util.Scanner;

public class Payroll {
    private static Employee createEmployee(double payRate) {
        int defaultEmployeeNumber = 0; 
        return new Employee(defaultEmployeeNumber, payRate);
    }
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        System.out.print("How many hours did you work this week? ");
        double hours = kb.nextDouble();
        
        System.out.print("What is your regular pay rate? ");
        double rate = kb.nextDouble();
        
        Employee employee = createEmployee(rate);
        
        double regularHours = Math.min(40.0, hours);
        double regularPay = regularHours * rate;
        
        double overtimeHours = Math.max(0.0, hours - 40.0);
        double overtimePay = overtimeHours * rate * Employee.OVERTIME_MULTIPLIER;
        
        System.out.println("Regular pay is " + regularPay);
        System.out.println("Overtime pay is " + overtimePay);
        
        kb.close();    }
}