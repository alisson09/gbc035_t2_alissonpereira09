public class Operario extends Funcionario{
    private int qtdProduzida;
    private float valorProducao;
    public Operario(String nome, String dataNascimento, float valorProducao, int qtdProduzida){
        super(nome,dataNascimento,(qtdProduzida * valorProducao) );
        this.qtdProduzida = qtdProduzida;
        this.valorProducao = valorProducao;
    }

    @Override
    public void calculaSalario(){
        setSalario(getQtdProduzida() * getValor());
    }

    public int getQtdProduzida() {
        return qtdProduzida;
    }
    public float getValor() {
        return valorProducao;
    }

    public void setQtdProduzida(int qtdProduzida){
        this.qtdProduzida = qtdProduzida;
    }
    public void setValorProducao(float valorProducao){
        this.valorProducao = valorProducao;
    }

}
