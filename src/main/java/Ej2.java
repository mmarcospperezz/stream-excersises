import java.util.List;
import java.util.Optional;

public class Ej2 {
    public static void main(String[] args) {
        List<String> names = List.of("Bob", "Peppa", "George");
        Optional<String> name = first(names);
        Optional<Integer> number = first(List.of(1, 2, 3, 4));
        System.out.println(name);
        System.out.println(number);
    }

    public static <T> Optional<T> first(List<T> list) {
        return list
                .stream()
                .skip(1)
                .findFirst();
    }

}
