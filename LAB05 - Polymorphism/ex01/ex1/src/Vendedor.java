public class Vendedor extends Funcionario{
    private int vendas;
    private float salarioFixo;
    private float comissao;
    public Vendedor(String nome, String dataNascimento, float salarioFixo, float comissao, int vendas){
        super(nome,dataNascimento, (salarioFixo + (comissao * vendas) ));
        this.comissao = comissao;
        this.vendas = vendas;
        this.salarioFixo = salarioFixo;
    }

    @Override
    public void calculaSalario(){
        setSalario(getSalarioFixo()+(getComissao()*getVendas()));
    }

    public int getVendas() {
        return vendas;
    }
    public float getComissao() {
        return comissao;
    }
    public float getSalarioFixo() {
        return salarioFixo;
    }

    public void setVendas(int vendas) {
        this.vendas = vendas;
    }
    public void setComissao(float comissao) {
        this.comissao = comissao;
    }
    public void  setSalarioFixo(float salarioFixo) {
        this.salarioFixo = salarioFixo;
    }
}
