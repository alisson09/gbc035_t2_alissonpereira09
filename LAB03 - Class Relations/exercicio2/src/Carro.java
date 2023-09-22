public class Carro {
    private String marca;
    private Motor motor;

    public Carro(String marca1, Motor motor1) {
        marca = marca1;
        motor = motor1;
    }

    public String getMarca() {
        return marca;
    }

    public Motor getMotor() {
        return motor;
    }
}
