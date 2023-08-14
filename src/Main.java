import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //System.out.print("Digite um número: ");
        //int x = sc.nextInt();

        //if (x > 10) {
        //    System.out.println(x + " é maior que 10");
        //} else if (x == 10) {
        //    System.out.println(x + " é igual a 10");
        //} else {
        //    System.out.println(x + " é menor que 10");
        //}

        System.out.print("Digite o número de minutos utilizados: ");
        int minutos = sc.nextInt();

        double fatura = 50.0;
        if (minutos > 100) {
            fatura += (minutos - 100) * 2;
            System.out.printf("Sua fatura tem valor = R$ %.2f%n", fatura);
        }
        else {
            System.out.printf("Sua fatura tem valor = R$ %.2f%n", fatura);
        }

        sc.close();

    }

}
