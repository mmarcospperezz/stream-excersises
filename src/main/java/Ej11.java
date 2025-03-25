import java.util.List;
import java.util.Optional;

public class Ej11 {
    public static void main(String[] args) {
        var numbers = List.of(1d, 2d, 3d, 4d, 5d, 6d, 7d, 8d, 9d, 10d);
        System.out.println(min(numbers));
    }

    public static Optional<Double> min(List<Double> numbers){
        return numbers
                .stream()
                .min(Double::compareTo);
    }
}
