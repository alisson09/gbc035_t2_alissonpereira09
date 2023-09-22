import java.util.Scanner;

public class principal {

    public static void ex01(){
        Scanner sc = new Scanner(System.in);
        int val1,val2,val3,val4,val5,val6;

        System.out.println("<< Listando um vetor >>");
        System.out.println("Entre com o número 1:");
        val1 = sc.nextInt();

        System.out.println("Entre com o número 2:");
        val2 = sc.nextInt();

        System.out.println("Entre com o número 3:");
        val3 = sc.nextInt();

        System.out.println("Entre com o número 4:");
        val4 = sc.nextInt();

        System.out.println("Entre com o número 5:");
        val5 = sc.nextInt();

        System.out.println("Entre com o número 6:");
        val6 = sc.nextInt();

        System.out.println("Os valores lidos são:");
        System.out.printf("%d %d %d %d %d %d ", val1, val2, val3, val4, val5, val6);

    }

    public static void ex02(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        System.out.println("<< Listando um vetor >>");

        for (int i = 0; i < 6; i++){
            System.out.printf("Entre com o número %d:\n",i+1);
            vet[i] = sc.nextInt();
        }

        System.out.println("Os valores lidos são:");
        for (int i = 0; i < 6; i++){
            System.out.printf("%d ",vet[i]);
        }
    }

    public static void ex03() {
        Scanner dados = new Scanner(System.in);
        int[] v = new int[6];
        System.out.println("<< Listando um valor em ordem inversa >>");

        for (int i = 0; i < v.length; i++) {
            System.out.println("Entre com o "+ (i+1) +"o numero: ");
            v[i] = dados.nextInt();
        }

        System.out.println("A ordem inversa dos números é: ");
        for (int i = 5; i >= 0; i--) {
            System.out.println(""+v[i]);
        }
    }

    public static void ex04() {
        Scanner dados = new Scanner(System.in);
        int[] v = new int[6];
        System.out.println("<< Listando um vetor de números pares >>");

        for (int i = 0; i < v.length; i++) {
            boolean temp = false;
            while (!temp) {
                System.out.println("Entre com o "+ (i+1) +"o numero: ");
                int n = dados.nextInt();
                if (n%2==0) {
                    v[i] = n;
                    temp = true;
                } else {
                    System.out.println("Erro: Valor inválido");
                }
            }
        }

        System.out.println("Os valores lidos são:");
        for (int i = 0; i < v.length; i++){
            System.out.printf("%d ",v[i]);
        }
    }

    public static void ex05() {
        Scanner dados = new Scanner(System.in);
        int[] v = new int[5];

        System.out.println("<< 5 valores >>");
        for (int i = 0; i < 5; i++) {
            System.out.println("Entre com o "+ (i+1) +"o numero: ");
            v[i] = dados.nextInt();
        }

        float soma=0;
        System.out.println("Os números digitados são: ");
        for (int i = 0; i < v.length; i++){
            System.out.print(" "+ v[i]);
            soma = soma + v[i];
        }

        int maior = v[0], auxMaior;
        for (int i = 1; i < 5; i++) {
            auxMaior = v[i];
            if (maior < auxMaior){
                maior = auxMaior;
            }
        }
        System.out.println("\nO maior valor é: "+maior);

        int menor = v[0], auxMenor;
        for (int i = 1; i < 5; i++) {
            auxMenor = v[i];
            if (menor > auxMenor){
                menor = auxMenor;
            }
        }
        System.out.println("O menor valor é: "+menor);
        float media = soma/5;
        System.out.println("A média é: " +media);

    }

    public static void ex06() {
        Scanner dados = new Scanner(System.in);
        int[] v = new int[5];

        System.out.println("<< 5 valores >>");
        for (int i = 0; i < 5; i++) {
            System.out.printf("Entre com o "+ (i+1) +"o numero: ");
            v[i] = dados.nextInt();
        }

        float soma=0;
        System.out.print("Os números digitados são:");
        for (int i = 0; i < v.length; i++){
            System.out.print(" "+v[i]);
            soma = soma + v[i];
        }

        int maior = v[0], auxMaior, posMaior=0;
        for (int i = 1; i < v.length; i++) {
            auxMaior = v[i];
            if (maior < auxMaior){
                maior = auxMaior;
                posMaior = i;
            }
        }
        System.out.println("\nO maior valor é o "+maior+", localizado na posicao "+(posMaior+1)+" do vetor");

        int menor = v[0], auxMenor, posMenor=0;
        for (int i = 1; i < v.length; i++) {
            auxMenor = v[i];
            if (menor > auxMenor){
                menor = auxMenor;
                posMenor = i;
            }
        }
        System.out.println("O menor valor é o "+menor+", localizado na posicao "+(posMenor+1)+" do vetor");

        float media = soma/5;
        System.out.println("A média é: "+media);

    }

