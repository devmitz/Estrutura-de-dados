import java.util.LinkedList;

public class ListaEncadeada {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    // cabeça global
    public static Node head;

    // Função auxiliar para imprimir uma determinada lista encadeada
    public static void printList(Node head) {
        Node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.data + " —> ");
            ptr = ptr.next;
        }
        System.out.println("null");
    }

    // Pega uma lista e um valor de dados, cria um novo link com o dado
    // dados e os empurra para a frente da lista.
    public static Node push(int data) {
        // aloca um novo nó em um heap e configura seus dados
        Node newNode = new Node(data);
        newNode.data = data;

        // define o próximo campo do novo nó para apontar para o atual
        // nó principal da lista.
        newNode.next = head;

        // muda a cabeça para apontar para o novo nó, então é
        // agora o primeiro nó na lista.

        return newNode;
    }

    // Função para implementação de lista encadeada do conjunto de chaves fornecido
    public static void constructList(int[] keys) {
        // começa do final do array
        for (int i = keys.length - 1; i >= 0; i--) {
            head = push(keys[i]);
        }
    }

    public static void main(String[] args) {
        // teclas de entrada
        int[] keys = { 1 };

        // aponta para o nó principal da lista encadeada
        constructList(keys);

        // imprime lista encadeada
        printList(head);
        // Lista encadeada Java
        LinkedList<String> nome = new LinkedList<String>();
        nome.add("Felipe");
        System.out.println(nome.size());
        System.out.println(nome);

    }
}