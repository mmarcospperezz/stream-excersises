import java.util.Date;
import java.util.List;
import java.util.Optional;

public class Ej9 {
    public static void main(String[] args) {
        var numbers = List.of(2.4, 5.3, 6.2);
        System.out.println(average(numbers));
        System.out.println(average(List.of()));
    }

    public static Optional<Double> average(List<Double> numbers){
        Optional<Double> sumOpt = numbers
                .stream()
                .reduce(Double::sum);
        return sumOpt
                .map(sum -> sum / numbers.size());
    }
}
