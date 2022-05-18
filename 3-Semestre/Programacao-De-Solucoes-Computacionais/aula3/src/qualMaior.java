import java.util.Scanner;

public class qualMaior {
    public static void main(String[] args) {
        
        Scanner myObj = new Scanner(System.in);  

        System.out.println("Insira 3 notas para verificar qual é a maior e a menor: ");

        float n1 = myObj.nextFloat();
        float n2 = myObj.nextFloat();
        float n3 = myObj.nextFloat();

        if(n1 > n2 && n1 > n3){
            if(n2 > n3){
                System.out.println("O número maior é o: " + n1);
                System.out.println("O menor número é o: " + n3);
            } else if (n3> n2){
                System.out.println("O número maior é o: " + n1);
                System.out.println("O menor número é o: " + n2); 
            }
        } else if (n2 > n1 && n2 > n3){
            if(n1 > n3){
                System.out.println("O número maior é o: " + n2);
                System.out.println("O menor número é o: " + n3);
            } else if (n3 > n1){
                System.out.println("O número maior é o: " + n2);
                System.out.println("O menor número é o: " + n1);
            }
        } else if (n3 > n1 && n3 > n2){
            if(n1 > n2){
                System.out.println("O número maior é o: " + n3);
                System.out.println("O menor número é o: " + n2); 
            } else if (n2 > n1){
                System.out.println("O número maior é o: " + n3);
                System.out.println("O menor número é o: " + n1); 
            }
        } else {
            System.out.println("Números iguais");
        }
    }
}
