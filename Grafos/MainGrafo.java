package Grafos;

public class MainGrafo {
    public static void main(String[] args) {
        Grafo<String> grafo = new Grafo<>();
        grafo.adicionarVertice("Casa do Joao");
        grafo.adicionarVertice("Armazem");
        grafo.adicionarVertice("Banca de Jornal");
        grafo.adicionarVertice("Pracinha");
        grafo.adicionarVertice("Quitanda");
        grafo.adicionarVertice("Cancela");
        grafo.adicionarVertice("Escola");

        grafo.adicionarAresta(5.0, "Casa do Joao", "Armazem");
        grafo.adicionarAresta(13.0, "Armazem", "Banca de Jornal");
        grafo.adicionarAresta(6.0, "Casa do Joao", "Pracinha");
        grafo.adicionarAresta(10.0, "Casa do Joao", "Quitanda");
        grafo.adicionarAresta(11.0, "Banca de Jornal", "Pracinha");
        grafo.adicionarAresta(6.0, "Banca de Jornal", "Quitanda");
        grafo.adicionarAresta(3.0, "Banca de Jornal", "Escola");
        grafo.adicionarAresta(3.0, "Pracinha", "Quitanda");
        grafo.adicionarAresta(6.0, "Pracinha", "Cancela");
        grafo.adicionarAresta(4.0, "Quitanda", "Cancela");
        grafo.adicionarAresta(8.0, "Cancela", "Escola");

        grafo.buscaEmLargura();
    }
}
