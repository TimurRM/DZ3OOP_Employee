import java.util.Comparator;
public class TypeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        // Фрилансеры идут первыми, затем работники
        if (o1 instanceof Freelancer && o2 instanceof Worker) {
            return -1;
        } else if (o1 instanceof Worker && o2 instanceof Freelancer) {
            return 1;
        }
        // Если оба объекта одного типа, сортировка производится по фамилии
        return o1.surName.compareTo(o2.surName);
    }
}

