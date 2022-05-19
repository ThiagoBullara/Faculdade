public class formigas {
    public static void main(String[] args) {
        double formigueiroA = 90000;
        double formigueiroB = 200000;
        int anos = 0;

        do{
            formigueiroA += (90000 * 0.03); 
            formigueiroB += (200000 * 0.017);
            anos += 1;
            System.out.println(anos);
        }while(formigueiroA <= formigueiroB);

        System.out.println(anos);
        System.out.println(formigueiroA);
        System.out.println(formigueiroB);
        System.out.println("A população de ambos os formigueiros é de: " + formigueiroA + " e levou cerca de: " + anos + "anos");

    }
}
