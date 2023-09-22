public class Selecao {
    private String nomeSelecao;
    private String nomeDoTecnico;
    private Figurinha []jogadoresTitulares = new Figurinha[11];
    private Figurinha []jogadoresReservas = new Figurinha[5];

    public Selecao(String pais, String nome, String tecnico){
        nomeSelecao = nome;
        nomeDoTecnico = tecnico;

        for (int i = 0; i < 11; i++) {
            jogadoresTitulares[i] = new Figurinha(pais);
        }

        for (int i = 0; i < 5; i++) {
            jogadoresReservas[i] = new Figurinha(pais);
        }
    }

    public String getNomeSelecao(){
        return nomeSelecao;
    }

    public void setNomeDoTecnico(String nome){
        nomeDoTecnico = nome;
    }
    public String getNomeDoTecnico(){
        return nomeDoTecnico;
    }

    public void setJogadoresTitulares(Figurinha[] jogadores) {
        jogadoresTitulares = jogadores;
    }
    public Figurinha[] getJogadoresTitulares(){
        return jogadoresTitulares;
    }

    public void setJogadoresReservas(Figurinha[] jogadores) {
        jogadoresReservas = jogadores;
    }
    public Figurinha[] getJogadoresReservas(){
        return jogadoresReservas;
    }

}
