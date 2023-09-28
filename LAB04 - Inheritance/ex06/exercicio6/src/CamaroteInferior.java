public class CamaroteInferior extends VIP {
    private String localizacao;

    public CamaroteInferior(double valor, double adicional, String localizacao) {
        super(valor, adicional);
        this.localizacao = localizacao;
    }

    public void imprimeCamaroteInferior() {
        System.out.println("Camarote Inferior, Localizacao: " +localizacao);
    }
}

