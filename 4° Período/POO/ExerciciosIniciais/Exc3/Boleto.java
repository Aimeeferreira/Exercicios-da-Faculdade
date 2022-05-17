package ExerciciosIniciais.Exc3;
public class Boleto{
    private String cliente;
    private String venc;
    private double valor;
    private double desc;
    private boolean boletoPago;

    public Boleto(String cliente, String venc, double valor, double desc){
        this.cliente = cliente;
        this.venc= venc;
        this.valor = valor;
        this.desc = desc;
        this.boletoPago = false;
    }

    public double calcularVL(){
        if(this.valor >= this.desc){
            return this.valor-this.desc;
        } else{
            return 0;
        }
    }

    public void pagarBoleto(){
        this.boletoPago = true;

    }

    public String verificarPag(){
        if(this.boletoPago){
            return "\n\nBoleto Pago!";
        } else{
            return "\n\nErro ao pagar o boleto.";
        }
    }

    public String imprimir(){
        return "\nNome: " + this.cliente +
                "\nVencimento do boleto: " + this.venc +
                "\nValor do boleto: " + this.valor +
                "\nValor do desconto: " + this.desc +
                "\nValor líquido: " + calcularVL() +
                verificarPag();         
    }
}
