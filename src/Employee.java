import java.util.Arrays;

public class Employee {
    private String fullName;
    private int departmentNumber;
    private int salary;
    private static int counter = 1;
    private int id = counter;

    public Employee(String fullName, int departmentNumber, int salary) {
        this.fullName = fullName;
        this.departmentNumber = departmentNumber;
        this.salary = salary;


    }

    public String getFullName() {

        return this.fullName;
    }

    public int getDepartmentNumber() {

        return this.departmentNumber;
    }

    public int getSalary() {

        return this.salary;
    }

    public int getId() {

        return this.id++;
    }

    public String toString() {
        return id + ". " + this.fullName + ", Отдел №" + this.departmentNumber++ + ", Зарплата " + this.salary;
    }

    public void setDepartmentNumber(int departmentNumber) {

        this.departmentNumber = departmentNumber;
    }

    public void setSalary(int salary) {

        this.salary = salary;
    }

    private static void printFullName(String[] fullName) {

        System.out.println(fullName);
    }

    private static int calculateSumSalary(int salary) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += salary;
            double averageCosts = 0;
            averageCosts = sum / 10;
        }
        return sum;
    }

    private static void findEmployeeWithMinSalary() {
        String[] Employee = new String[10];
        int minCosts = 0;
        for (int i = 1; i < Employee.length; i++) {
            if ( Employee[i].length()< minCosts) ;
            minCosts = Employee[i].length();
            break;
        }
        System.out.println("Сотрудник с минимальной зарплатой - " + minCosts + "рублей");
    }

    private static void findEmployeeWithMaxSalary() {
        String[] Employee = new String[10];
        int maxCosts = -1;
        for (int i = 0; i < Employee.length; i++) {
            if (Employee[i].length() > maxCosts) ;
            maxCosts = Employee[i].length();
            break;
        }
        System.out.println("Сотрудник с максимальной зарплатой - " + maxCosts + "рублей");
    }
}

