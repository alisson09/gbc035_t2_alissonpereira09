public class CamaroteSuperior extends VIP{

    private double adicionais;

    public CamaroteSuperior(double valor, double adicional, double adicionais){
        super(valor, adicional);
        this.adicionais = adicionais;
    }

    public void imprimeCamaroteSuperior(){
        System.out.println("O valor do camarote superior é: "+(getValor()+getAdicional()+adicionais));
    }
}
