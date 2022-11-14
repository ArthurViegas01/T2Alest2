package Trabalho2;

public class AulaDigrafo {
    public static void main(String args[]){

        Digraph DG = new Digraph(10);

        DG.addEdge(0, 1);
        DG.addEdge(0, 2);
        DG.addEdge(0, 3);
        DG.addEdge(3, 9);
        DG.addEdge(8, 9);
        DG.addEdge(4, 5);
        DG.addEdge(4, 6);
        DG.addEdge(4, 7);
        DG.addEdge(5, 6);
        DG.addEdge(7, 1);
        DG.addEdge(7, 2);

        System.out.println(DG.toDot());

        DigrafoBuscaProfundidade dfs1 = new DigrafoBuscaProfundidade(DG, 0);
    }
}
