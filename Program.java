import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        Employee[] employees = EmployeeFabric.generateEmployees(10);

        System.out.println("Сотрудники до сортировки:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        // Сортировка по ФИО
        System.out.println("\nСотрудники после сортировки по ФИО:");
        Arrays.sort(employees);
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        // Сортировка по возрасту
        System.out.println("\nСотрудники после сортировки по возрасту:");
        Arrays.sort(employees, new AgeComparator());
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        // Сортировка по зарплате
        System.out.println("\nСотрудники после сортировки по зарплате:");
        Arrays.sort(employees, new SalaryComparator());
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        // Сортировка по типу сотрудника: фрилансеры идут первыми
        System.out.println("\nСотрудники после сортировки по типу (Фрилансеры/Работники):");
        Arrays.sort(employees, new TypeComparator());
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        int workersCount = 0, freelancersCount = 0, contractorsCount = 0;
        for (Employee employee : employees) {
            if (employee instanceof Worker) {
                workersCount++;
            } else if (employee instanceof Freelancer) {
                freelancersCount++;
            } else if (employee instanceof Contractor) {
                contractorsCount++;
            }
        }

        System.out.println("\nОбщее количество сотрудников: " + employees.length);
        System.out.println("Количество работников: " + workersCount);
        System.out.println("Количество фрилансеров: " + freelancersCount);
        System.out.println("Количество контрактников: " + contractorsCount);
    }
}


