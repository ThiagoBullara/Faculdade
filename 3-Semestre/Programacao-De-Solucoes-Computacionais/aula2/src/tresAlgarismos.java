import java.util.Scanner;

public class tresAlgarismos {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  

        System.out.println("Insira um número de 3 algarismos: ");

        int n1 = myObj.nextInt();
        int n2 = myObj.nextInt();
        int n3 = myObj.nextInt();

        int n4 = (((n1 + n2) * 2) + (n3 * 6))/ 9;
        
        int nFinal = (n1 * 1000) + (n2 * 100) + (n3 * 10) + (n4 * 1);

        System.out.println("O novo número é: " + nFinal);
         
    }
}
