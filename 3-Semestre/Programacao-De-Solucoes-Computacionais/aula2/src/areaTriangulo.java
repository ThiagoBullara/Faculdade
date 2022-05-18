import java.util.Scanner;

public class areaTriangulo {
    public static void main(String[] args) {
        
        Scanner myObj = new Scanner(System.in);  
    
        System.out.println("Insira a altura e a base do triângulo para obter sua area: ");

        float alt = myObj.nextFloat();
        float base = myObj.nextFloat();

        float area = (base * alt) / 2;

        System.out.println("A area é de: " + area);
    }
}
