import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double fahrenheit, celsius;



         System.out.println("\033[h\033[2J");
         System.out.println("----conversao de temperatura----");
         System.out.println("informe a temperatura em fahrenheit: ");
         fahrenheit = leitor.nextDouble();

         celsius = (fahrenheit - 32) /1.8;

         System.out.println("Graus celsius : " + celsius + "º graus\n\n");

         leitor.close();
         




    }
}
