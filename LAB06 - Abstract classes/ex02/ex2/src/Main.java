public class Main {
    public static void main(String[] args) {

        ContaComum c1 = new ContaComum(150,1237,5533);
        c1.debitaValor(100,5533);

        ContaEspecial c2 = new ContaEspecial(200, 4567, 2222, 30000);
        c2.debitaValor(150, 2222);

    }
}