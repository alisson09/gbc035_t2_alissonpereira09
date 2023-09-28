public class VIP extends Ingresso{
    private double adicional;

    public VIP(double valor, double adicional){
        super(valor);
        this.adicional=adicional;
    }

    public double getAdicional(){
        return adicional;
    }

    public void valorVip(){
        System.out.println("O valor do ingresso vip é: "+(adicional+getValor()));
    }

}
