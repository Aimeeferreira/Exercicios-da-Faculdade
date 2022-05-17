public class Eleitor {
    private String sexo;
    private String nome;
    private int idade;
    private int titulo;

    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    public String getSexo(){
        return this.sexo;
    }

    public int getIdade(){
        return this.idade;
    }
    
    public void setIdade(int idade){
        if(idade>0){
            this.idade = idade;
        }     
    }

    public int getTitulo(){
        return this.titulo;
    }

    public void setTitulo(int titulo){
        this.titulo = titulo;
    }

    public String printEleitor(){
        String printEleitor = String.format("Nome: ", getNome(), "Sexo: ", getSexo(), "Idade: ", getIdade(), "Título: ", getTitulo());
        
        
        return "\nDados do Eleitor:\nNome: " + getNome() +
                "\nSexo: " + getSexo() +
                "\nIdade: " + getIdade() +
                "\nTitulo: \n" + getTitulo();
    }

    // votação para 16/18/65 anos
    public String checarVotacao(){
        if(getIdade()<=15){
            return "Você não pode votar.";
        } else if(getIdade()<=17 || getIdade()>=65){
            return "Voto facultativo.";
        } else{
            return "Voto obrigatório.";
        }
    }
}
