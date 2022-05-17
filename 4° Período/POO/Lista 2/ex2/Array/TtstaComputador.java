
import java.util.Scanner;
public class TestaComputador {

	public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Computador[] computador = new Computador[5]; // parâmetro para a quantidade de computadores

        for (int i=0; i<3; i++) {
            System.out.println("HD em " + (i + 1) + " GB: ");
            int tamHD = entrada.nextInt();
            System.out.println("RAM em " + (i + 1) + " MB: ");
            int tamRAM = entrada.nextInt();
            System.out.println("Quantidade de processadores " + (i + 1) + "do computador: ");

            int numProcessadores = entrada.nextInt();
            entrada.nextLine();
            System.out.println("Fabricante " + (i + 1) + ": ");
            String fabricante = entrada.nextLine();

            computador[i] = new Computador(tamHD, tamRAM, numProcessadores, fabricante);
        }

        for (int i = 0; i < computador.length; i++){
            if (computador[i].getTamRAM() >Computador.MAxRAM){
                System.out.println(computador[i].toString());
            }
        }

        int opcao = 0;
        System.out.println("\nEscolha um computador para interagir: ");
        int num = entrada.nextInt() - 1;

        do {

            System.out.println("Escolha uma opção: ");
            System.out.println("|0 - Ver estado do computador  |");
            System.out.println("|1 - Ligar computador          |");
            System.out.println("|2 - Desligar computador       |");
            System.out.println("|3 - Infos computador atual    |");
            System.out.println("|4 - Escolher outro computador |");
            System.out.println("|5 - Sair do programa          |");

            opcao = entrada.nextInt();

            switch (opcao) {
                case 0:
                    System.out.println(computador[num].estado());
                    break;
                case 1:
                    computador[num].ligar();
                    break;
                case 2:
                    computador[num].desligar();
                case 3:
                    System.out.println(computador[num].toString());
                    break;
                case 4:
                    for (int i = 0; i < computador.length; i++) {
                    System.out.println("Selecione um dos computadores a seguir: " + (i + 1) + "º" + computador[i].toString());
                    }
                    System.out.println("Com qual computador quer interagir? ");
                    num = entrada.nextInt() - 1;
                    break;
                case 5:
                    System.out.println("Você saiu do programa!");
                    break;
                default:
            }
        } while (opcao != 0);
        entrada.close();
    }
}

