public class Funcionario {
    private String nome, dataNascimento;
    private double salario;

    public Funcionario(String nome, String dataNascimento, double salario){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
    }

    public String getNome(){
        return nome;
    }

    public String getDataNascimento(){
        return dataNascimento;
    }

    public double getSalario(){
        return salario;
    }
    public void mostrarfuncionario(){
        System.out.println("Nome: "+getNome()+", data de nascimento: "+getDataNascimento());
    }

    public double calcularSalario() {
        return salario;
    }
}
