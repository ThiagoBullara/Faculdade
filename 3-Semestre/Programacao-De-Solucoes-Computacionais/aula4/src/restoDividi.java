public class restoDividi {
     
    public static float restoDivisao (float n1, float n2){
        float resto = n1 % n2;
        return resto;
    }

    public static void main(String[] args) {
        System.out.println(restoDivisao(9, 7));
    }
}
