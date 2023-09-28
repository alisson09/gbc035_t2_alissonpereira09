public class Main {
    public static void main(String[] args) {
        System.out.println("\nIngresso:");
        Ingresso ingresso = new Ingresso(40);
        ingresso.escreveValor();

        System.out.println("\nIngresso VIP:");
        VIP ingressoVip = new VIP(70, 30);
        ingressoVip.valorVip();

        Normal ingressoNormal = new Normal(40);
        ingressoNormal.imprime();

        System.out.println("\nCamarote Inferior:");
        CamaroteInferior camaroteInferior = new CamaroteInferior(70, 30, "Setor 1B");
        camaroteInferior.imprimeCamaroteInferior();

        System.out.println("\nCamarote Superior:");
        CamaroteSuperior camaroteSuperior = new CamaroteSuperior(70,30,70);
        camaroteSuperior.imprimeCamaroteSuperior();
    }
}