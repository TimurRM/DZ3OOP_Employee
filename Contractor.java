public class Contractor extends Employee {
    private double monthlyRate;

    public Contractor(String surName, String name, String middleName, double monthlyRate, int age) {
        super(surName, name, middleName, monthlyRate, age); // Используйте monthlyRate как зарплату для упрощения
        this.monthlyRate = monthlyRate;
    }

    @Override
    public double calculateSalary() {
        return monthlyRate; // Просто возвращаем месячную ставку
    }

    @Override
    public String toString() {
        return String.format("%s %s %s, Возраст: %d, Месячная ставка: %.2f (Контрактник)",
                surName, name, middleName, age, monthlyRate);
    }
}
