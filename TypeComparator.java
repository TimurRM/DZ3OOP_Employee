import java.util.Comparator;
public class TypeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        // Порядок: Фрилансеры, Контрактники, Работники
        if (o1 instanceof Freelancer && o2 instanceof Worker || o2 instanceof Contractor) {
            return -1;
        } else if (o1 instanceof Worker && o2 instanceof Freelancer || o1 instanceof Contractor && o2 instanceof Freelancer) {
            return 1;
        } else if (o1 instanceof Contractor && o2 instanceof Worker) {
            return -1;
        //} else if (o1 instanceof Worker && o2 instanceof Contractor) {
            //return 1;
        }
        return o1.surName.compareTo(o2.surName);
    }

}