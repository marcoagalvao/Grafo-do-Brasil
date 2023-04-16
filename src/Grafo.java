import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;

@Data
@AllArgsConstructor
public class Grafo {

    private ArrayList<Vertice> vertices;
    private ArrayList<Aresta> arestas;
    private int ordem;
    private int tamanho;

    public Grafo(){
        vertices = new ArrayList<>();
        arestas = new ArrayList<>();
    }

    public void addVertice(Vertice vertice){
        vertices.add(vertice);
        ordem++;
    }

    public void addAresta(Aresta aresta){
        arestas.add(aresta);
        tamanho++;
    }

    public void matrizAdjacencia(){
        int[][] matriz = new int[ordem][ordem];
        for (Aresta aresta : arestas){
            int origem = vertices.indexOf(aresta.getOrigem());
            int destino = vertices.indexOf(aresta.getDestino());
            matriz[origem][destino] = 1;
        }

        System.out.println();
        System.out.println("e) Matriz de Adjacência: ");

        for (Vertice v : vertices){
            System.out.print("  " + v.getNome());
        }

        System.out.println();

        for (int i = 0; i < ordem; i++){
            System.out.print(vertices.get(i).getNome() + " ");
            for(int j = 0; j < ordem; j++){
                System.out.print(" " + matriz[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public void grau(){
        System.out.println();
        for (Vertice v : vertices){
            int grau = 0;
            for(Aresta a : arestas){
                if(a.getOrigem() == v){
                    grau++;
                }
                if(a.getDestino() == v){
                    grau++;
                }
            }
            v.setGrau(grau);
        }
        int maior = 0;
        String nomeMaiorGrau = "";
        for (Vertice v: vertices){
            if(v.getGrau() > maior){
                maior = v.getGrau();
                nomeMaiorGrau = v.getNome();
            }
            System.out.println("O estado " + v.getNome() + " possui grau " + v.getGrau());
        }
        System.out.println();
        System.out.println("Maior grau: " + nomeMaiorGrau + " ("+ maior + ")");
    }


    public void respostasAtividade(){
        System.out.println();
        System.out.println("a) O grafo é DIRECIONADO, uma vez que há possibilidades de ir por caminhos distintos, rotas alternativas e direções específicas");
        System.out.println("b) Ordem: " + ordem);
        System.out.println("c) Tamanho: " + tamanho);
        System.out.println("d) Vértice de maior grau: ");

        System.out.println("f) Trajeto mais curto entre a PB e TO: PB - PE - PI - TO");
        System.out.println("Total de km's percorrendo esse trajeto: 1871 km");
    }

}
