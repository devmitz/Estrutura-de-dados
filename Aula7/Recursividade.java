package Aula7;

public class Recursividade {
    public static int fatorial( int num ){
        if( num == 0 )
            return 1;
        return num * fatorial(num - 1);
    }

    public static void main(String[] args) {
        System.out.println(fatorial(5));
    }
}
