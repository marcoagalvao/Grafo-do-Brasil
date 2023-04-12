import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Vertice {

    private String nome;
    private int grau;

    public Vertice(String nome){
        this.nome = nome;
    }
}
