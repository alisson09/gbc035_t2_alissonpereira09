public class Main {
    public static void main(String[] args) {
        Classificavel[] clientes = {
                new Cliente("Alice", 25),
                new Cliente("Bob", 30),
                new Cliente("Carol", 22)
        };

        Classificavel[] produtos = {
                new Produto(101),
                new Produto(103),
                new Produto(102)
        };

        Classificavel[] servicos = {
                new Servico("Limpeza de Carpete", 50.0),
                new Servico("Pintura de Parede", 100.0),
                new Servico("Manutenção de Ar Condicionado", 80.0)
        };

        Classificador classificador = new Classificador();
        classificador.ordena(clientes);
        classificador.ordena(produtos);
        classificador.ordena(servicos);

        System.out.println("Clientes ordenados por idade:");
        for (Classificavel cliente : clientes) {
            Cliente c = (Cliente) cliente;
            System.out.println(c.getNome() + " - " + c.getIdade() + " anos");
        }

        System.out.println("\nProdutos ordenados por código:");
        for (Classificavel produto : produtos) {
            Produto p = (Produto) produto;
            System.out.println("Código: " + p.getCodigo());
        }

        System.out.println("\nServiços ordenados por preço:");
        for (Classificavel servico : servicos) {
            Servico s = (Servico) servico;
            System.out.println(s.getNome() + " - R$" + s.getPreco());
        }
    }
}


