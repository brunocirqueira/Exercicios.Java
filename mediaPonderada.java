import java.util.Scanner;

public class mediaPonderada {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        // constantes

       final  double P1 = 0.2, P2 = 0.3, P3 = 0.5; 

        //variaveis 

        double nota_1, nota_2, nota_3, media; 

        // entrada de dados : usuario
         System.out.println("\033[H\033[2J");
         System.out.println("-------------------------------");
         System.out.println("--calculo da media ponderada--");
         System.out.println("-------------------------------");

         System.out.println("\nInforme Nota 1:");
         nota_1 = leitor.nextDouble();

          System.out.println("\nInforme Nota 2:");
         nota_2 = leitor.nextDouble();

          System.out.println("\nInforme Nota 3:");
         nota_3 = leitor.nextDouble();

         media = nota_1 * P1 + nota_2 * P2 + nota_3 * P3 ;
          System.out.println("O valor da media é : " + media);



       leitor.close();



    }
}
