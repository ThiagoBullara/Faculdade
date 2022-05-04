public class TestaContaSemCliente {
    public static void main(String[] args) {
        CC contaDaMarcela = new CC();
     
        contaDaMarcela.titular = new Cliente(); 

        System.out.println(contaDaMarcela.titular);
        contaDaMarcela.titular.nome = "Marcela";
        System.out.println(contaDaMarcela.titular.nome);


    }
    
    
}
