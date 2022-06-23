public class TestaGetESet {
    public static void main(String[] args) {
        Conta2 conta = new Conta2(1337, 1226);
        Conta2 conta2 = new Conta2(1437, 1226);
        System.out.println(Conta2.getTotal());
        // conta.setNumero(1337);
        System.out.println(conta.getAgencia());
        System.out.println(conta.getNumero());
        conta.setTitular(new Cliente2());
        conta.getTitular().setNome("Thiago");
        System.out.println(conta.getTitular().getNome()); // Encapsulamento da classe cliente dentro da classe conta que também tá encapsulada
        System.out.println(conta.getTitular());
        
    }
}
