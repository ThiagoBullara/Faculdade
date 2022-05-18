import java.util.Scanner;

public class media {
    public static void main(String[] args) {
        
        Scanner myObj = new Scanner(System.in);  
    
        System.out.println("Insira 3 pontuações para obter sua média: ");

        float p1 = myObj.nextFloat();
        float p2 = myObj.nextFloat();
        float p3 = myObj.nextFloat();

        float media = (p1 + p2 + p3) / 3;

        System.out.println("Sua média é de: " + media);

    } 
 
}
