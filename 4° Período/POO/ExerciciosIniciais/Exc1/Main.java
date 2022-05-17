package ExerciciosIniciais.Exc1;
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in); 
        Trabalhador TrabalhadorA = new Trabalhador();
        Trabalhador TrabalhadorB = new Trabalhador();
        Trabalhador TrabalhadorC = new Trabalhador();

        System.out.println("Nome: ");
        TrabalhadorA.setNome(input.nextLine());
        System.out.println("Matricula: ");
        TrabalhadorA.setMatricula(input.nextInt());
        System.out.println("Salario: ");
        TrabalhadorA.setSalario(input.nextDouble());
        if(TrabalhadorA.getSalario() < 1100.00){
            TrabalhadorA.setSalario(1100.00);
        }

        System.out.println("\nNome: ");
        TrabalhadorB.setNome(input.next());
        System.out.println("Matricula: ");
        TrabalhadorB.setMatricula(input.nextInt());
        System.out.println("Salario: ");
        TrabalhadorB.setSalario(input.nextDouble());
        if(TrabalhadorB.getSalario() < 1100.00){
            TrabalhadorB.setSalario(1100.00);
        }

        System.out.println("\nNome: ");
        TrabalhadorC.setNome(input.next());
        System.out.println("Matricula: ");
        TrabalhadorC.setMatricula(input.nextInt());
        System.out.println("Salario: ");
        TrabalhadorC.setSalario(input.nextDouble());
        if(TrabalhadorC.getSalario() < 1100.00){
            TrabalhadorC.setSalario(1100.00);
        }

        System.out.println("Nome: "+TrabalhadorA.getNome() +"  Matricula: " + TrabalhadorA.getMatricula() +"  Salario: " + TrabalhadorA.getSalario());
        System.out.println("Nome: "+TrabalhadorB.getNome() +"  Matricula: " + TrabalhadorB.getMatricula() +"  Salario: " + TrabalhadorB.getSalario());
        System.out.println("Nome: "+TrabalhadorC.getNome() +"  Matricula: " + TrabalhadorC.getMatricula() +"  Salario: " + TrabalhadorC.getSalario());

        input.close();
    }
}
