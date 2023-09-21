public class Main {
    public static void main(String[] args) {

        Figurinha figurinha1 = new Figurinha();
        figurinha1.setNome("Romarinho");
        figurinha1.setDataNascimento(" 12 de janeiro de 1990");
        figurinha1.setPosicao("Atacante");
        figurinha1.setPais("Brasil");
        figurinha1.setAltura(1.76F);
        figurinha1.setPeso(67F);

        System.out.println("\n<< Figurinha do Jogador 1 \n");
        System.out.println("Nome do primeiro jogador: "+figurinha1.getNome());
        System.out.println("Data de nascimento do primeiro jogador: "+figurinha1.getDataNascimento());
        System.out.println("Posição do primeiro jogador: "+figurinha1.getPosicao());
        System.out.println("Pais do primeiro jogador: "+figurinha1.getPais());
        System.out.println("Altura do primeiro jogador: "+figurinha1.getAltura());
        System.out.println("Peso do primeiro jogador: "+figurinha1.getPeso());



        Figurinha figurinha2 = new Figurinha();
        figurinha2.setNome("Cristiano Ronaldo");
        figurinha2.setDataNascimento("5 de fevereiro de 1985");
        figurinha2.setPosicao("Atacante");
        figurinha2.setPais("Portugal");
        figurinha2.setAltura(1.87F);
        figurinha2.setPeso(84F);

        System.out.println("\n<< Figurinha do Jogador 2 \n");
        System.out.println("Nome do segundo jogador: "+figurinha2.getNome());
        System.out.println("Data de nascimento do segundo jogador: "+figurinha2.getDataNascimento());
        System.out.println("Posição do segundo jogador: "+figurinha2.getPosicao());
        System.out.println("Pais do segundo jogador: "+figurinha2.getPais());
        System.out.println("Altura do segundo jogador: "+figurinha2.getAltura());
        System.out.println("Peso do segundo jogador: "+figurinha2.getPeso());



        Figurinha figurinha3 = new Figurinha();
        figurinha3.setNome("Sergio Agüero");
        figurinha3.setDataNascimento("2 de junho de 1988");
        figurinha3.setPosicao("Atacante");
        figurinha3.setPais("Argentina");
        figurinha3.setAltura(1.73F);
        figurinha3.setPeso(70F);


        System.out.println("\n<< Figurinha do Jogador 3 \n");
        System.out.println("Nome do terceiro jogador: "+figurinha3.getNome());
        System.out.println("Data de nascimento do terceiro jogador: "+figurinha3.getDataNascimento());
        System.out.println("Posição do terceiro jogador: "+figurinha3.getPosicao());
        System.out.println("Pais do terceiro jogador: "+figurinha3.getPais());
        System.out.println("Altura do terceiro jogador: "+figurinha3.getAltura());
        System.out.println("Peso do terceiro jogador: "+figurinha3.getPeso());
    }
}