import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Nome da mochila: ");
        String nome = input.nextLine();
        System.out.println("Quantidade maxima de itens: ");
        int quantMax = input.nextInt();
        System.out.println("Peso maximo da mochila: ");
        double pesoMax  = input.nextDouble();

        Mochila mochila = new Mochila(nome, quantMax, pesoMax);
        System.out.println(mochila);

        int opcao=0;
        do{
            System.out.println("Selecione uma opção:");
            System.out.println("0-Sair");
            System.out.println("1-Inserir");
            System.out.println("2-Imprimir");

            opcao=input.nextInt();

            switch(opcao){
                case 0:
                    System.out.println("Saindo...");
                    break;

                case 1:
                    System.out.println("Peso do item: ");
                    mochila.inserir(input.nextDouble());
                    break;

                case 2:
                    System.out.println(mochila.imprimir());
                    break;

                default:
                    System.out.println("Opção Inválida.");
            }
        }while(opcao!=0);
        input.close();
    }
}
