import java.util.List;

public class Ej1 {
    public static void main(String[] args) {
        List<String> names = List.of("Bob", "Peppa", "George");

        names
                .stream()
                .forEach(System.out::println);
    }
}
