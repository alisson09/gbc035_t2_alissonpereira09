public class Produto implements Classificavel {
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    private int codigo;

    public Produto(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public int comparaCom(Classificavel obj) {
        if (obj instanceof Produto) {
            Produto outro = (Produto) obj;
            return Integer.compare(this.codigo, outro.codigo);
        }
        throw new IllegalArgumentException("Incompatível com Produto");
    }
}
