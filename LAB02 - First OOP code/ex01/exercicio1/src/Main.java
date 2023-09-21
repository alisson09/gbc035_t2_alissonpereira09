public class Main {
    public static void main(String[] args) {

        Figurinha figurinha1 = new Figurinha();
        figurinha1.nome = "Romarinho";
        figurinha1.dataNascimento = " 12 de janeiro de 1990";
        figurinha1.posicao = "Atacante";
        figurinha1.pais = "Brasil";
        figurinha1.altura = 1.76F;
        figurinha1.peso = 67F;

        System.out.println("\n<< Figurinha do Jogador 1 \n");
        System.out.println("Nome do primeiro jogador: "+figurinha1.nome);
        System.out.println("Data de nascimento do primeiro jogador: "+figurinha1.dataNascimento);
        System.out.println("Posição do primeiro jogador: "+figurinha1.posicao);
        System.out.println("Pais do primeiro jogador: "+figurinha1.pais);
        System.out.println("Altura do primeiro jogador: "+figurinha1.altura);
        System.out.println("Peso do primeiro jogador: "+figurinha1.peso);


        Figurinha figurinha2 = new Figurinha();
        figurinha2.nome = "Cristiano Ronaldo";
        figurinha2.dataNascimento = "5 de fevereiro de 1985";
        figurinha2.posicao = "Atacante";
        figurinha2.pais = "Portugal";
        figurinha2.altura = 1.87F;
        figurinha2.peso = 84F;

        System.out.println("\n<< Figurinha do Jogador 2 \n");
        System.out.println("Nome do segundo jogador: "+figurinha2.nome);
        System.out.println("Data de nascimento do segundo jogador: "+figurinha2.dataNascimento);
        System.out.println("Posição do segundo jogador: "+figurinha2.posicao);
        System.out.println("Pais do segundo jogador: "+figurinha2.pais);
        System.out.println("Altura do segundo jogador: "+figurinha2.altura);
        System.out.println("Peso do segundo jogador: "+figurinha2.peso);


        Figurinha figurinha3 = new Figurinha();
        figurinha3.nome = "Sergio Agüero";
        figurinha3.dataNascimento = "2 de junho de 1988";
        figurinha3.posicao = "Atacante";
        figurinha3.pais = "Argentina";
        figurinha3.altura = 1.73F;
        figurinha3.peso = 70F;

        System.out.println("\n<< Figurinha do Jogador 3 \n");
        System.out.println("Nome do terceiro jogador: "+figurinha3.nome);
        System.out.println("Data de nascimento do terceiro jogador: "+figurinha3.dataNascimento);
        System.out.println("Posição do terceiro jogador: "+figurinha3.posicao);
        System.out.println("Pais do terceiro jogador: "+figurinha3.pais);
        System.out.println("Altura do terceiro jogador: "+figurinha3.altura);
        System.out.println("Peso do terceiro jogador: "+figurinha3.peso);
    }
}