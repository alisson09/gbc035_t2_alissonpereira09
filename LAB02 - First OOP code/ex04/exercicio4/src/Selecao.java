public class Selecao {
    private String nomeSelecao;
    private String nomeDoTecnico;
    private String []jogadoresTitulares;
    private String []jogadoresReservas;


    public void setNomeSelecao(String nome){
        nomeSelecao = nome;
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

    public void setJogadoresTitulares(String[] jogadores) {
        jogadoresTitulares = jogadores;
    }
    public String[] getJogadoresTitulares(){
        return jogadoresTitulares;
    }

    public void setJogadoresReservas(String[] jogadores) {
        jogadoresReservas = jogadores;
    }
    public String[] getJogadoresReservas(){
        return jogadoresReservas;
    }

}
