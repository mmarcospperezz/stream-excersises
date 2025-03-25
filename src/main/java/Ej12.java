import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Ej12 {
    public static void main(String[] args) {
        List<Double> list1 = List.of(1.2, 3.4, 5.6, 7.8);
        List<Double> list2 = List.of(3.4, 7.8, 9.0, 10.1);

        System.out.println(junction(list1, list2));
    }

    public static List<Double> junction(List<Double> numbers1, List<Double> numbers2) {
        Set<Double> setNumbers2 = numbers2.stream().collect(Collectors.toSet());
        return numbers1
                .stream()
                .filter(setNumbers2::contains)
                .collect(Collectors.toList());
    }
}
