public class Esfera extends FormaTridimensional{
    private double raio;
    public Esfera(double raio) {
        this.raio = raio;
    }
    @Override
    public void Area(){
        System.out.println("\nCircunferencia da Esfera é: " + ( 4*Math.PI*Math.pow(getRaio(),2) ));
    }

    @Override
    public void Volume(){
        System.out.println("Volume da Esfera é: " +  1.33 * Math.PI * Math.pow(getRaio(),3) );
    }


    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
