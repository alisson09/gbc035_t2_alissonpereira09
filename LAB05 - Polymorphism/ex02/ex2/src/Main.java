public class Main {
    public static void main(String[] args) {

        Forma[] formas = new Forma[6];

        formas[0] = new Circulo(6);
        formas[0].Area();
        formas[0].setDescricao("O círculo não tem início e nem fim");
        System.out.println(formas[0].getDescricao());

        formas[1] = new Quadrado(3);
        formas[1].Area();
        formas[1].setDescricao("O quadrado tem 4 lados iguais.");
        System.out.println(formas[1].getDescricao());

        formas[2] = new Triangulo(5,9);
        formas[2].Area();
        formas[2].setDescricao("O triangulo tem 3 lados, podendo ser iguais ou não");
        System.out.println(formas[2].getDescricao());

        formas[3] = new Esfera(10);
        formas[3].Area();
        formas[3].Volume();
        formas[3].setDescricao("Esfera é uma figura tridimensional que se assemelha a um circulo");
        System.out.println(formas[3].getDescricao());

        formas[4] = new Cubo(8);
        formas[4].Area();
        formas[4].Volume();
        formas[4].setDescricao("O cubo é uma figura tridimensional que se assemelha a um quadrado");
        System.out.println(formas[4].getDescricao());

        formas[5] = new Tetraedro(2,5);
        formas[5].Area();
        formas[5].Volume();
        formas[5].setDescricao("O cubo é uma figura tridimensional que se assemelha a um triangulo");
        System.out.println(formas[5].getDescricao());

    }
}