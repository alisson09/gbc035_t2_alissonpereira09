public class Ingresso {
    private double valor;

    public Ingresso(double valor){
        this.valor=valor;
    }

    public double getValor(){
        return valor;
    }

    public void escreveValor(){
        System.out.println("O valor do ingresso é: "+getValor());
    }
}
