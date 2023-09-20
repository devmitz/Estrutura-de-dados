package Exercicio1;

public class Paciente {
    private String cpf;
    private String nome;
    private int tipo;

    public Paciente(String cpf, String nome, int tipo) {
        this.cpf = cpf;
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString(){
        return "Nome: " 
            + this.nome
            + " CPF: "
            + this.cpf
            + " Tipo: "
            + this.tipo;
    }
}
