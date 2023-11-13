package Aula9;

public class Aula9 {
    public static void main(String[] args) {
        Arvore<Integer> arvore = new Arvore<Integer>();
        arvore.adicionar(10);
        arvore.adicionar(8);
        arvore.adicionar(5);
        arvore.adicionar(9);
        arvore.adicionar(7);
        arvore.adicionar(18);
        arvore.adicionar(13);
        arvore.adicionar(20);

        System.out.println("Em ordem: ");
        arvore.emOrdem(arvore.getRaiz());

        arvore.remover(8);

        System.out.println("Em ordem: ");
        arvore.emOrdem(arvore.getRaiz());

//        System.out.println("Pós ordem: ");
//        arvore.posOrdem(arvore.getRaiz());
//
//        arvore.remover(30);
//
//        System.out.println("Pré ordem:");
//        arvore.preOrdem(arvore.getRaiz());
    }
}