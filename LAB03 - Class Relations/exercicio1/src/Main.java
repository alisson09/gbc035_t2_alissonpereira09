public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Boticario");
        Empregado empregado = new Empregado("Felipe");
        System.out.println(empregado.getEmpregadoNome() +" é um funcionario da empresa " +empresa.getEmpresaNome());
    }
}