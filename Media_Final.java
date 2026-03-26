
import java.util.Scanner;

public class Media_Final {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //CONSTANTES
        final double P1 = 0.4 , P2 = 0.6, Media_APROVACAO = 6.0;

        //VARIAVEIS
        double nota1, nota2, media; 

        System.out.println("\033[h\033[2J");
        System.out.println("------------------Média final é -----------------:");
        System.out.println("digite a nota1: ");
        nota1 = leitor.nextDouble();

         System.out.println("digite a nota2: ");
        nota2 = leitor.nextDouble();

        media = nota1 * P1 + nota2 * P2;
        System.out.println("\nMedia Final:" + media);

        if(media >= Media_APROVACAO){ 
            System.out.println("\nParabéns , Aprovado!");
         }
            else{  
            System.out.println("Infelizmente, Reprovou!");
         }
         
         leitor.close();


    }
}
