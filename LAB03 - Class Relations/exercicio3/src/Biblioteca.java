public class Biblioteca {
    private Livro[] livros;

    public Biblioteca(Livro[] li){
        livros = li;
    }

    public Livro[] getTotalDeLivros(){
        return livros;
    }
}
