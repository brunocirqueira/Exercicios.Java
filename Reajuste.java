
import java.util.Scanner;
import javax.xml.transform.Source;

public class Reajuste {
    public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    //variaveis
    double novoValor, valorAtual, taxa;
    System.out.println("calculo de reajuste");

    System.out.print("insira o valor atual: ");
    valorAtual = leitor.nextDouble();

    System.out.print("insira a taxa: ");
    taxa = leitor.nextDouble();

    novoValor = valorAtual * (1 + taxa/100); 

    System.out.println("\033[h\033[2J");
    System.out.println("-----------------------");
    System.out.println("valor atual:" + valorAtual);
    System.out.println("novo valor: " + novoValor);
    System.out.println("-----------------------");


    leitor.close(); 



    }


}