public class Servico implements Classificavel {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    private double preco;

    public Servico(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public boolean eMenorQue(Classificavel o) {
        if (o instanceof Servico) {
            Servico compara = (Servico) o;
            return this.preco < compara.preco;
        }
        return false;
    }

}