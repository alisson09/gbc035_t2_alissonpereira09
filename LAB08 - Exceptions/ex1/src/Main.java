public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("12345678901", "João", 3000000.00f);

        try {
            funcionario.aumentarSalario(20); // Aumentar o salário em 20%
            System.out.println("Salário após o aumento: R$" + funcionario.getSalario());
        } catch (TetoSalarialExcedidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}