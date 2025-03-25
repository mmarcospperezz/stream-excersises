import java.util.List;
import java.util.Optional;

public class Ej3 {
    public static void main(String[] args) {
        Optional<Integer> number = last(List.of(1, 2, 3, 4));
        System.out.println(number);
    }

    public static <T> Optional<T> last(List<T> list){
        return list
                .stream()
                .skip(list.size() - 1)
                .findFirst();
    }
}
