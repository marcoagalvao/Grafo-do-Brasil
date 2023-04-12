import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Aresta {
    private Vertice origem;
    private Vertice destino;
    private String nome;
    private int peso;
}
