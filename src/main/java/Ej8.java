import java.util.List;

public class Ej8 {
    public static void main(String[] args) {
        var numbers = List.of(2, 5, 6, 7, 8);
        System.out.println(filterEvenNumbers(numbers));
    }

    public static List<Integer> filterEvenNumbers(List<Integer> students) {
        return students.stream()
                .filter(n -> n % 2 == 0)
                .toList();
    }
}
