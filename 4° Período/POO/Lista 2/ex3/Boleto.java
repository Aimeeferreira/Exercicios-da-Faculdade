public class boleto {
    private String cliente;
    private String venc;
    private double valor;
    private double desc;
    private boolean boletoPg;

    public Boleto(String cliente, String venc, double valor, double desc){
        this.cliente = cliente;
        this.venc = venc;
        this.valor = valor;
        this.desc = desc;
        this.boletoPg = false;
    }

    public double calcularValLiquido(){
        if(this.valor >= this.desc){
            return this.valor-this.desc;
        } else{
            return 0;
        }
    }

    public void pagarBoleto(){
        this.boletoPg = true; 
    }

    public String verificarPg(){
        if(this.boletoPg){
            return "\nBoleto pago.";
        } else{
            return "\nPagameto não debitado. Boleto pendente.";
        }
    }

    public String imprimir(){
        return "\nNome: " + this.cliente +
                "\nVencimento do boleto: " + this.venc +
                "\nValor do boleto: " + this.valor +
                "\nValor do desconto: " + this.desc +
                "\nValor líquido: " + calcularValLiquido() +
                verificarPg();
                
    }
}
