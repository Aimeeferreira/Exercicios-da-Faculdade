import java.util.Scanner;

public class TestaPessoa {
    public static void main(String args[]) {
    
        Scanner input = new Scanner(System.in);
        Pessoa P1 = new Pessoa();
        Pessoa P2 = new Pessoa();

        System.out.println("Digite aqui o nome da 1° pessoa: ");
        System.out.print("1° pessoa: ");
        P1.setNome(input.nextLine());

        System.out.println("Digite aqui o endereco da 1° pessoa: ");
        System.out.print("1° pessoa: ");
        P1.setEndereco(input.nextLine());

        System.out.println("Digite o telefone da 1° pessoa: ");
        System.out.print("1° pessoa: ");
        P1.setTelefone(input.nextLine());



        System.out.println("Digite aqui o nome da 2° pessoa: ");
        System.out.print("2° pessoa: ");
        P2.setNome(input.nextLine());
        
        System.out.println("Digite o endereco da 2° pessoa: ");
        System.out.print("2° pessoa: ");
        P2.setEndereco(input.nextLine());

        System.out.println("Digite o telefone da 2° pessoa: ");
        System.out.print("2° pessoa: ");
        P2.setTelefone(input.nextLine());

        input.close();
        System.out.println(P1.imprimir());
        System.out.println(P2.imprimir());  
    }
}
