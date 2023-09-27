package Atividade4;
public class ListaDupla {
    public static void main(String args[]){
        CountryDoublyLinkedList countryList = new CountryDoublyLinkedList();

        countryList.insertCountry("Brasil");
        countryList.insertCountry("Estados Unidos");
        countryList.insertCountry("França");
        countryList.insertCountry("Japão");
        countryList.insertCountry("Austrália");
        countryList.insertCountry("Sri Lanka");

        // Exibindo os países na ordem original
        System.out.println("Países:");
        countryList.displayCountries();
    }

    static class CountryNode {
        String name;
        CountryNode next;
        CountryNode prev;
    
        public CountryNode(String name) {
            this.name = name;
            this.next = null;
            this.prev = null;
        }
    }
    
    static class CountryDoublyLinkedList {
        CountryNode head;
    
        public CountryDoublyLinkedList() {
            this.head = null;
        }
            
        public void insertCountry(String name) {
            CountryNode newNode = new CountryNode(name);
            if (head == null) {
                head = newNode;
            } else {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }
        }
    
        public void displayCountries() {
            CountryNode current = head;
            while (current != null) {
                System.out.println(current.name);
                current = current.next;
            }
        }
    }    
}
