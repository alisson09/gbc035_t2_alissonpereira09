public class Funcionario {
    private String nome;
    private String dataNascimento;
    private float salario;

    public Funcionario(String nome, String dataNascimento, float salario) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
    }

    public void calculaSalario(){
        setSalario(salario);
    }

    public void imprimirFuncionario() {
        System.out.println("\n......" +
                "\n.. Nome: " + getNome() +
                "\n.. Data Nascimento: " + getDataNascimento() +
                "\n.. Salario: " + getSalario() +
                "\n......");
    }

    public String getNome() {
        return nome;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }
    public float getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
}
