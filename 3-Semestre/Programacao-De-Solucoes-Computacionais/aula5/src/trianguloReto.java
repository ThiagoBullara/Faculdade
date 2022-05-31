import java.util.Scanner;

public class trianguloReto {
    public static void main(String[] args) {
        
        Scanner myObj = new Scanner(System.in);  
        System.out.println("Insira um número inteiro para formar um triângulo reto: ");
        int nUser = myObj.nextInt();

        System.out.println();

        for(int x = nUser; x >= 1; x--){ // Pula a linha
            for(int y = x; y >= 1; y--){ // Imprime os *
                System.out.print("*");
            }
            System.out.println(); // Pula a linha
        }
    }
}
