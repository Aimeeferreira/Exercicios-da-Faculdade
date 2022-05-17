import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Time time[] = new Time[2];

        String nome, serie;
        int nJogadores, i = 0;

        for(i = 0; i<time.length; i++){
            System.out.printf("%dº Time\n\n", i+1);

            System.out.print("Nome: ");
            nome = input.nextLine();

            System.out.print("Serie(A, B, C, D ou E): ");
            serie = input.nextLine();

            time[i] = new Time(nome, serie);

            System.out.print("Digite o número de jogadores (obs - o máximo é 22): ");
            nJogadores = input.nextInt();
            input.nextLine();

            time[i].setNJogadores(nJogadores);
        }

        for(i = 0; i<time.length; i++){
            System.out.printf("\n%dº Time\n\n", i+1);
            System.out.println(time[i]);
        }
    }
}
