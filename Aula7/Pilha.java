package Aula7;
import Aula7.No;

public class Pilha<T>{
    No topo;
    int tamanho;
    
    public Pilha(){
        tamanho = 0;
        topo = null;
    }

    public boolean isEmpty(){
        return topo == null;
    }

    public void push(T info){
        No no = new No();
        no.setElemento(info);
        no.setProximo(topo);
        topo = no;
        tamanho++;
    }

}
