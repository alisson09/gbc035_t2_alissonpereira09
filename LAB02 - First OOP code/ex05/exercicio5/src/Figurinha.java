public class Figurinha {
    private String nome;
    private String dataNascimento;
    private String posicao;
    private String pais;
    private float altura;
    private float peso;

    public Figurinha(String p){
        nome = "Sem nome declarado";
        dataNascimento = " Sem data declarada";
        posicao = "Sem posicao declarada";
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


