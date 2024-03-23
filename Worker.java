public class Worker extends Employee {
    public Worker(String surName, String name, String middleName, double salary, int age) {
        super(surName, name, middleName, salary, age);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s, Возраст: %d, Заработная плата: %.2f (Работник)",
                surName, name, middleName, age, calculateSalary());
    }
}

