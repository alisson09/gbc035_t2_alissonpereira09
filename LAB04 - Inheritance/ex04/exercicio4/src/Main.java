public class Main {
    public static void main(String[] args) {

        C1 c13= new C3();

        System.out.println("\nConstrutor de C1:");
        C1 c1 = new C1(1,2,3);

        System.out.println("\nConstrutor de C2:");
        C2 c2 = new C2(c1,4,5,6);

        System.out.println("\nConstrutor de C3:");
        C3 c3 = new C3(c2,7,8,9);


        System.out.println("\nMétodo mostar_atributos (C1):");
        c1.mostar_atributos();
        System.out.println("\nMétodo mostar_atributos_super (C1):");
        c1.mostar_atributos_super();

        System.out.println("\nMétodo mostar_atributos (C2):");
        c2.mostar_atributos();
        System.out.println("\nMétodo mostar_atributos_super (C2):");
        c2.mostar_atributos_super();

        System.out.println("\nMétodo mostar_atributos (C3):");
        c3.mostar_atributos();
        System.out.println("\nMétodo mostar_atributos_super (C3):");
        c3.mostar_atributos_super();
    }

}