public class Figurinha {
    private String nome, posicao, pais, mes;
    private int dia, ano;
    private float altura, peso;

    public Figurinha(String nome, String posicao, String pais, int dia, String mes, int ano, float altura, float peso) {
        this.nome = nome;
        this.posicao = posicao;
        this.pais = pais;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.altura = altura ;
        this.peso = peso;
    }

    public void MostrarFigurinha(){
        System.out.println("Nome: "+ nome);
        System.out.println("Posicao: "+ posicao);
        System.out.println("Nasceu no dia "+ dia + " de " + mes + " de "+ ano);
        System.out.println("Altura: "+ altura);
        System.out.println("Peso: "+ peso);
        System.out.println("Pais: "+ pais);
    }
}
