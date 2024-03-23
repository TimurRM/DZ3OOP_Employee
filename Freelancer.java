public class Freelancer extends Employee {
    public double hourlyRate;

    public Freelancer(String surName, String name, String middleName, double hourlyRate, int age) {
        super(surName, name, middleName, 0, age); // Зарплата устанавливается в 0, так как рассчитывается по-другому
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return 20.8 * 8 * hourlyRate;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s, Возраст: %d, Почасовая ставка: %.2f, Среднемесячная зарплата: %.2f (Фрилансер)",
                surName, name, middleName, age, hourlyRate, calculateSalary());
    }
}

