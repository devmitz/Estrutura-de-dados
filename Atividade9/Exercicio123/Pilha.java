package Atividade9.Exercicio123;

import Aula7.No;

public class Pilha<T> {

    // Variável que mantém uma referência para o topo da pilha.
    private No topo;
    // Variável para rastrear o tamanho da pilha.
    private int tamanho;

    // Getters e Setters
    public Aula7.No getTopo() {
        return topo;
    }

    public void setTopo(Aula7.No topo) {
        this.topo = topo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    // Construtor da pilha.
    public Pilha() {
        tamanho = 0; // Inicializa o tamanho como zero.
        topo = null; // Inicializa o topo como nulo, indicando uma pilha vazia.
    }

    // Método para verificar se a pilha está vazia.
    public boolean isEmpty() {
        return topo == null; // A pilha está vazia se o topo for nulo.
    }

    // Método para adicionar um elemento à pilha (push).
    public void push(T info) {
        Aula7.No no = new No(); // Cria um novo nó.
        no.setElemento(info); // Define o elemento do nó com a informação passada.
        no.setProximo(topo); // Define o próximo nó como o antigo topo.
        topo = no; // Atualiza o topo para o novo nó.
        tamanho++; // Aumenta o tamanho da pilha.
    }

    public Object pop(){
        if( isEmpty() )
            return null;
        String info = topo.getElemento().toString();
        topo = topo.getProximo();
        tamanho--;
        return info;
    }
}
