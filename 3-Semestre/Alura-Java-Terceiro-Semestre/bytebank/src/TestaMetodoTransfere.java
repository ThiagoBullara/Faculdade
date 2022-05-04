public class TestaMetodoTransfere {
    public static void main(String[] args) {
        Conta contaDoPaulo = new Conta();
        Conta contaDaMarcela = new Conta();

        contaDoPaulo.saldo = 1500;
        contaDoPaulo.agencia = 28;
        contaDoPaulo.numero = 12345;
        contaDoPaulo.titular = "Paulo";

        contaDaMarcela.saldo = 4000;
        contaDaMarcela.agencia = 30;
        contaDaMarcela.numero = 98765;
        contaDaMarcela.titular = "Marcela";
        
        if(contaDaMarcela.transfere(7000, contaDoPaulo)) {
            System.out.println("Transferência com sucesso!");
        } else {
            System.out.println("Erro na transferência.");
        }
        
    }
}
