import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Aresta {
    private Vertice origem;
    private Vertice destino;

    private String nome;

    private int peso;

}
