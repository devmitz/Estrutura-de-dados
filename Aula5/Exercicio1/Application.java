package Exercicio1;

public class Application {
    public static void main(String args[]){
        // Tipos 1 - Urgencia 2 - Emergencia
        Paciente p1 = new Paciente("057.545.284-69", "Geraldo Benjamin Erick Sales", 1);
        Paciente p2 = new Paciente("723.273.153-10", "Henrique Geraldo Ricardo Lopes", 2);

        Celula celula = new Celula();
        Celula celula2 = new Celula();

        celula.setValor(p1);
        celula2.setValor(p2);

        celula.setProximo(celula2);

        System.out.println(celula.getValor().getNome());
        System.out.println(celula.getProximo().getValor().getNome());

        System.out.println("Pacientes...");
        System.out.println(p1);
        System.out.println(p2);




    }
}
