public class Conta {
    double saldo;
    int agencia;
    int numero;
    String titular; 

    public void deposita(double valor) {
        this.saldo += valor;
        System.out.println("Depósito no valor de: " + valor + " reais na conta numero: " + this.numero + " da agencia: " + this.agencia + " seu novo saldo agora é de: " + this.saldo + " reais.");
    }

    public boolean saca(double valor) {
        if(valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Você sacou: " + valor + " reais seu novo saldo agora é de: " + this.saldo + " reais.");
            return true;
        } else {
            System.out.println("Seu saldo atual de: " + this.saldo + " reais é insuficiente para realizar um saque no valor de: " + valor + " reais.");
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        if(valor <= this.saldo && valor > 0){
            saca(valor);
            destino.deposita(valor);
            return true;
        } 

        return false;
        
    }


}

// Void serve para informar que o método não vai retornar nada
// Boolean deve retornar true ou falso