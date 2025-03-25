import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;
import java.util.Locale;
import java.util.Set;

@Data
@AllArgsConstructor
public class Pedido {
    private LocalDate date;
    private double price;
    private List<OrderItem> orderItems;
}
