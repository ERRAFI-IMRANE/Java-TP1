import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        List<Employer> employers = new ArrayList<>();

        employers.add(new Employer("Ali", 25, 3500.0, "Informatique"));
        employers.add(new Employer("Sara", 30, 4200.0, "Comptabilité"));
        employers.add(new Employer("Youssef", 28, 3800.0, "Marketing"));
        employers.add(new Employer("Imane", 35, 5000.0, "Ressources Humaines"));
        employers.add(new Employer("Karim", 26, 3600.0, "Informatique"));
        employers.add(new Employer("Nadia", 40, 5500.0, "Direction"));
        employers.add(new Employer("Omar", 32, 4100.0, "Logistique"));
        employers.add(new Employer("Fatima", 29, 3900.0, "Communication"));
        employers.add(new Employer("Hassan", 45, 6000.0, "Finance"));
        employers.add(new Employer("Lina", 27, 3700.0, "Informatique"));

        // Display the list
        List<Employer> sortedList = employers.stream()
                .sorted(Comparator.comparingInt(Employer::getAge))
                .toList();

        List<Employer> filtredList = employers.stream()
                .filter( employer -> employer.getDepartement().equals("Informatique"))
                .toList();
        // Display the sorted list

        List<Employer> mapedList = employers.stream()
        .map(employer -> new Employer(
                employer.getName(),
                employer.getAge(),
                employer.getsalaire() * 1.1,
                employer.getDepartement()
        ))
        .toList();

        List<Employer> sortedList2 = employers.stream()
                .sorted(Comparator.comparingDouble(Employer::getsalaire))
                .toList();


        List<Employer> limitedList = employers.stream()
                .sorted(Comparator.comparingDouble(Employer::getsalaire).reversed())
                .limit(3)
                .toList();

        List<Employer> yougest = employers.stream()
                .sorted(Comparator.comparingInt(Employer::getAge))
                .limit(1)
                .toList();

        double totalSalaireFinance = employers.stream()
            .filter(e -> e.getDepartement().equalsIgnoreCase("Finance"))
            .mapToDouble(Employer::getsalaire)
            .sum();

        employers.stream()
            .map(Employer::getDepartement)   
            .distinct()                      
            .forEach(System.out::println);

        employers.forEach(System.out::println);
    }
}
