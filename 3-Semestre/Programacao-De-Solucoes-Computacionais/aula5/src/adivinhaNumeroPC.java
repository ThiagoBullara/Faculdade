import java.util.Scanner;
import java.util.Random;

public class adivinhaNumeroPC {
   public static void main(String[] args) {

        int limiteMin = 0;
        int limiteMax = 100;

        Scanner myObj = new Scanner(System.in);  
        System.out.println("Insira um número de 1 a 100 que o computador vai tentar adivinhar: ");
        int nUser = myObj.nextInt();

        Random rand = new Random();
        int upperbound = 101; // Define o valor máximo que pode aparecer não inclui 101
        int nRandom = rand.nextInt(upperbound);

        if(nUser <= limiteMax && nUser >= limiteMin){
            if(nRandom == nUser){
                System.out.println("O computador acertou o número.");
            } else {
                System.out.println("O computador errou o número que ele chutou foi: " + nRandom);
            }
        }

   } 
}
