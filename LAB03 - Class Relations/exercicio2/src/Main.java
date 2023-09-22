public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor("Motor V8");

        Carro carro = new Carro("Ford", motor);

        System.out.println("Marca do carro: "+carro.getMarca());
        System.out.println("Modelo do motor: "+carro.getMotor().getModelo());
    }
}