    public static void ex07() {
        Scanner dados = new Scanner(System.in);
        int[] v = new int[5];

        System.out.println("<< Normalizando as notas >>");
        for (int i = 0; i < v.length; i++) {
            System.out.print("Entre com a nota do "+(i+1)+"o aluno: ");
            v[i] = dados.nextInt();
        }

        int maior = v[0], auxMaior;
        for (int i = 1; i < 5; i++) {
            auxMaior = v[i];
            if (maior < auxMaior){
                maior = auxMaior;
            }
        }

        for (int i = 0; i < v.length; i++) {
            v[i] = v[i]*2;
            if ((v[i]/2) == maior){
                v[i] = 100;
            }
        }

        System.out.println("\nNotas normalizadas");
        for (int i = 0; i < v.length; i++){
            System.out.println("A nota do "+(i+1)+"o aluno é: "+v[i]);
        }

    }

    public static void ex08() {
        Scanner dados = new Scanner(System.in);
        int[] v = new int[5];
        float somatorio=0;

        System.out.println("<< Média e desvio-padrão >>");
        for (int i = 0; i < v.length; i++) {
            System.out.print("Digite o "+(i+1)+"o valor: ");
            v[i] = dados.nextInt();
            somatorio = somatorio + v[i];
        }

        float media = somatorio/5;

        double auxSomatorio =0;
        for (int i = 0; i < v.length; i++) {
            auxSomatorio = auxSomatorio + (double) ((v[i] - media) * (v[i] - media));
        }

        double auxDesvio = (double) 1/4;
        double desvio = Math.sqrt( auxDesvio * auxSomatorio);

        System.out.println("\nA média é "+media+" e o desvio padrao é "+desvio);

    }

