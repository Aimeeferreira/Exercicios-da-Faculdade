public class Trabalhador{
  private String matricula;
  private String nome;
  private double salario;

    private final Double salarioMinimo = 1100d;

    public void setMatricula(String matricula){
      this.matricula = matricula;
    }
    public String getMatricula(){
        return this.matricula;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome()
    {
        return this.nome;
    }

    public void setSalario(Double salario) {
        if(salario >= salarioMinimo) {
          this.salario = salario;
        } else {
          System.out.println("Trabalhadores não recebem menos que um salário mínimo.");
        }
      }
    public double getSalario(){
      return this.salario;
    }

    public Trabalhador(String matricula, String nome, Double salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
      }

    public Trabalhador() {
    }
}
