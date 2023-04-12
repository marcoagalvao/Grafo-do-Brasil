import java.util.ArrayList;

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
        System.out.println("Matriz de Adjacência do Grafo do Brasil");

        for (Vertice v : vertices){
            System.out.print("  " + v.getNome());
        }

        for (int i = 0; i < ordem; i++){
            System.out.print(vertices.get(i).getNome() + " ");
            for(int j = 0; j < ordem; j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }
}
