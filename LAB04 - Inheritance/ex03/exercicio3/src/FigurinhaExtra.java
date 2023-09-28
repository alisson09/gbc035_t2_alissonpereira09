public class FigurinhaExtra extends Figurinha{

    private String categoria;
    private String cor;

    public FigurinhaExtra(String nome, String posicao, String pais, int dia, String mes, int ano, float altura, float peso, String categoria, String cor) {
        super(nome, posicao, pais, dia, mes, ano, altura, peso);
        this.categoria = categoria;
        this.cor = cor;
    }

    @Override
    public void MostrarFigurinha() {
        System.out.println("\nCriando figurinha extra!");
        super.MostrarFigurinha();
        System.out.println("Categoria: "+ categoria);
        System.out.println("Cor: "+cor);
    }
}
