public class TestaConversao {

    public static void main(String[] args) {
        double salario = 1270.50;
        int valor = (int) salario; // Casting transforma double em int

        System.out.println(valor);

        long numeroGrande = 3243243242323l;

        System.out.println(numeroGrande);

        // short numeroPequeno = 2131;
        // byte b = 127;

        double valor1 = 0.2;
        double valor2 = 0.1;
        double total = valor1 + valor2;

        System.out.println(total);

    }
}


// Valores inteiros passam para double, mas valores double não passam para inteiro