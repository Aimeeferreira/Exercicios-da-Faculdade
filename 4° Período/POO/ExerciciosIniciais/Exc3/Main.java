import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);
        String nome, venc = " ";
        double valor, desc;

        System.out.println("Nome: ");
        nome = input.nextLine();

        System.out.println("Valor: ");
        valor = input.nextDouble();

        System.out.println("Desconto: ");
        desc = input.nextDouble();

        Boleto boleto = new Boleto(nome, venc, valor, desc);

        boleto.pagarBoleto();
        System.out.println(boleto.imprimir());
        input.close();

    }
}
