import org.w3c.dom.css.Counter;

import java.util.Arrays;

public class Main {
    public static Employee employee = new Employee("Иванов Иван Иванович ", 1, 35_000);
    public static String[] Employee = new String[10];

    public static void main(String[] args) {
        int departmentNumber[] = new int[5];
        for (int i = 1; i <= departmentNumber.length; i++) {
            System.out.println(employee.getId() + "." + employee.getFullName() + ", " +
                    i + ", " + employee.getSalary());
            employee.setDepartmentNumber(5);
            System.out.println("обратите внимание: перевод в отдел № " + employee.getDepartmentNumber());
            employee.setSalary(45_000);
            System.out.println("зарплата изменена: " + employee.getSalary());


            Employee[0] = ("Фролова Мария Ивановна, " + "номер отдела: 1, " + "зарплата: 25_000");
            Employee[1] = ("Макеева Мария Ивановна, " + "номер отдела: 1, " + "зарплата: 28_000");
            Employee[2] = ("Макеев Фёдор Иванович, " + "номер отдела: 2, " + "зарплата: 38_000");
            Employee[3] = ("Сапожников Виталий Игнатович, " + "номер отдела: 2, " + "зарплата: 39_000");
            Employee[4] = ("Заречин Филипп Алексеевич, " + "номер отдела: 3, " + "зарплата: 46_000");
            Employee[5] = ("Сапожников Александр Васильевич, " + "номер отдела: 3, " + "зарплата: 55_000");
            Employee[6] = ("Суровцев Вадим Анатольевич, " + "номер отдела: 4, " + "зарплата: 29_000");
            Employee[7] = ("Рыбаков Владимир Владимирович, " + "номер отдела: 4, " + "зарплата: 65_000");
            Employee[8] = ("Закуткин Максим Игоревич, " + "номер отдела: 5, " + "зарплата: 69_000");
            Employee[9] = ("Афанасьев Леонид Владиславович, " + "номер отдела: 5, " + "зарплата: 67_000");

            private static String printEmployees () {
                for (i = 0; i < Employee.length; i++) {
                    System.out.println(Employee[i]);
                }
            }
            private static void calculateSumSalary () {
                int sum = 0;
                for (i = 0; i < Employee.length; i++) {
                    sum += employee.getSalary();
                    System.out.println("Сумма затрат на зарплаты сотрудникам составляет " + sum + " рублей");
                }
                private static int calculateAverageSalary () {
                    double averageCosts = 0;
                    averageCosts = sum / Employee.length;
                    System.out.println("Средняя зарплата сотрудников: " + averageCosts);
                }
            }
            private static void findEmployeeWithMinSalary () {
                int minCosts = 0;
                for (i = 1; i < Employee.length; i++) {
                    if (employee.getSalary() < minCosts) {
                        minCosts = employee.getSalary();
                        break;
                    }
                    System.out.println("Сотрудник с минимальной зарплатой - " + minCosts + "рублей");
                }
            }
            private static void findEmployeeWithMaxSalary () {
                int maxCosts = -1;
                for (i = 0; i < Employee.length; i++) {
                    if (employee.getSalary() > maxCosts) {
                        maxCosts = employee.getSalary();
                        break;
                    }
                    System.out.println("Сотрудник с максимальной зарплатой - " + maxCosts + "рублей");
                }
                private static void printGetFullName () {
                    for (int a = 0; a < Employee.length; a++) {
                        System.out.println(employee.getFullName());
                    }
                }
            }
        }
    }
}


















