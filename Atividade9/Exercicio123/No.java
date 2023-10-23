package Atividade9.Exercicio123;

// Classe genérica chamada "No" que pode armazenar um elemento de qualquer tipo (T).
public class No<T> {

    // Variável que armazena o elemento do nó.
    private T elemento;

    // Variável que aponta para o próximo nó na lista.
    private Aula7.No<T> proximo;

    // Construtor que recebe um elemento e o próximo nó como parâmetros.
    public No(T elemento, Aula7.No<T> proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }

    // Construtor vazio.
    public No() {
        // Não faz nada.
    }

    // Construtor que recebe apenas o elemento como parâmetro.
    public No(T elemento) {
        this.elemento = elemento;
        this.proximo = null;
    }

    // Getter para obter o elemento do nó.
    public T getElemento() {
        return elemento;
    }

    // Setter para definir o elemento do nó.
    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    // Getter para obter o próximo nó.
    public Aula7.No<T> getProximo() {
        return proximo;
    }

    // Setter para definir o próximo nó.
    public void setProximo(Aula7.No<T> proximo) {
        this.proximo = proximo;
    }

    // Sobrescreve o método toString para fornecer uma representação em string do objeto.
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("No [elemento=").append(elemento).append(", proximo=").append(proximo).append("]");
        return builder.toString();
        // Ou
        // return "No [elemento=" + elemento + ", proximo=" + proximo + "]";
    }
}
