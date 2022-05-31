import java.util.Scanner;

public class somaFracao {
    public static void main(String[] args) {
       
        Scanner myObj = new Scanner(System.in);  

        System.out.println("Insira um número inteiro: ");

        int n = myObj.nextInt();
        int total = 0;

        for(int i = 1; i <= n; i++){
            total += (1 / i);
        }

        System.out.println(total);

   } 
}
