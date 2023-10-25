public class Universidade {
    private String nomeUniversidade;
    private String dataFundacao;

    private Estudante[] estudantes;
    private int qtdEstudantes;

    public Universidade(String nomeUniversidade, String dataFundacao) {
        this.nomeUniversidade = nomeUniversidade;
        this.dataFundacao = dataFundacao;
        this.estudantes = new Estudante[100];
        this.qtdEstudantes = 0;
    }

    public void addEstudantes(Estudante novoEstudante){
        if(qtdEstudantes < 100){
            estudantes[qtdEstudantes] = novoEstudante;
            qtdEstudantes++;
        } else {
            System.out.println("Numero maximo de estudantes cadastrados atingido");
        }
    }

    public void contaTodosAlunos() {
        System.out.println("\nA Universidade tem\n");
        System.out.println(this.contaGraduacao() + " Alunos em graduacao.\n");
         System.out.println(this.contaMestrado() + " Alunos em mestrado.\n");
         System.out.println(this.contaDoutorado() + " Alunos em doutorado.\n");
    }

    public int contaGraduacao(){
        int cont = 0;
        for (int i = 0; i < qtdEstudantes; i++) {
            if (estudantes[i] instanceof EstudanteGraduacao)
                cont ++;
        }
        return cont;
    }

    public int contaMestrado(){
        int cont = 0;
        for (int i = 0; i < qtdEstudantes; i++) {
            if (estudantes[i] instanceof EstudanteMestrado)
                cont ++;
        }
        return cont;
    }

    public int contaDoutorado(){
        int cont = 0;
        for (int i = 0; i < qtdEstudantes; i++) {
            if (estudantes[i] instanceof EstudanteDoutorado)
                cont ++;
        }
        return cont;
    }

    public void mostraInformacoesAlunos(){
        System.out.println("Alunos:");
        if (qtdEstudantes > 0) {
            for (int i = 0; i < qtdEstudantes; i++) {
                System.out.println(estudantes[i].getNome());
                if (estudantes[i] instanceof EstudanteDoutorado)
                    System.out.println("Tese: " + ((EstudanteDoutorado) estudantes[i]).tituloTese);
            }
        } else {
            System.out.println("Não há alunos matriculados");
        }
    }

    public String getNomeUniversidade() {
        return nomeUniversidade;
    }

    public void setNomeUniversidade(String nomeUniversidade) {
        this.nomeUniversidade = nomeUniversidade;
    }

    public String getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(String dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public Estudante[] getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(Estudante[] estudantes) {
        this.estudantes = estudantes;
    }
}
