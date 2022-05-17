package ExerciciosIniciais.exc4;

public class Pessoa {
    public String nome;
    public String endereco;
    public String telefone;

    public void setNome(String nome){
        this.nome = nome;

    }

    public String getNome(){
        return this.nome;

    }

    public void setEndereco(String endereco){
        this.endereco = endereco;

    }

    public String getEndereco(){
        return this.endereco;

    }

    public void setTelefone(String telefone){
        this.telefone = telefone;

    }

    public String getTelefone(){
        return this.telefone;

    }

    public String imprimir(){
        return "\nNome: " + getNome() +
               "\nEndereco: " + getEndereco() +
               "\nTelefone: " + getTelefone();
            
    }
}
