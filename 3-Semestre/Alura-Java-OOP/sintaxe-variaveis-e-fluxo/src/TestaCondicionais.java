public class TestaCondicionais {
    public static void main(String[] args) {
        System.out.println("testando condicionais");
        int idade = 16;
        int quantidadePessoas = 3;
        if(idade >= 18) {
            System.out.println("você tem mais de 18 anos");
            System.out.println("seja bem vindo");
        } else if (quantidadePessoas >= 2) {
            System.out.println("você não é maior de 18 anos, mas pode entrar pois está acompanhado");
        } else {
            System.out.println("você não pode entrar");
        }
    
    }
}

// é possível fazer o if sem as chaves caso ele tenha apensa uma linha de código
