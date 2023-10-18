package Atividade9;


import java.util.Arrays;

public class exercicioRevisao5 {
    public static void main(String[] args) {

        String[] nomes = new String[5];
        nomes[0] = "Maria";
        nomes[1] = "João";
        nomes[2] = "Roberto";
        nomes[3] = "Ana";
        nomes[4] = "Joaquim";

        System.out.println();
        System.out.println("Nomes não ordenados: ");
        for (String nome : nomes){
            System.out.println(nome);
        }

        System.out.println();
        System.out.println("Nomes ordenados (Bubble Sort): ");
        bubbleSort(nomes);
        for (String nome : nomes) {
            System.out.println(nome);
        }

        String[] estados = new String[5];
        estados[0] = "São Paulo";
        estados[1] = "Rio de Janeiro";
        estados[2] = "Bahia";
        estados[3] = "Pernambuco";
        estados[4] = "Acre";

        System.out.println();
        System.out.println("Estados não ordenados: ");
        for (String estado : estados){
            System.out.println(estado);
        }

        System.out.println();
        System.out.println("Estados ordenados (Merge Sort): ");
        mergeSort(estados);
        for (String estado : estados){
            System.out.println(estado);
        }

        String[] paises = new String[5];
        paises[0] = "Estados Unidos";
        paises[1] = "Sri Lanka";
        paises[2] = "China";
        paises[3] = "Brasil";
        paises[4] = "Canada";

        System.out.println();
        System.out.println("Paises não ordenados: ");
        for (String pais : paises){
            System.out.println(pais);
        }

        System.out.println();
        System.out.println("Paises ordenados (Quick Sort)");
        quickSort(paises, 0, paises.length - 1);
        for (String pais : paises){
            System.out.println(pais);
        }

    }

    public static void bubbleSort(String[] arr) {
        int n = arr.length;
        boolean swapped;

        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1].compareTo(arr[i]) > 0) {
                    String temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }

    public static void mergeSort(String[] arr) {
        int n = arr.length;
        if (n < 2) {
            return;
        }

        int mid = n / 2;
        String[] left = Arrays.copyOfRange(arr, 0, mid);
        String[] right = Arrays.copyOfRange(arr, mid, n);

        mergeSort(left);
        mergeSort(right);

        merge(arr, left, right);
    }

    public static void merge(String[] arr, String[] left, String[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i].compareTo(right[j]) <= 0) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < left.length) {
            arr[k++] = left[i++];
        }

        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }

    public static void quickSort(String[] arr, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(arr, low, high);
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    public static int partition(String[] arr, int low, int high) {
        String pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (arr[j].compareTo(pivot) <= 0) {
                i++;

                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        String temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

}
