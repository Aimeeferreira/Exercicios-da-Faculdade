public class Time {
    private String serie;
    private String nome;
    private int nJogadores;

    public Time(String nome, String serie){
        setNome(nome);
        setSerie(serie);
    }

    public String getNome(){
        return nome;
    }
    private void setNome(String nome){
        this.nome = nome;
    }


    public String getSerie(){
        return serie;
    }
    private void setSerie(String serie){
        char s = serie.charAt(0);
        s = Character.toUpperCase(s);
        
        switch(s){
            case 'A':
                this.serie = "A";
                break;

            case 'B':
                this.serie = "B";
                break;

            case 'C':
                this.serie = "C";
                break;

            case 'D':
                this.serie = "D";
                break;

            case 'E':
                this.serie = "E";
                break;

            default:
                this.serie = "Opção inválida.";
                break;
        } 
    }

    public int getNJogadores() {
        return nJogadores;
    }

    public void setNJogadores(int nJogadores) {
        if(nJogadores>0 && nJogadores<=22){
            this.nJogadores = nJogadores;
        } else{
            this.nJogadores = 22; 
        }
    }
    
    public String toString(){
        String mensagem = String.format("Nome: %s\n\nSerie: %s\n\nJogadores: %d", this.nome, this.serie, this.nJogadores);
        return mensagem;
    }
}
