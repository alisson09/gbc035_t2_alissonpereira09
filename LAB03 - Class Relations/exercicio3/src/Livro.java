public class Livro {
    private String titulo;
    private String autor;

    public Livro(String title, String name){
        titulo = title;
        autor = name;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }
}
