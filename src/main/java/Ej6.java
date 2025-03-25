import java.util.List;

public class Ej6 {
    public static void main(String[] args) {
        var students = List.of(
                new Student("Bob", "Esponja", "bob@esponja.es", 28001),
                new Student("Peppa", "Pig", "peppa@esponja.es", 28002),
                new Student("George", "Pig", "george@esponja.es", 28002)
        );

        System.out.println(filterByZipCode(students, 28002));
    }

    public static List<Student> filterByZipCode(List<Student> students, int zipCode) {
        return students.stream()
                .filter(student -> student.getZipCode() == zipCode)
                .toList();
    }
}
