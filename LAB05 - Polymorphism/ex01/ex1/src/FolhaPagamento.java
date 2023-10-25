public class FolhaPagamento {
    private Funcionario[] funcionarios;

    public FolhaPagamento(Funcionario[] funcionarios){
        setFuncionarios(funcionarios);
    }

    public void mostrarFolhaPagamentos(){
        System.out.println("\nFolha de Pagamentos");
        for (int i = 0; i < getFuncionarios().length; i++){
            System.out.println("\nNome: " + getFuncionarios()[i].getNome() +
                    "\nSalario R$: " + getFuncionarios()[i].getSalario());
        }
    }

    public void setFuncionarios(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }
    public Funcionario[] getFuncionarios(){
        return funcionarios;
    }

}
