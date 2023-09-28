public class Empresa {
    public static void main(String[] args) {
        Chefe[] chefes = new Chefe[2];
        Vendedor[] vendedores = new Vendedor[2];
        Operario[] operarios = new Operario[2];
        Horista[] horistas = new Horista[2];

        chefes[0] = new Chefe("João", "18 de julho de 1976", 5000.0);
        chefes[1] = new Chefe("Maria", "19 de agosto de 1960", 5500.0);

        vendedores[0] = new Vendedor("Carlos", "14 de outubro de 1988", 1500.0, 0.05, 100);
        vendedores[1] = new Vendedor("Ana", "16 de novembro de 1998", 1400.0, 0.06, 120);

        operarios[0] = new Operario("Pedro", "19 de março de 1987", 10.0, 200);
        operarios[1] = new Operario("Marta", "18 de setembro de 2001", 12.0, 180);

        horistas[0] = new Horista("José", "15 de abril de 2005", 20.0, 160);
        horistas[1] = new Horista("Luísa", "14 de maio de 1989", 18.0, 175);

        for(int i = 0; i < chefes.length; i++){
            System.out.println("Os dados do "+(i+1)+"o chefe são:");
            chefes[i].mostrarfuncionario();
            System.out.println("E o salario do "+(i+1)+"o chefe é: "+chefes[i].calcularSalario());
        }

        for(int i = 0; i < vendedores.length; i++){
            System.out.println("\nOs dados do "+(i+1)+"o vendedor são:");
            vendedores[i].mostrarfuncionario();
            System.out.println("E o salario do "+(i+1)+"o vendedor é: "+vendedores[i].calcularSalario());
        }

        for(int i = 0; i < operarios.length; i++){
            System.out.println("\nOs dados do "+(i+1)+"o operario são:");
            operarios[i].mostrarfuncionario();
            System.out.println("E o salario do "+(i+1)+"o operario é: "+operarios[i].calcularSalario());
        }

        for(int i = 0; i < horistas.length; i++){
            System.out.println("\nOs dados do "+(i+1)+"o horista são:");
            horistas[i].mostrarfuncionario();
            System.out.println("E o salario do "+(i+1)+"o horista é: "+horistas[i].calcularSalario());
        }

    }

}