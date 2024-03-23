import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        Employee[] employees = EmployeeFabric.generateEmployees(10);

        System.out.println("Сотрудники до сортировки:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        // Сортировка по имени и фамилии
        System.out.println("\nСотрудники после сортировки по имени и фамилии:");
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
    }
}

