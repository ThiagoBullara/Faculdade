public class TestaContaNegativa {
    public static void main(String[] args) {
        CC conta = new CC();
        conta.deposita(100);
        conta.saca(200);
        System.out.println(conta.getSaldo());

    }
}
