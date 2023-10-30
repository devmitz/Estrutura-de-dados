package ProvaA1.ex02;

public class MainProvaEx02 {
        public static void main(String[] args){
            ArrayStackProva stack = new ArrayStackProva(4);
            stack.push(6);
            stack.push(2);
            stack.pop();
            stack.push(2);
            stack.push(8);
            stack.pop();
            stack.pop();
            stack.push(9);
            stack.push(1);
            stack.pop();
            stack.push(7);
            stack.push(6);
            stack.pop();
            stack.push(4);
            stack.pop();
            stack.pop();
            System.out.println(stack);
        }
}