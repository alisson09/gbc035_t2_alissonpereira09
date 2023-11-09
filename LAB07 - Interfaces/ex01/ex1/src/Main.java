public class Main {
    public static void main(String[] args) {

        Cliente[] clientes = {
                new Cliente("Alice", 25),
                new Cliente("Bob", 30),
                new Cliente("Carol", 22)
        };

        Produto[] produtos = {
                new Produto(101),
                new Produto(103),
                new Produto(102)
        };

        Servico[] servicos = {
                new Servico("Limpeza de Carpete", 50.0),
                new Servico("Pintura de Parede", 100.0),
                new Servico("Manutenção de Ar Condicionado", 80.0)
        };


        Classificador classificador = new Classificador();
        classificador.ordena(clientes);
        classificador.ordena(produtos);
        classificador.ordena(servicos);


        System.out.println("Clientes ordenados por nome:");
        for (Cliente cliente : clientes) {
            System.out.println(cliente.getNome() + " - " + cliente.getIdade() + " anos");
        }

        System.out.println("\nProdutos ordenados por código:");
        for (Produto produto : produtos) {
            System.out.println(produto.getCodigo());
        }

        System.out.println("\nServiços ordenados por preço:");
        for (Servico servico : servicos) {
            System.out.println(servico.getNome() + " - R$" + servico.getPreco());
        }
    }
}