import java.util.Scanner;

public class Main {
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        String nome, vencimento = " ";
        double valorBoleto, valorDesc;

        System.out.println("Nome:");
        nome = input.nextLine();

        System.out.println("Informe o valor do boleto: ");
        valorBoleto = input.nextDouble();

        System.out.println("Informe o valor do desconto: ");
        valorDesc = input.nextDouble();

        Boleto boleto = new Boleto(nome, venc, valorBoleto, valorDesc);

        boleto.pagarBoleto();
        System.out.println(boleto.imprimir());
        input.close();
    }
}
