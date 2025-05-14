package pedido.model;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pedido {
    private Long id;
    private LocalDateTime fecha;
    private String estado;
    private int total;
    private Cliente cliente;
}