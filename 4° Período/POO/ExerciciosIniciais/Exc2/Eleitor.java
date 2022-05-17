public class Eleitor
{  
    private String nome;
    private String sexo;
    private int idade;
    private int titulo;

    public void setNome(String nome){
        this.nome = nome;
        
    }

    public String getNome(){
        return this.nome;

    }

    public void setSexo(String sexo){
        this.sexo = sexo;

    }

    public String getSexo(){
        return this.sexo;

    }

    public void setIdade(int idade){

        if(idade>0){
            this.idade = idade;
        }     

    }

    public int getIdade(){
        return this.idade;

    }

    public void setTitulo(int titulo){
        this.titulo = titulo;

    }

    public int getTitulo(){
        return this.titulo;

    }

    public String verificacao(){

        if(getIdade()<16){
            return "\nVocê não pode votar.";
        } else if(getIdade()<=18 || getIdade()>65){
            return "\nVoto permitido(facultativo).";
        } else{
            return "\nVoto obrigatório.";
        }

    }

    public String imprimir(){
        return "\nNome: " + getNome() +
                "\nSexo: " + getSexo() +
                "\nIdade: " + getIdade() +
                "\nTitulo: " + getTitulo();

    }

}