    public static void ex09(){
        Scanner dados = new Scanner(System.in);
        int n;

        do {
            System.out.println("\n<< Média de n alunos. Máximo de 100 alunos >>");
            System.out.print("Entre com o numero de alunos: ");
            n = dados.nextInt();

            if (n>100)
                System.out.println("Erro! O número máximo de alunos permitido é 100.");

        } while (n>100 || n<1);

        float[] alunos = new float[n];

        for (int i = 0; i < alunos.length; i++) {
            System.out.print("Digite a nota do "+(i+1)+"o aluno: ");
            alunos[i] = dados.nextFloat();
        }

        float soma=0;
        System.out.println("\nRelatório de Notas");
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("\nA nota do "+(i+1)+"o aluno é "+alunos[i]);
            soma += alunos[i];
        }
        float media= soma/n;
        System.out.println("\nA média da turma é:"+media);
    }

    public static void ex10(){
        Scanner dados = new Scanner(System.in);

        int[] A = new int[3];
        int[] B = new int[3];
        int[] C = new int[3];

        System.out.println("\n<< Subtração de vetores >>");

        for (int i = 0; i < A.length; i++) {
            System.out.print("Digite o "+(i+1)+"o valor de A: ");
            A[i] = dados.nextInt();
        }
        System.out.println();
        for (int i = 0; i < B.length; i++) {
            System.out.print("Digite o "+(i+1)+"o valor de B: ");
            B[i] = dados.nextInt();
        }
        System.out.println();
        System.out.print("O vetor C que é C=A-B é (");
        for (int i = 0; i < C.length; i++) {
            C[i] = A[i] - B[i];
            System.out.print(C[i]+",");
        }
        System.out.print(")");
    }

    public static void ex11(){
        Scanner dados = new Scanner(System.in);

        int[] v = new int[5];
        int[] v1 = new int[5];
        int[] v2 = new int[5];

        System.out.println("\n<<Pares e Ímpares>>");
        int auxPar=0, auxImpar =0;
        for (int i = 0; i < v.length; i++) {
            System.out.print("Digite o "+(i+1)+"o valor: ");
            v[i] = dados.nextInt();

            if (v[i]%2==0){
                v2[auxPar] = v[i];
                auxPar++;
            } else {
                v1[auxImpar] = v[i];
                auxImpar++;
            }
        }

        System.out.print("\nÍmpares: ");
        for (int i = 0; i < auxImpar; i++) {
            System.out.print(" "+v1[i]);
        }

        System.out.print("\nPares: ");
        for (int i = 0; i < auxPar; i++) {
            System.out.print(" "+v2[i]);
        }
    }

    public static void ex12(){
        Scanner dados = new Scanner(System.in);

        int bolAzul =0, bolAma =0, bolVerde =0, bolVerm =0;

        System.out.println("\n<< Probabilidades >>\n");
        System.out.println("Digite a quantidade de bolinhas");

        System.out.printf("Verde: ");
        bolVerde = dados.nextInt();

        System.out.printf("Azul: ");
        bolAzul = dados.nextInt();

        System.out.printf("Amarela: ");
        bolAma = dados.nextInt();

        System.out.printf("Vermelha: ");
        bolVerm = dados.nextInt();

        int total=0;
        total = bolAzul + bolAma + bolVerde + bolVerm;

        float pAzul =0, pAma =0, pVerde =0, pVerm =0;
        pAzul = ((float) bolAzul / (float)total) * 100;
        pAma = ((float) bolAma / (float)total) * 100;
        pVerde = ((float) bolVerde / (float)total) * 100;
        pVerm = ((float) bolVerm / (float)total) * 100;

        System.out.println("\nProbabilidades de cada bolinha ser selecionada");
        System.out.println("Verde: "+pVerde);
        System.out.println("Azul: "+pAzul);
        System.out.println("Amarela: "+pAma);
        System.out.println("Vermelha: "+pVerm);
    }

    public static void ex13(){
        Scanner dados = new Scanner(System.in);
        int[] v = new int[5];
        System.out.println("\n<< Zerando negativos >>");

        for (int i = 0; i < v.length; i++) {
            System.out.print("Entre com o "+(i+1)+"o numero: ");
            v[i] = dados.nextInt();

            if (v[i]<0)
                v[i] = 0;
        }

        System.out.print("\nZerando os negativos, obtém-se: ");
        for (int i = 0; i < v.length; i++) {
            System.out.print(" "+v[i]);
        }
    }

    public static void ex14(){
        Scanner dados = new Scanner(System.in);

        class aluno {
            int matricula;
            char classeSocial;
            float CRA;
        }

        System.out.println("\n<< Universidade X >>");
        int n;
        do {
            System.out.print("Quantos alunos serão cadastrados: ");
            n = dados.nextInt();

            if (n >10000)
                System.out.println("ERRO: Número máximo de alunos que o sistema pode cadastrar é 10000\n");

        } while (n >10000 || n <1);

        aluno[] alunos = new aluno[n];

        for (int i = 0; i < alunos.length; i++) {
            alunos[i] = new aluno();

            System.out.print("\nEntre com o número do aluno: ");
            alunos[i].matricula = dados.nextInt();

            System.out.print("Entre com a classe social do aluno: ");
            alunos[i].classeSocial = dados.next().charAt(0);

            System.out.print("Entre com o CRA do aluno: ");
            alunos[i].CRA = dados.nextFloat();
        }

        System.out.println("\n==== Alunos Cadastrados ====");
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Número: "+alunos[i].matricula+", Classe Social: "+alunos[i].classeSocial+", CRA: "+alunos[i].CRA);
        }

    }
    public static void ex15(){
        Scanner dados = new Scanner(System.in);
        System.out.println("\n<< Valores iguais >>");

        int[] v = new int[8];
        for (int i = 0; i < v.length; i++) {
            System.out.print("Entre com o "+(i+1)+"o número: ");
            v[i] = dados.nextInt();
        }

        int[] vet = new int[8];
        int aux = 0;

        for (int i = 0; i < v.length; i++) {
            for (int j = i+1; j < vet.length; j++) {
                if (v[i]== v[j]){
                    boolean numRepetido = false;
                    for (int k = 0; k < aux; k++) {
                        if (v[i]== vet[k]){
                            numRepetido = true;
                        }
                    }
                    if (!numRepetido){
                        vet[aux]= v[i];
                        aux++;
                    }
                }
            }
        }
        if (aux>0){
            System.out.print("Valores repetidos: ");
            for (int i = 0; i < aux; i++) {
                System.out.print(" "+vet[i]);
            }
        } else
            System.out.println("Não existem valores repetidos.");
    }

    public static void ex16(){
        Scanner dados = new Scanner(System.in);
        System.out.println("\n<< Valores iguais >>");

        int[] v = new int[8];
        for (int i = 0; i < v.length; i++) {
            System.out.print("Entre com o "+(i+1)+"o número: ");
            v[i] = dados.nextInt();
        }

        int[] vet = new int[8];
        int aux = 0;

        for (int i = 0; i < v.length; i++) {
            for (int j = i+1; j < vet.length; j++) {
                if (v[i]== v[j]){
                    boolean numRepetido = false;
                    for (int k = 0; k < aux; k++) {
                        if (v[i]== vet[k]){
                            numRepetido = true;
                        }
                    }
                    if (!numRepetido){
                        vet[aux]= v[i];
                        aux++;
                    }
                }
            }
        }
        if (aux>0){
            System.out.println("\nValores repetidos:");
            for (int i = 0; i < aux; i++) {
                int contador = 0;
                for (int j = 0; j < 8; j++) {
                    if (v[j]== vet[i])
                        contador++;
                }
                System.out.print(vet[i]+" aparece "+contador+" vezes\n");
            }
        } else
            System.out.println("Não existem valores repetidos.");
    }

    public static void main(String[] args) {
        // ex01();
        // ex02();
        // ex03();
        // ex04();
        // ex05();
        // ex06();
        // ex07();
        // ex08();
        // ex09();
        // ex10();
        // ex11();
        // ex12();
        // ex13();
        // ex14();
        // ex15();
        // ex16();
    }


}
