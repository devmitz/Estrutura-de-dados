package Aula7;

public class Filme {
    private String nome;
    private String categoria;

    public Filme(String nome, String categoria) {
        this.nome = nome;
        this.categoria = categoria;
    }

    public Filme() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString(){
        return nome + ", " + categoria;
    }
}
