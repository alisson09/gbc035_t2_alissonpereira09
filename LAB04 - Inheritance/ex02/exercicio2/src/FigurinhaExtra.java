public class FigurinhaExtra extends Figurinha{

    private String categoria;
    private String cor;

    public FigurinhaExtra(String nome, String posicao, String pais, int dia, String mes, int ano, float altura, float peso, String categoria, String cor) {
        super(nome, posicao, pais, dia, mes, ano, altura, peso);
        this.categoria = categoria;
        this.cor = cor;
    }

public void MostrarFigurinha(){
    System.out.println("\nCriando figurinha extra!");
    System.out.println("Nome: "+ nome);
    System.out.println("Posicao: "+ posicao);
    System.out.println("Nasceu no dia "+ dia + " de " + mes + " de "+ ano);
    System.out.println("Altura: "+ altura);
    System.out.println("Peso: "+ peso);
    System.out.println("Pais: "+ pais);
    System.out.println("Categoria: "+ categoria);
    System.out.println("Cor: "+cor);}
}
