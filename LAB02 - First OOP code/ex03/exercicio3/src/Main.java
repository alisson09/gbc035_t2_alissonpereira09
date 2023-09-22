import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        System.out.println("Digite o numero de jogadores que quer cadastrar");
        int n = dados.nextInt();
        Figurinha []figurinhas = new Figurinha[n];
        dados.nextLine();

        for(int i = 0; i < figurinhas.length; i++){
            figurinhas[i] = new Figurinha();
            System.out.println("Digite o nome do "+(i+1)+"o jogador:");
            figurinhas[i].nome = dados.nextLine();
            System.out.println("Digite a data de nascimento do "+(i+1)+"o jogador:");
            figurinhas[i].dataNascimento = dados.nextLine();
            System.out.println("Digite a posição do "+(i+1)+"o jogador:");
            figurinhas[i].posicao = dados.nextLine();
            System.out.println("Digite o país do "+(i+1)+"o jogador:");
            figurinhas[i].pais = dados.nextLine();
            System.out.println("Digite a altura do "+(i+1)+"o jogador:");
            figurinhas[i].altura = dados.nextFloat();
            System.out.println("Digite o peso do "+(i+1)+"o jogador:");
            figurinhas[i].peso = dados.nextFloat();
            dados.nextLine();
        }

        for(int i = 0; i < figurinhas.length; i++){
            System.out.println("Nome do "+(i+1)+"o jogador: "+figurinhas[i].nome);
            System.out.println("Data de nascimento do "+(i+1)+"o jogador: "+figurinhas[i].dataNascimento);
            System.out.println("Posição do "+(i+1)+"o jogador: "+figurinhas[i].posicao);
            System.out.println("Pais do "+(i+1)+"o jogador: "+figurinhas[i].pais);
            System.out.println("Altura do "+(i+1)+"o jogador: "+figurinhas[i].altura);
            System.out.println("Peso do "+(i+1)+"o jogador: "+figurinhas[i].peso);
            System.out.println();
        }
    }
}