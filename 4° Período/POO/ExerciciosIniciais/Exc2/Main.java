package ExerciciosIniciais.Exc2;
import java.util.Scanner;

public class Main
{
    public static void main(String args[]){

        Eleitor eleitor = new Eleitor();
        Scanner input = new Scanner(System.in);
        
        System.out.println("Nome: ");
        eleitor.setNome(input.nextLine());

        System.out.println("Sexo: ");
        eleitor.setSexo(input.nextLine());

        System.out.println("Idade: ");
        eleitor.setIdade(input.nextInt());

        System.out.println("Titulo de eleitor: ");
        eleitor.setTitulo(input.nextInt());

        System.out.println(eleitor.verificacao());
        input.close();
    }
}
