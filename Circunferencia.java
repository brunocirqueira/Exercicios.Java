import java.util.Scanner;

public class Circunferencia {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);


         //CONSTANTES - MAIUSCULAS


        // variaveis - minusculas
        double area, raio;

        // ENTRADA DE USURAIO 
         System.out.println("\033[H\033[2J");
         System.out.println("--------------------------");
         System.err.println("calculo da circunferencia: ");
         System.out.println("--------------------------");

                  System.err.println("digite o raio =>");
                  raio = leitor.nextDouble();

                   area = Math.PI *  ( raio * raio);
                   
         System.err.println("Area: " + area);

         leitor.close();
         System.exit(0); 







    }
}
