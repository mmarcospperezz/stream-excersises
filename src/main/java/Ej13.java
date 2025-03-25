import java.time.LocalDate;
import java.util.List;

public class Ej13 {
    public static void main(String[] args) {
        var orders = List.of(
                new Pedido(LocalDate.now(), 34, List.of(
                        new OrderItem(1, "Tornillo", 2),
                        new OrderItem(2, "Tuercas", 2),
                        new OrderItem(3, "Destornillador", 2)
                        )),
                new Pedido(LocalDate.now(), 342, List.of(
                        new OrderItem(1, "Clavo", 2),
                        new OrderItem(2, "Chinchetas", 2)
                ))
        );

        System.out.println(ordersPrices(orders));
    }

    public static List<Double> ordersPrices(List<Pedido> orders){
        return orders
                .stream()
                .map(Pedido::getPrice)
                .toList();
    }
}
