import java.util.List;
import java.util.stream.Collectors;

public class Ej4 {
    public static void main(String[] args) {
        List<Integer> numbers = sum10(List.of(4, 7));
        System.out.println(numbers);
    }

    public static List<Integer> sum10(List<Integer> numbers) {
        return numbers
                .stream()
                .map(n -> n + 10)
                .collect(Collectors.toList());
    }
}
