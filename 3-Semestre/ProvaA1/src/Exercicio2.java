import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner fasesCompletas = new Scanner(System.in);
        Scanner fasesTotais = new Scanner(System.in);

        System.out.println("Insira o total de fases que você completou no jogo: ");
        int totalCompletado = fasesCompletas.nextInt();

        System.out.println("Insira o total de fases que existem neste jogo: ");
        int totalJogo = fasesTotais.nextInt();

        double porcentagem = (totalCompletado * 100) / totalJogo;

        System.out.println("O usuário completou " + totalCompletado + " fases de um total de " + totalJogo + " fases, ou seja cerca de: " + porcentagem + "% do jogo está comleto!");
    
    }
}