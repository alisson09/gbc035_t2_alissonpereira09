public class Circulo extends FormaBidimensional{
    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }
    @Override
    public void Area(){
        System.out.println("\nCircunferencia do Circulo é: " + Math.PI*Math.pow(getRaio(),2));
    }
    public double getRaio(){
        return raio;
    }

    public void setRaio(double raio){
        this.raio = raio;
    }
}
