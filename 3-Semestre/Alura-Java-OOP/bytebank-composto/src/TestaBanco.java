public class TestaBanco {
    public static void main(String[] args) {
        Cliente paulo = new Cliente();
        paulo.nome = "Paulo Silveira";
        paulo.cpf = "222.222.222-32";
        paulo.profissao = "Programador";

        CC contaDoPaulo = new CC();
        contaDoPaulo.deposita(100);

        // Associa o cliente a conta
        contaDoPaulo.titular = paulo;

        System.out.println(contaDoPaulo.titular.nome);
        System.out.println(contaDoPaulo.titular);
        System.out.println(paulo);
    }
}
