public class UsaBanco {
    public static void main(String[] args) {

        ContaEspecial[] contaEspecial = new ContaEspecial[2];

        contaEspecial[0] = new ContaEspecial(7500,5522,1234,18000);
        contaEspecial[1] = new ContaEspecial(8000,5564,5678,30000);

        System.out.println("Conta 1 saldo: " + contaEspecial[0].getSaldo(1234));
        System.out.println("Conta 2 saldo: " + contaEspecial[1].getSaldo(5678));

        contaEspecial[0].debitaValor(400);
        contaEspecial[1].debitaValor(950);

        System.out.println("Conta 1 saldo após debito: " + contaEspecial[0].getSaldo(1234));
        System.out.println("Conta 2 saldo após debito: " + contaEspecial[1].getSaldo(5678));

    }
}