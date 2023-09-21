import java.util.Scanner;

public class Main {
    static float alterapreco(float preco , float porcentagem) {
        float temp;

        if (porcentagem>-100){
            temp = 1 + porcentagem/100;
            preco = preco * temp;
            return preco;
        } else {
            return -1;
        }
    }
    public static void main(String[] args) {

        String[] nome = new String[4];
        float[] preco = new float[4];
        int[] estoque = new int[4];


        for (int i = 0; i < 4; i++) {
            System.out.printf("Produto %d.\n",(i)+1);
            Scanner scanner = new Scanner(System.in);

            System.out.println("Nome do produto: ");
            nome[i] = scanner.nextLine();

            System.out.println("Preco do produto: ");
            preco[i] = scanner.nextFloat();

            System.out.println("Quantidade do produto: ");
            estoque[i] = scanner.nextInt();
        }


        System.out.println("\nAumentando o preco em 10% do produto 1 e 3");
        if (alterapreco(preco[0],-110)==-1)
            System.out.println("Erro: preco do produto 1 nao alterado, porcentagem invalida");
        else
            preco[0] = alterapreco(preco[0],-110);

        if (alterapreco(preco[2],10)==-1)
            System.out.println("Erro: preco do produto 3 nao alterado, porcentagem invalida");
        else
            preco[2] = alterapreco(preco[2],10);


        System.out.println("\nReduzindo o preco em 5% do produto 2");
        if (alterapreco(preco[1],-5)==-1) {
            System.out.println("Erro: preco do produto 2 nao alterado, porcentagem invalida");
        } else{
            preco[1] = alterapreco(preco[1],-5);
            System.out.println("Porcentagem alterada com sucesso");
        }


        System.out.println("\nAlterando o preco do produto 3");
        if (alterapreco(preco[3],-110)==-1)
            System.out.println("Erro: preco do produto 3 nao alterado, porcentagem invalida");


        System.out.print("\n--------\nProdutos cadastrados: ");
        for (int i = 0; i < 4; i++) {
            System.out.printf("\n\nProduto: %s\nPreco: %.2f\nEstoque: %d",nome[i],preco[i],estoque[i]);
        }

    }
}