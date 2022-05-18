import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);  

        System.out.println("Insira dois números e o sinal da operação que deseja entre eles: ");

        System.out.println("Número 1: ");
        float n1 = myObj.nextFloat();
        System.out.println("Sinal: ");
        String sinal = myObj.next();
        System.out.println("Número 2: ");
        float n2 = myObj.nextFloat();

        switch(sinal){
            case "+":
                float soma = n1 + n2;
                System.out.println("O resultado é: " + soma);
            case "-":
                float subtrair = n1 - n2;
                System.out.println("O resultado é: " + subtrair);
            case "*":
                float mult = n1 * n2;
                System.out.println("O resultado é: " + mult);
            case "/":
                float divid = n1 / n2;
                System.out.println("O resultado é: " + divid);
        }


    }
}
