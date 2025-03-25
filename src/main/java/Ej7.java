import java.util.List;

public class Ej7 {
    public static void main(String[] args) {
        var numbers = List.of(2.4, 5.3, 6.2);
        System.out.println(sum(numbers));

    }

    public static Double sum(List<Double> numbers){
        return numbers
                .stream()
                .reduce(0d,(a, b) -> a + b);
    }
}
