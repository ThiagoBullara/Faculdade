public class Conta2 {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente2 titular;

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

    public boolean transfere(double valor, Conta2 destino) {
        if(valor <= this.saldo && valor > 0){
            saca(valor);
            destino.deposita(valor);
            return true;
        } 

        return false;
        
    }

    // Encapsulamento de atributo, dessa forma ele só pode ser acessado por um método já que está private 
    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public Cliente2 getTitular(){
        return this.titular;
    }

    public void setTitular(Cliente2 titular) {
        this.titular = titular;
    }

}