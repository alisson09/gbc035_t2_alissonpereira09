public class Main {

    public static void main(String[] args) {

        Estudante e = new Estudante("Carlos","Rua 1o de Abril");

        EstudanteGraduacao eg = new EstudanteGraduacao("Maria", "Rua Maio", "Java is funny");
        EstudantePosGrad ep = new EstudantePosGrad("Ailton","Rua 31 de fevereiro","Engenharia",
                "Banco de Dados");
        EstudanteMestrado epm = new EstudanteMestrado("Carla","Rua Primavera","Medicina",
                "Vacinas de RNA", "academico","Anticorpos");
        EstudanteDoutorado epd = new EstudanteDoutorado("Bruno","Rua Inverno",
                "Tecnologia","Processamento de Imagens","Carros Inteligentes");

        e.print();


        eg.print();
        System.out.println("Título TCC: " + eg.getTituloTCC());

        ep.print();
        System.out.println("Formação prévia: " + ep.getFormacao());

        epm.print();
        System.out.println("Título Dissertação: " + epm.getTituloDissertacao());

        epd.print();
        System.out.println("Título Tese: " + epd.getTituloTese());



        // casos com polimorfismo
        Estudante e2 = new Estudante("Carlos","Rua 1o de Abril");
        Estudante eg2 = new EstudanteGraduacao("Maria", "Rua Maio", "Java is funny");
        Estudante ep2 = new EstudantePosGrad("Ailton","Rua 31 de fevereiro","Engenharia",
                "Banco de Dados");
        Estudante epm2 = new EstudanteMestrado("Carla","Rua Primavera","Medicina",
                "Vacinas de RNA", "Anticorpos","academico");
        Estudante epd2 = new EstudanteDoutorado("Bruno","Rua Inverno",
                "Tecnologia","Processamento de Imagens","Carros Inteligentes");

        Universidade universidade = new Universidade("UFU", "14/08/1969");
        universidade.addEstudantes(eg);
        universidade.addEstudantes(eg2);
        universidade.addEstudantes(epm);
        universidade.addEstudantes(epm2);
        universidade.addEstudantes(epd);
        universidade.addEstudantes(epd2);
        universidade.mostraInformacoesAlunos();

        universidade.contaTodosAlunos();

    }
}
