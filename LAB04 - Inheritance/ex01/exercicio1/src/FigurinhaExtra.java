public class FigurinhaExtra{

    private String nome, posicao, pais, mes;
    private int dia, ano;
    private float altura, peso;
    private String categoria;
    private String cor;

    public FigurinhaExtra(String nome, String posicao, String pais, int dia, String mes, int ano, float altura, float peso, String categoria, String cor) {
        this.nome = nome;
        this.posicao = posicao;
        this.pais = pais;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.altura = altura ;
        this.peso = peso;
        this.categoria = categoria;
        this.cor = cor;
    }


    public void MostrarFigurinha() {
        System.out.println("\nCriando figurinha extra!");
        System.out.println("Nome: "+ nome);
        System.out.println("Posicao: "+ posicao);
        System.out.println("Nasceu no dia "+ dia + " de " + mes + " de "+ ano);
        System.out.println("Altura: "+ altura);
        System.out.println("Peso: "+ peso);
        System.out.println("Pais: "+ pais);
        System.out.println("Categoria: "+ categoria);
        System.out.println("Cor: "+cor);
    }
}
