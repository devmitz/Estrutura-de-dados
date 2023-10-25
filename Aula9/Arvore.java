package Aula9;

import java.util.LinkedList;
import java.util.Queue;

public class Arvore<TIPO extends Comparable> {

    private Elemento<TIPO> raiz;

    public Arvore(){
        this.raiz = null;
    }

    public void adicionar(TIPO valor){
        Elemento<TIPO> novoElemento = new Elemento<TIPO>(valor);
        if (raiz == null){
            this.raiz = novoElemento;
        }else{
            Elemento<TIPO> atual = this.raiz;
            while(true){
                if (novoElemento.getValor().compareTo(atual.getValor()) == -1){
                    if (atual.getEsquerda() != null){
                        atual = atual.getEsquerda();
                    }else{
                        atual.setEsquerda(novoElemento);
                        break;
                    }
                }else{ //se for maior ou igual
                    if (atual.getDireita() != null){
                        atual = atual.getDireita();
                    }else{
                        atual.setDireita(novoElemento);
                        break;
                    }
                }
            }
        }
    }

    public Elemento<TIPO> getRaiz() {
        return raiz;
    }

    public void emOrdem(Elemento<TIPO> atual){
        if (atual != null) {
            emOrdem(atual.getEsquerda());
            System.out.println(atual.getValor());
            emOrdem(atual.getDireita());
        }
    }

    public void preOrdem(Elemento<TIPO> atual) {
        if (atual != null) {
            System.out.println(atual.getValor());
            preOrdem(atual.getEsquerda());
            preOrdem(atual.getDireita());
        }
    }

    public void posOrdem(Elemento<TIPO> atual){
        if (atual != null) {
            posOrdem(atual.getEsquerda());
            posOrdem(atual.getDireita());
            System.out.println(atual.getValor());
        }
    }

    public void largura(Elemento<TIPO> raiz) {
        if (raiz == null)
            return;

        Queue<Elemento<TIPO>> fila = new LinkedList<>();
        fila.add(raiz);

        while (!fila.isEmpty()) {
            Elemento<TIPO> atual = fila.poll();
            System.out.println(atual.getValor());

            if (atual.getEsquerda() != null)
                fila.add(atual.getEsquerda());

            if (atual.getDireita() != null)
                fila.add(atual.getDireita());
        }
    }

    public int contarNaoFolhas(Elemento<TIPO> raiz) {
        if (raiz == null) {
            return 0;
        }

        // Se o nó atual não é folha, incrementa o contador
        if (raiz.getEsquerda() != null || raiz.getDireita() != null) {
            int contador = 1;  // Inicia com 1 para contar o próprio nó
            contador += contarNaoFolhas(raiz.getEsquerda());
            contador += contarNaoFolhas(raiz.getDireita());
            return contador;
        }

        return 0;
    }

    public Elemento<TIPO> encontrarMenorProfundidadeFolha(Elemento<TIPO> raiz) {
        if (raiz == null)
            return null;

        Queue<Elemento<TIPO>> fila = new LinkedList<>();
        fila.add(raiz);

        while (!fila.isEmpty()) {
            Elemento<TIPO> atual = fila.poll();

            // Verifica se o nó atual é uma folha
            if (atual.getEsquerda() == null && atual.getDireita() == null) {
                return atual;
            }

            // Adiciona os filhos do nó atual à fila
            if (atual.getEsquerda() != null)
                fila.add(atual.getEsquerda());

            if (atual.getDireita() != null)
                fila.add(atual.getDireita());
        }

        return null; // Nenhuma folha encontrada
    }

    public void substituirValor(TIPO valorAntigo, TIPO valorNovo) {
        raiz = substituirValorRec(raiz, valorAntigo, valorNovo);
    }

    private Elemento<TIPO> substituirValorRec(Elemento<TIPO> raiz, TIPO valorAntigo, TIPO valorNovo) {
        if (raiz == null)
            return null;

        // Verifica se o valor do nó atual é igual ao valor a ser substituído
        if (raiz.getValor().equals(valorAntigo)) {
            raiz.setValor(valorNovo);  // Substitui o valor
        }

        // Recursivamente substitui valores nos filhos esquerdo e direito
        raiz.setEsquerda(substituirValorRec(raiz.getEsquerda(), valorAntigo, valorNovo));
        raiz.setDireita(substituirValorRec(raiz.getDireita(), valorAntigo, valorNovo));

        return raiz;
    }


    public boolean remover(TIPO valor){
        //buscar o elemento na árvore
        Elemento<TIPO> atual = this.raiz;
        Elemento<TIPO> paiAtual = null;
        while(atual != null){
            if (atual.getValor().equals(valor)){
                break;
            }else if (valor.compareTo(atual.getValor()) == -1){ //valor procurado é menor que o atual
                paiAtual = atual;
                atual = atual.getEsquerda();
            }else{
                paiAtual = atual;
                atual = atual.getDireita();
            }
        }
        //verifica se existe o elemento
        if (atual != null){

            //elemento tem 2 filhos ou elemento tem somente filho à direita
            if (atual.getDireita() != null){

                Elemento<TIPO> substituto = atual.getDireita();
                Elemento<TIPO> paiSubstituto = atual;
                while(substituto.getEsquerda() != null){
                    paiSubstituto = substituto;
                    substituto = substituto.getEsquerda();
                }
                substituto.setEsquerda(atual.getEsquerda());
                if (paiAtual != null){
                    if (atual.getValor().compareTo(paiAtual.getValor()) == -1){ //atual < paiAtual
                        paiAtual.setEsquerda(substituto);
                    }else{
                        paiAtual.setDireita(substituto);
                    }
                }else{ //se não tem paiAtual, então é a raiz
                    this.raiz = substituto;
                    paiSubstituto.setEsquerda(null);
                    this.raiz.setDireita(paiSubstituto);
                    this.raiz.setEsquerda(atual.getEsquerda());
                }

                //removeu o elemento da árvore
                if (substituto.getValor().compareTo(paiSubstituto.getValor()) == -1){ //substituto < paiSubstituto
                    paiSubstituto.setEsquerda(null);
                }else{
                    paiSubstituto.setDireita(null);
                }

            }else if (atual.getEsquerda() != null){ //tem filho só à esquerda
                Elemento<TIPO> substituto = atual.getEsquerda();
                Elemento<TIPO> paiSubstituto = atual;
                while(substituto.getDireita() != null){
                    paiSubstituto = substituto;
                    substituto = substituto.getDireita();
                }
                if (paiAtual != null){
                    if (atual.getValor().compareTo(paiAtual.getValor()) == -1){ //atual < paiAtual
                        paiAtual.setEsquerda(substituto);
                    }else{
                        paiAtual.setDireita(substituto);
                    }
                }else{ //se for a raiz
                    this.raiz = substituto;
                }

                //removeu o elemento da árvore
                if (substituto.getValor().compareTo(paiSubstituto.getValor()) == -1){ //substituto < paiSubstituto
                    paiSubstituto.setEsquerda(null);
                }else{
                    paiSubstituto.setDireita(null);
                }
            }else{ //não tem filho
                if (paiAtual != null){
                    if (atual.getValor().compareTo(paiAtual.getValor()) == -1){ //atual < paiAtual
                        paiAtual.setEsquerda(null);
                    }else{
                        paiAtual.setDireita(null);
                    }
                }else{ //é a raiz
                    this.raiz = null;
                }
            }

            return true;
        }else{
            return false;
        }
    }
}