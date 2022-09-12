import java.util.Arrays;

public class Employee {
    private String fullName;
    private int departmentNumber;
    private int salary;
    private static int counter = 1;
    private int id;

    public Employee(String fullName, int departmentNumber, int salary) {
        this.fullName = fullName;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
        this.id = counter++;


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

        return this.id;
    }

    public String toString() {
        return this.id + ". " + this.fullName + ", Отдел №" + this.departmentNumber++ + ", Зарплата " + this.salary;
    }

    public void setDepartmentNumber(int departmentNumber) {

        this.departmentNumber = departmentNumber;
    }

    public void setSalary(int salary) {

        this.salary = salary;
    }
}
