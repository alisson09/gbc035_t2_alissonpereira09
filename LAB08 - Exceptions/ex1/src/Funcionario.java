class Funcionario {
    private String cpf;
    private String nome;
    private float salario;
    private float tetoSalarial;

    public Funcionario(String cpf, String nome, float salario) {
        this.cpf = cpf;
        this.nome = nome;
        this.salario = salario;
        this.tetoSalarial = 40000.00f; // Teto salarial padrão de R$ 40 mil
    }

    public float getTetoSalarial() {
        return tetoSalarial;
    }

    public void setTetoSalarial(float novoTeto) {
        this.tetoSalarial = novoTeto;
    }

    public void aumentarSalario(float percentual) {
        float aumento = salario * (percentual / 100);
        float novoSalario = salario + aumento;

        if (novoSalario < 0) {
            throw new TetoSalarialExcedidoException("Valor inválido de salário");
        }

        if (novoSalario > tetoSalarial) {
            throw new TetoSalarialExcedidoException("Valor ultrapassa o teto");
        }

        salario = novoSalario;
    }

    public float getSalario() {
        return salario;
    }
}
