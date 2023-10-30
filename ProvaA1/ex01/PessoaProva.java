package ProvaA1.ex01;

public class PessoaProva {
    private String name;
    private int numero;
    private int ddd;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public PessoaProva(String name, int ddd, int numero) {
        this.name = name;
        this.numero = numero;
        this.ddd = ddd;
    }

    @Override
    public String toString() {
        return name + ", " + ddd + " " + numero;
    }
}
