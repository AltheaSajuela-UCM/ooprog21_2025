// Employee.java
// Model class for an employee with relevant attributes and constants
public class Employee {
    private int employeeNumber;
    private double payRate;
    
    public static final int MAX_EMPLOYEE_NUMBER = 9999;
    public static final double MAX_RATE = 60.00;
    public static final double OVERTIME_MULTIPLIER = 1.5;
    
    public Employee(int employeeNumber, double payRate) {
        this.employeeNumber = employeeNumber;
        this.payRate = payRate;
    }
    
    public int getEmployeeNumber() {
        return employeeNumber;
    }
    
    public double getPayRate() {
        return payRate;
    }
}