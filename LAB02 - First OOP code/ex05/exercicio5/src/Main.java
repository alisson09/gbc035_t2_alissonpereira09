import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Selecao selecao1 = new Selecao("Brasil", "Seleção Brasileira", "Felipão");

        Figurinha jogador1 = selecao1.getJogadoresTitulares()[0];
        jogador1.setNome("Marcos");
        jogador1.setPeso(88F);
        jogador1.setAltura(1.88F);
        jogador1.setPosicao("Goleiro");
        jogador1.setDataNascimento("4 de agosto de 1973");

        Figurinha jogador2 = selecao1.getJogadoresTitulares()[1];
        jogador2.setNome("Ronaldo");
        jogador2.setPeso(83F);
        jogador2.setAltura(1.83F);
        jogador2.setPosicao("Atacante");
        jogador2.setDataNascimento("22 de setembro de 1976");

        Figurinha jogador3 = selecao1.getJogadoresTitulares()[2];
        jogador3.setNome("Rivaldo");
        jogador3.setPeso(75F);
        jogador3.setAltura(1.86F);
        jogador3.setPosicao("Meia-atacante");
        jogador3.setDataNascimento("19 de abril de 1972");

        Figurinha jogador4 = selecao1.getJogadoresReservas()[0];
        jogador4.setNome("Dida");
        jogador4.setPeso(92F);
        jogador4.setAltura(1.93F);
        jogador4.setPosicao("Goleiro");
        jogador4.setDataNascimento("7 de outubro de 1973");

        Figurinha jogador5 = selecao1.getJogadoresReservas()[1];
        jogador5.setNome("Denílson");
        jogador5.setPeso(75F);
        jogador5.setAltura(1.75F);
        jogador5.setPosicao("Meia-atacante");
        jogador5.setDataNascimento("24 de agosto de 1977");


        System.out.println( "\n" + selecao1.getNomeSelecao() );
        System.out.println( "Tecnico: " + selecao1.getNomeDoTecnico() );

        System.out.println("\nJOGADORES TITULARES");

        for (int i = 0; i < selecao1.getJogadoresTitulares().length; i++) {
            System.out.println("\nFigurinha dos Jogador Titular "+(i+1));
            System.out.println("Nome: "+selecao1.getJogadoresTitulares()[i].getNome());
            System.out.println("Pais: "+selecao1.getJogadoresTitulares()[i].getPais());
            System.out.println("Peso: "+selecao1.getJogadoresTitulares()[i].getPeso());
            System.out.println("Altura: "+selecao1.getJogadoresTitulares()[i].getAltura());
            System.out.println("Posicao: "+selecao1.getJogadoresTitulares()[i].getPosicao());
        }

        System.out.println("\nJOGADORES RESERVAS");

        for (int i = 0; i < selecao1.getJogadoresReservas().length; i++) {
            System.out.println("\nFigurinha do Jogador Reserva "+ (i+1));
            System.out.println("Nome: "+selecao1.getJogadoresReservas()[i].getNome());
            System.out.println("Pais: "+selecao1.getJogadoresReservas()[i].getPais());
            System.out.println("Peso: "+selecao1.getJogadoresReservas()[i].getPeso());
            System.out.println("Altura: "+selecao1.getJogadoresReservas()[i].getAltura());
            System.out.println("Posicao: "+selecao1.getJogadoresReservas()[i].getPosicao());
        }

    }
}