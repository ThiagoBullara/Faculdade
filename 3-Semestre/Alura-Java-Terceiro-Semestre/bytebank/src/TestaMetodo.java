public class TestaMetodo {
    public static void main(String[] args) {
        
        Conta contaDoPaulo = new Conta();
        contaDoPaulo.saldo = 100;
        System.out.println("Seu saldo atual é de: " + contaDoPaulo.saldo);
        
        contaDoPaulo.deposita(200);
        boolean conseguiuSacar = contaDoPaulo.saca(400);
        System.out.println(conseguiuSacar);

    }
}