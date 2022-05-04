public class TestaGetESet {
    public static void main(String[] args) {
        Conta2 conta = new Conta2();
        conta.setNumero(1337);
        System.out.println(conta.getNumero());
        conta.setTitular(new Cliente2());
        conta.getTitular().setNome("Thiago");
        System.out.println(conta.getTitular().getNome()); // Encapsulamento da classe cliente dentro da classe conta que também tá encapsulada

        System.out.println(conta.getTitular());
        
    }
}
