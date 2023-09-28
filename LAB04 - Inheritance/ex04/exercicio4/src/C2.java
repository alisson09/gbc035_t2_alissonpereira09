public class C2 extends C1{

    public int C21;
    protected int C22;
    private int C23;
    public C2() {
        super();
        System.out.println("Classe C2: chamada do construtor padrão, sem parâmetros");
    }

    public C2(C1 c1, int C21, int C22, int C23) {
        super(c1.C11, c1.C12, c1.getC13());
        this.C21 = C21;
        this.C22 = C22;
        this.C23 = C23;
        System.out.println("Classe C2: chamada do construtor com parâmetros");
    }

    public int getC23(){
        return C23;
    }

    @Override
    public void mostar_atributos() {
        System.out.println("Atributo público (C2): " + C21);
        System.out.println("Atributo protegido (C2): " + C22);
        System.out.println("Atributo privado (C2): " + C23);
    }

    public void mostar_atributos_super() {
        super.mostar_atributos_super();
        System.out.println("Atributo público (super C2): " + C21);
        System.out.println("Atributo protegido (super C2): " + C22);
        System.out.println("Atributo privado (super C2): " + C23);
    }
}
