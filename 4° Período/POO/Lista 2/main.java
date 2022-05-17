
import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        Trabalhador trabalhador = new Trabalhador();

        System.out.println("Trabalhadores: ");

        for(int i=0; i<3; i++){
            System.out.println("Matrícula: ");
            trabalhador.setMatricula(input.next());
            clearBuffer(input);
        
            System.out.println("Nome: ");
            trabalhador.setNome(input.next());

            System.out.println("Salário: ");
            trabalhador.setSalario(input.nextDouble());
        }
    }

    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }

}

,