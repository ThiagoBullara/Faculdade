import java.util.Scanner;

public class Exercicio1 {

    public static int clamp(int valor, int min, int max) {
        if(valor < min) {
            System.out.println("O valor inserido é inválido portanto foi alterado para o valor mínimo de: " + min);
        } else if (valor > max) {
            System.out.println("O valor inserido é inválido portando foi alterado para o valor máximo de: " + max);
        } else {
            System.out.println("O valor está dentro do intervalo definido.");
        }

        return Math.max(min, Math.min(max, valor));
    }

    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        Scanner min = new Scanner(System.in);
        Scanner max = new Scanner(System.in);

        System.out.println("Insira um valor para verificar se ele está dentro dos limites, caso não esteja ele será alterado para o valor mínimo ou máximo: ");
        int valorUsuario = valor.nextInt();

        System.out.println("Defina o valor para ser o mínimo: ");
        int minUsuario = min.nextInt();

        System.out.println("Defina o valor para ser o máximo: ");
        int maxUsuario = max.nextInt();

        // clamp(valorUsuario, minUsuario, maxUsuario);
        System.out.println(clamp(valorUsuario, minUsuario, maxUsuario));
    }
}