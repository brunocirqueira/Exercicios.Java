
import java.util.Scanner;

public class conversao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double dolar, cotacao, valorConvertido; 

        System.out.println("\\033[h\\033[2J");
        System.out.println("-------conversao de dolar-------");
        System.out.println("digite o valor em dolar : ");
        dolar = leitor.nextDouble();

        System.out.println("digite o valor da cotacao em dolar");
        cotacao = leitor.nextDouble();

        valorConvertido = dolar * cotacao;

        System.out.println("US$" + dolar + "equivalem a R$ " + valorConvertido + "reais");

        leitor.close();

    

    }
}


