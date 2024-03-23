import java.util.Random;

public class EmployeeFabric {
    private static Random random = new Random();

    public static Worker generateWorker() {
        String[] names = {"Анатолий", "Глеб", "Сергей", "Иван", "Петр"};
        String[] surnames = {"Иванов", "Петров", "Сидоров", "Захаров", "Рогов"};
        int salary = random.nextInt(50000) + 50000; // Заработная плата от 50,000 до 100,000
        int age = 18 + random.nextInt(43); // Возраст от 18 до 60 лет
        return new Worker(surnames[random.nextInt(surnames.length)], names[random.nextInt(names.length)], salary, age);
    }

    public static Freelancer generateFreelancer() {
        String[] names = {"Анатолий", "Глеб", "Сергей", "Иван", "Петр"};
        String[] surnames = {"Иванов", "Петров", "Сидоров", "Захаров", "Рогов"};
        double hourlyRate = 100 + random.nextInt(50); // Почасовая ставка от 100 до 150
        int age = 18 + random.nextInt(43);
        return new Freelancer(surnames[random.nextInt(surnames.length)], names[random.nextInt(names.length)], hourlyRate, age);
    }

    public static Employee[] generateEmployees(int count) {
        Employee[] employees = new Employee[count];
        for (int i = 0; i < count; i++) {
            if (random.nextBoolean()) {
                employees[i] = generateWorker();
            } else {
                employees[i] = generateFreelancer();
            }
        }
        return employees;
    }
}

