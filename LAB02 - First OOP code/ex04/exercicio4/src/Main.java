public class Main {
    public static void main(String[] args) {

        Selecao []selecoes = new Selecao[2];

        for (int i = 0; i < 2; i++) {
            selecoes[i] = new Selecao();
        }

        
        System.out.println("Selecao 1\n");
        selecoes[0].setNomeSelecao("Espanha");

        String []jogadores = {"Casillas","Piqué","Puyol","Sergio Ramos","Capdevila","Xabi Alonso","Sergio Busquets","Xavi Hernandez","Iniesta","Villa","Fernando Torres"};
        selecoes[0].setJogadoresTitulares(jogadores);

        selecoes[0].setNomeDoTecnico("Vicente del Bosque.");

        System.out.println("Nome da Selecao: " +selecoes[0].getNomeSelecao());
        System.out.println("Nome do tecnico: "+selecoes[0].getNomeDoTecnico());
        System.out.println("Nome dos jogadores titulares: ");

        String[] jogadoresTitulares = selecoes[0].getJogadoresTitulares();
        for (int i = 0; i < jogadoresTitulares.length; i++) {
            System.out.print( jogadoresTitulares[i] + ". " );
        }
        System.out.println();

        jogadores = new String[]{"Valdés ", "Arbeloa", "Marchena", "Fàbregas", "David Silva"};
        selecoes[0].setJogadoresReservas(jogadores);

        System.out.println("\nNome dos Jogadores Reservas: ");
        String[] jogadoresReservas = selecoes[0].getJogadoresReservas();
        for (int i = 0; i < jogadoresReservas.length; i++) {
            System.out.print( jogadoresReservas[i] + ". " );
        }

        // Selecao 2
        System.out.println("\n\nSelecao 02\n");
        selecoes[1].setNomeSelecao("França");

        jogadores = new String[]{"Lloris","Pavard","Varane","Umtiti","Hernandez","Kanté","Pogba","Matuidi","Griezmann","Giroud","Mbappé"};
        selecoes[1].setJogadoresTitulares(jogadores);

        selecoes[1].setNomeDoTecnico("Didier Deschamps");

        System.out.println("Nome da Selecao: " +selecoes[1].getNomeSelecao());
        System.out.println("Nome do tecnico: "+selecoes[1].getNomeDoTecnico());
        System.out.println("Nome dos jogadores titulares: ");

        jogadoresTitulares = selecoes[1].getJogadoresTitulares();
        for (int i = 0; i < jogadoresTitulares.length; i++) {
            System.out.print( jogadoresTitulares[i] + ". ");
        }

        System.out.println();

        jogadores = new String[]{"Mandanda", "Kimpembe", "Tolisso", "Lemar", "Fekir"};
        selecoes[1].setJogadoresReservas(jogadores);

        System.out.println("\nNome dos Jogadores Reservas: ");
        jogadoresReservas = selecoes[1].getJogadoresReservas();
        for (int i = 0; i < jogadoresReservas.length; i++) {
            System.out.print( jogadoresReservas[i] + ". " );
        }

    }
}