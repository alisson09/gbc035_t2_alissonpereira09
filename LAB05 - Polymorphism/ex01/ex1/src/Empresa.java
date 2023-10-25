public class Empresa {
    public static void main(String[] args) {

        Funcionario[] funcionarios = new Funcionario[8];

        funcionarios[0] = new Chefe("Lucas","09 de abril de 1980", 12000f);
        funcionarios[1] = new Chefe("Paulo", "14 de dezembro de 1966", 25000f);

        funcionarios[2] = new Vendedor("Raul", "30 de março de 1990", 2000,0.10f,10);
        funcionarios[3] = new Vendedor("Carlos", "07 de janeiro de 1987", 2000,0.10f,15);

        funcionarios[4] = new Operario("Julia", "25 de julho de 1965", 12.0f, 20);
        funcionarios[5] = new Operario("Paola", "01 de 01 de 2000", 12.0f, 10);

        funcionarios[6] = new Horista("Juliana", "05 de junho de 1994", 20, 192f);
        funcionarios[7] = new Horista("André", "14 de novembro de 1992", 20, 200f);

        FolhaPagamento folhaPagamento = new FolhaPagamento(funcionarios);
        folhaPagamento.mostrarFolhaPagamentos();
    }
}