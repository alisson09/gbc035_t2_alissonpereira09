import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite a quantidade de livros que quer cadastrar:");
        Scanner dados = new Scanner(System.in);
        int n = dados.nextInt();
        dados.nextLine();

        Livro[] li = new Livro[n];

        for (int i = 0; i < li.length; i++){
            System.out.println("Digite o titulo do "+(i+1)+"o livro");
            String titulo = dados.nextLine();
            System.out.println("Digite o nome do autor do "+(i+1)+"o livro");
            String autor = dados.nextLine();
            li[i] = new Livro(titulo, autor);
        }

        Biblioteca biblioteca = new Biblioteca(li);
        Livro[] livros = biblioteca.getTotalDeLivros();

        for (int i = 0; i < livros.length ; i++){
            Livro livro = livros[i];
            System.out.println("Livro "+(i+1)+":");
            System.out.print("Título: "+livro.getTitulo());
            System.out.println(", Autor: "+livro.getAutor());
        }
    }
}