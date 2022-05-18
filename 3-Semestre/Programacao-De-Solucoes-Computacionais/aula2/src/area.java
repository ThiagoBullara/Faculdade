import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        
        Scanner myObj = new Scanner(System.in);  
    
        float pi = 3.14159265f;
        System.out.println("Insira o valor do raio para calcular a area da circunferência: ");
        float raio = myObj.nextFloat();

        float area = pi * (raio * raio);

        System.out.println("A area da circunferência é de: " + area);
    }
}
