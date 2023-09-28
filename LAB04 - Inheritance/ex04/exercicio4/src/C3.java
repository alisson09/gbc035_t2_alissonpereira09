public class C3 extends C2{

    public int C31;
    protected int C32;
    private int C33;
    public C3() {
        super();
        System.out.println("Classe C3: chamada do construtor padrão, sem parâmetros");
    }

    public C3(C2 c2, int C31, int C32, int C33) {
        super(c2, c2.C21, c2.C22, c2.getC23());
        this.C31 = C31;
        this.C32 = C32;
        this.C33 = C33;
        System.out.println("Classe C3: chamada do construtor com parâmetros");
    }

    @Override
    public void mostar_atributos() {
        System.out.println("Atributo público (C3): " + C31);
        System.out.println("Atributo protegido (C3): " + C32);
        System.out.println("Atributo privado (C3): " + C33);
    }

    public void mostar_atributos_super() {
        super.mostar_atributos_super();
        System.out.println("Atributo público (super C3): " + C31);
        System.out.println("Atributo protegido (super C3): " + C32);
        System.out.println("Atributo privado (super C3): " + C33);
    }
}
