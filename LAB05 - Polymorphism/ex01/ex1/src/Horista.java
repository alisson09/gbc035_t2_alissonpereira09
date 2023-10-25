public class Horista extends Funcionario{
    private float valorHora;
    private float horaTrab;
    public Horista(String nome, String dataNascimento, float valorHora, float horaTrab){
        super(nome,dataNascimento,(horaTrab * valorHora) );
        this.horaTrab = horaTrab;
        this.valorHora = valorHora;
    }

    @Override
    public void calculaSalario(){
        setSalario(getHoraTrab() * getValor());
    }

    public float getHoraTrab() {
        return horaTrab;
    }
    public float getValor() {
        return valorHora;
    }

    public void setValorHora(float valorHora){
        this.valorHora = valorHora;
    }
    public void setHoraTrab(float horaTrab){
        this.horaTrab = horaTrab;
    }
}
