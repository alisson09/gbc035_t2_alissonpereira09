public class Figurinha {
    private String nome;
    private String dataNascimento;
    private String posicao;
    private String pais;
    private float altura;
    private float peso;

    public Figurinha(String p){
        nome = "Nenhum nome foi atribuido a este jogador";
        dataNascimento = " Nenhuma data de nascimento foi atribuida a este jogador";
        posicao = "Nenhuma posição foi atribuida a este jogador";
        peso = 0;
        altura = 0;
        pais = p;
    }

    public void setNome(String name){
        nome = name;
    }
    public String getNome() {
        return nome;
    }

    public void setDataNascimento(String data) {
        dataNascimento = data;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setPosicao(String pos) {
        posicao = pos;
    }
    public String getPosicao() {
        return posicao;
    }

    public String getPais() {
        return pais;
    }

    public void setAltura(float alt) {
        altura = alt;
    }
    public float getAltura() {
        return altura;
    }

    public void setPeso(float p) {
        peso = p;
    }
    public float getPeso() {
        return peso;
    }
}


