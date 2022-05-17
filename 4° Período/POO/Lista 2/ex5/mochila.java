public class Mochila {

    private String nome;
    private int quantAtual;
    private int quantMax;
    private double pesoAtual;
    private double pesoMax;

    public Mochila(String nome, int quantMax, double pesoMax){
        this.nome = nome;
        this.quantMax = quantMax;
        this.pesoMax = pesoMax;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getQuantAtual(){
        return quantAtual;
    }
    public void setQuantAtual(int quantAtual){
        this.quantAtual = quantAtual;
    }
    public int getQuantMax(){
        return quantMax;
    }

    public double getPesoAtual(){
        return pesoAtual;
    }
    public double getPesoMax(){
        return pesoMax;
    }

    public void inserir(double peso) {
        if(pesoAtual<pesoMax && peso<=pesoMax && quantAtual<quantMax){
            if(pesoAtual+peso <= pesoMax){
                pesoAtual += peso;
                quantAtual++;
            }else{
                System.out.println("Peso e/ou Limite de itens da mochila foram atingido(s)");
            }
        }else{
            System.out.println("Peso e/ou Limite de itens da mochila foram atingido(s)");
        }
    }

    public String imprimir(){
        return "Peso Atual:" + getPesoAtual() +
               "\nPeso Max:" + getPesoMax();
    }

    public String toString() {
        return "Mochila [nome=" + nome + ", pesoMax=" + pesoMax + ", quantMax="
                + quantMax + "]";
    }
}
