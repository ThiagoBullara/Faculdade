import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        
        Scanner myObj = new Scanner(System.in);  

        int n = myObj.nextInt();

        System.out.println("O fatorial do número: " + n + " é igual a: ");

        for(int i = 1; i <= n; i++){
            System.out.println(i);
        }

    }
}
