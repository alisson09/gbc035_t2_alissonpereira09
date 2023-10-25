public class Tetraedro extends FormaTridimensional{
    private double lado;
    private double altura;

    public Tetraedro(double lado, double altura) {
        this.lado = lado;
        this.altura = altura;
    }
    @Override
    public void Area(){
        System.out.println("\nArea do Tetraedro é: " + ( Math.pow(getLado(),2)*Math.sqrt(3) ));
    }

    @Override
    public void Volume(){
        System.out.println("Volume do Tetraedro é: " + ( 0.333*(Math.pow(getLado(),2)*Math.sqrt(3))*getAltura() ));
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
