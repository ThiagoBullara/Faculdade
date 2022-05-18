import java.util.Scanner;

public class maiorMenor {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);  

        System.out.println("Insira dois números para realizar a subtração deles, sendo que ela vai ser realizada do maior pelo menor: ");

        float n1 = myObj.nextFloat();
        float n2 = myObj.nextFloat();

        if(n1 > n2) {
            float sub = n1 - n2;
            System.out.println("O resultado é de: " + sub);
        } else if(n1 < n2) {
            float sub = n2 - n1;
            System.out.println("O resultado é de: " + sub);
        } else {
            System.out.println("O resultado é 0");
        }

    }
}
