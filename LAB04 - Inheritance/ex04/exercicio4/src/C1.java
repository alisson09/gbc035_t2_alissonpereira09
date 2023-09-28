public class C1 {
    public int C11;
    protected int C12;
    private int C13;

    public C1() {
        System.out.println("Classe C1: chamada do construtor padrão, sem parâmetros");
    }

    public C1(int C11, int C12, int C13) {
        this.C11 = C11;
        this.C12 = C12;
        this.C13 = C13;
        System.out.println("Classe C1: chamada do construtor com parâmetros");
    }

    public int getC13(){
        return C13;
    }

    public void mostar_atributos() {
        System.out.println("Atributo público: " + C11);
        System.out.println("Atributo protegido: " + C12);
        System.out.println("Atributo privado: " + C13);
    }

    public void mostar_atributos_super() {
        System.out.println("Atributo público (super): " + C11);
        System.out.println("Atributo protegido (super): " + C12);
        System.out.println("Atributo privado (super): " + C13);
    }
}
