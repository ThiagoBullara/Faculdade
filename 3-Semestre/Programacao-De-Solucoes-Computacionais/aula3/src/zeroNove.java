import java.util.Scanner;

public class zeroNove {
    public static void main(String[] args) {
        
        Scanner myObj = new Scanner(System.in);  

        System.out.println("Insira um número inteiro entre 0 e 9");

        int n = myObj.nextInt();

        if (n < 9 && n > 0){
            System.out.println("Valor correto");
        } else {
            System.out.println("Valor inválido");
        }
           
    }
}
