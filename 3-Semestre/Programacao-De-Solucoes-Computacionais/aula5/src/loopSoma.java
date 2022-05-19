public class loopSoma {
    static void loop(int n1, int n2){

        int total = 0;

        for(int i = n1; i < n2; i++){
            total += i;
        }

        System.out.println("A soma dos números de " + n1 + "até" + n2 + "é de: " + total);
    }

    public static void main(String[] args) {
        loop(1,50);
    }
}
