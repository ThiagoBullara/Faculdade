import java.util.Scanner;

public class tempo {
    public static void main(String[] args) {
        
        Scanner myObj = new Scanner(System.in);  
    
        System.out.println("Insira a hora e os minutos para transformar tudo em minutos: ");

        int hora = myObj.nextInt();
        int minutos = myObj.nextInt();

        int minutosFinal = (hora * 60) + minutos;

        System.out.println("O total de minutos é de: " + minutosFinal);
        
    }    
}
