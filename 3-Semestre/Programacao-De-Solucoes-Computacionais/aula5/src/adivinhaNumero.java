import java.util.Scanner;
import java.util.Random;

public class adivinhaNumero {
   public static void main(String[] args) {

        int limiteMin = 0;
        int limiteMax = 100;

        Scanner myObj = new Scanner(System.in);  
        System.out.println("Tente adivinhar o número do computador, insira o número de 0 até 100: ");
        int nUser = myObj.nextInt();

        Random rand = new Random();
        int upperbound = 101; // Define o valor máximo que pode aparecer não inclui 101
        int nRandom = rand.nextInt(upperbound);

        if(nUser <= limiteMax && nUser >= limiteMin){
            if(nUser == nRandom){
                System.out.println("Você acertou o número do computador.");
            } else {
                System.out.println("Você errou o número era: " + nRandom);
            }
        }

   } 
}
