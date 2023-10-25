public class ContaEspecial extends ContaCorrente{
    private float limite;

    public ContaEspecial(float val, int num, int pwd, float limite) {
        super(val, num, pwd);
        this.limite = limite;
    }

    @Override
    public boolean debitaValor(float val, int pwd) {
        if ( !super.isSenha(pwd) )
            return ( false ); // senha deve ser válida
        if ( this.getEstado(pwd) != 1 )
            return ( false ); // conta deve ser ativa
        if ( val <= 0 )
            return ( false ); // val > 0
        if ( val > super.getSaldo(pwd) && val > this.limite )
            return ( false );

        if ( val < super.getSaldo(pwd) ) {
            super.debitaValor(val);
            return (true);
        }

        if ( val > super.getSaldo(pwd) && val < this.limite) {
            this.limite -= val;
            return (true);
        }

        if ( this.limite == 0 )
            this.modificaConta();
        return ( true ) ;
    }


    public ContaComum modificaConta(){
        return new ContaComum(super.getSaldo( super.getSenha() ),super.getNumConta(),super.getSenha());
    }
}
