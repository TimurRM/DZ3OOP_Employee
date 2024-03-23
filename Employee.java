public abstract class Employee implements Comparable<Employee> {
    protected String name;
    protected String middleName;
    protected String surName;
    protected double salary;
    protected int age; // Добавленный возраст

    public Employee(String surName, String name, String middleName, double salary, int age) {
        this.surName = surName;
        this.name = name;
        this.middleName = middleName;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public int compareTo(Employee o) {
        int surNameRes = surName.compareTo(o.surName);
        if (surNameRes == 0) {
            return name.compareTo(o.name);
        }
        return surNameRes;
    }

    public int getAge() {
        return age;
    }

    public abstract double calculateSalary();
}


