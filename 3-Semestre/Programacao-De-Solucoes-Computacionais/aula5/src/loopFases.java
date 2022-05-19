import java.util.Scanner;

public class loopFases {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);  
        
        int total = 0;

        System.out.println("Insira o total de fases jogadas: ");
        int fasesTotal = myObj.nextInt();
        
        for(int i = 1; i < fasesTotal + 1; i++){
            System.out.println("Insira a quantidades de kills na fase " + i);
            int kills = myObj.nextInt();
            if(kills <= 100 && kills >= 0){
                total += kills;    
            } else {
                System.out.println("Valor inválido");
            }
        }

        float media = total / fasesTotal;

        System.out.println("Sua média de kills foi de: " + media);
    }
}
