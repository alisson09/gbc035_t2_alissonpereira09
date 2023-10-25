public class Quadrado extends FormaBidimensional{
    private double lado;
    public Quadrado(double lado) {
        this.lado = lado;
    }
    @Override
    public void Area(){
        System.out.println("\nArea do Quadrado é: " + Math.pow(getLado(), 2));
    }
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
