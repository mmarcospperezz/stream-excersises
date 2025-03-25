import java.util.List;

public class Ej5 {
    public static void main(String[] args) {
        var students = List.of(
                new Student("Bob", "Esponja", "bob@esponja.es", 28001),
                new Student("Peppa", "Pig", "peppa@esponja.es", 28002),
                new Student("George", "Pig", "george@esponja.es", 28002)
        );
        System.out.println(mapToMails(students));
    }

    public static List<String> mapToMails(List<Student> students){
        return students
                .stream()
                .map(Student::getMail)
                .toList();
    }

}
