import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Eleitor pessoa = new Eleitor();
        Scanner input = new Scanner(System.in);

        System.out.println("Nome:");
        pessoa.setNome(input.next());

        System.out.println("Sexo[F/M]:");
        pessoa.setSexo(input.next());

        System.out.println("Sua idade: ");
        pessoa.setIdade(input.nextInt());

        System.out.println("Informe seu título: ");
        pessoa.setTitulo(input.nextInt());

        System.out.println(pessoa.printEleitor());
        System.out.println(pessoa.checarVotacao());
        
    }
}
