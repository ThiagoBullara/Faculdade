import java.util.Scanner;

public class triplo {
    public static void main(String[] args) {
        
        Scanner myObj = new Scanner(System.in);  
    
        System.out.println("Insira um número para obter seu triplo: ");

        float n1 = myObj.nextFloat();

        float nFinal = n1 * 3;

        System.out.println("O triplo do número é de: " + nFinal);

    }
}
