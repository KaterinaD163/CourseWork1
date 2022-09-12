import org.w3c.dom.css.Counter;

import java.util.Arrays;

public class Main {
    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        Employee employees1 = new Employee("Фролова Мария Ивановна", 1, 25_000);
        Employee employees2 = new Employee("Макеева Мария Ивановна", 1, 28_000);
        Employee employees3 = new Employee("Макеев Фёдор Иванович", 2, 38_000);
        Employee employees4 = new Employee("Сапожников Виталий Игнатович", 2, 39_000);
        Employee employees5 = new Employee("Заречин Филипп Алексеевич", 3, 46_000);
        Employee employees6 = new Employee("Сапожников Александр Васильевич", 3, 55_000);
        Employee employees7 = new Employee("Суровцев Вадим Анатольевич", 4, 9_000);
        Employee employees8 = new Employee("Рыбаков Владимир Владимирович", 4, 65_000);
        Employee employees9 = new Employee("Закуткин Максим Игоревич", 5, 69_000);
        Employee employees10 = new Employee("Афанасьев Леонид Владиславович", 5, 67_000);

        employees[0] = employees1;
        employees[1] = employees2;
        employees[2] = employees3;
        employees[3] = employees4;
        employees[4] = employees5;
        employees[5] = employees6;
        employees[6] = employees7;
        employees[7] = employees8;
        employees[8] = employees9;
        employees[9] = employees10;
        printEmployees();
        System.out.println("Сумма затрат на зарплаты сотрудникам составляет " + calculateSumSalary() + " рублей");
        System.out.println("Средняя зарплата сотрудников: " + calculateAverageSalary() + " рублей");
        findEmployeeWithMinSalary();
        findEmployeeWithMaxSalary();
        printListEmployees();
    }

    private static void printEmployees() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

    private static int calculateSumSalary() {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalary();
        }
        return sum;
    }


    private static int calculateAverageSalary() {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalary();
            double averageCosts = 0.0;
            averageCosts = sum / employees.length;
        }
        return sum / employees.length;
    }

    private static void findEmployeeWithMinSalary() {
        int minSalary = employees[0].getSalary();
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
                System.out.println("Сотрудник с минимальной зарплатой - " + employees[i].getFullName() + " (" +
                        minSalary + " рублей)");
            }
        }
    }

    private static void findEmployeeWithMaxSalary() {
        int maxSalary = employees[9].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
                System.out.println("Сотрудник с максимальной зарплатой - " + employees[i].getFullName() + " (" +
                        maxSalary + " рублей)");
            }
        }
    }

    private static void printListEmployees() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getFullName());
        }
    }
}
