public class Cubo extends FormaTridimensional{
    private double lado;
    public Cubo(double lado){
        this.lado = lado;
    }
    @Override
    public void Area(){
        System.out.println("\nArea do Cubo é: " + ( 6*Math.pow(getLado(),2) ));
    }
    @Override
    public void Volume(){
        System.out.println("Volume do Cubo é: " + (Math.pow(getLado(),3)));
    }
    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }
}
