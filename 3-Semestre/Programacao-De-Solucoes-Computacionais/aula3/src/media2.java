import java.util.Scanner;

public class media2 {
    public static void main(String[] args) {
        
        Scanner myObj = new Scanner(System.in);  

        System.out.println("Insira suas duas notas e o tipo de média que deseja");
        System.out.println("Insira as notas: ");

        float n1 = myObj.nextFloat();
        float n2 = myObj.nextFloat();

        System.out.println("Insira o tipo de média (a) - aritmética ou (p) - ponderada (pesos 3 e 7): ");

        String mediaTipo = myObj.next();

        switch(mediaTipo){
            case "a":
                float mArit = (n1 + n2) / 2;
                System.out.println("Sua média aritmética é de: " + mArit);
            case "m":
                float mPond = ((n1 * 3) + (n2 * 7)) / 2;
                System.out.println("Sua média ponderada é de: " + mPond); 
        }
    }
}
