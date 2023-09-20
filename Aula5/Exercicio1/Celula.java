package Exercicio1;

public class Celula {
    private Celula proximo;
    private Paciente valor;

    public Celula getProximo() {
        return proximo;
    }

    public void setProximo(Celula proximo) {
        this.proximo = proximo;
    }

    public Paciente getValor() {
        return valor;
    }

    public void setValor(Paciente valor) {
        this.valor = valor;
    }
}