package comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortEmployees {
    public static void main(String[] args) {
        List<Employee> employeesList = Arrays.asList(
                new Employee("Alice", 90000),
                new Employee("Bob", 75000),
                new Employee("Charlie", 90000),
                new Employee("David", 50000)
        );

        // Sorting by salary (descending/ascending), then name alphabetically
        employeesList .sort(
                Comparator.comparingDouble(Employee::getSalary)
                        .thenComparing(Employee::getName)
        );

        employeesList.forEach(System.out::println);
    }
}
