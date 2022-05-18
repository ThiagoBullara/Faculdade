import java.util.Scanner;

public class parOuImpar {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);  

        System.out.println("Insira um número inteiro para verificar se é par ou ímpar: ");

        int n = myObj.nextInt();

        if(n % 2 == 1) {
            System.out.println("O número é ímpar");
        } else {
            System.out.println("O número é par");
        }

    }
}
