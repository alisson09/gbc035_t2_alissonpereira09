public class Cliente implements Classificavel {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Cliente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public boolean eMenorQue(Classificavel o) {
        if (o instanceof Cliente) {
            Cliente compara = (Cliente) o;
            return this.nome.compareTo(compara.nome) < 0;
        }
        return false;
    }
}