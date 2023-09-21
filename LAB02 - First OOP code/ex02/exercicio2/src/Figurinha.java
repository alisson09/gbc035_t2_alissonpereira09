public class Figurinha {
    private String nome;
    private String dataNascimento;
    private String posicao;
    private String pais;
    private float altura;
    private float peso;

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

    public void setPais(String p) {
        pais = p;
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

    public void setPeso(float pes) {
        peso = pes;
    }
    public float getPeso() {
        return peso;
    }
}

