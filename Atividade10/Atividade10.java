package Atividade10;

import Aula9.Arvore;
import Aula9.Elemento;

public class Atividade10 {
    public static void main(String[] args) {
        Arvore<Integer> arvore = new Arvore<Integer>();

        // add
        arvore.adicionar(4);
        arvore.adicionar(11);
        arvore.adicionar(9);
        arvore.adicionar(1);
        arvore.adicionar(13);

        // a - pré order
        System.out.println("a - pré order");
        arvore.preOrdem(arvore.getRaiz());

        // b - in order
        System.out.println("b - in order");
        arvore.emOrdem(arvore.getRaiz());

        // c - pos order
        System.out.println("c - pos order");
        arvore.posOrdem(arvore.getRaiz());

        // d - largura
        System.out.println("largura");
        arvore.largura(arvore.getRaiz());

        // e - contar não folhas
        System.out.println("contar não folhas");
        System.out.println(arvore.contarNaoFolhas(arvore.getRaiz()));

        // f - encontrar menor profundidade folha
        System.out.println("encontrar menor profundidade folha");
        Elemento<Integer> folhaMenorProfundidade = arvore.encontrarMenorProfundidadeFolha(arvore.getRaiz());
        if (folhaMenorProfundidade != null) {
            System.out.println("Folha de menor profundidade: " + folhaMenorProfundidade.getValor());
        } else {
            System.out.println("Não há folhas na árvore.");
        }
        System.out.println();
        System.out.println();

        // g - Crie um método para substituir todas as ocorréncias de um valor na årvore por
        //outro valor
        System.out.println("Crie um método para substituir todas as ocorréncias de um valor na årvore por\n" +
                "outro valor");

        System.out.println("Árvore original (pré-ordem):");
        arvore.preOrdem(arvore.getRaiz());

        arvore.substituirValor(11, 25);

        System.out.println("Árvore após a substituição (pré-ordem):");
        arvore.preOrdem(arvore.getRaiz());
    }
}
