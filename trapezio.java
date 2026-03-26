import java.util.Scanner;

public class trapezio {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        //constantes 


        // variaveis 

        double baseMaior, baseMenor, altura , area; 

        // entrada de dados : usuario 
        
        System.out.println("\033[H\033[2J");
        System.out.println("----------------------");
        System.out.println("calculo de um trapezio");
        System.out.println("----------------------");

                System.out.println("digite base maior : ");
                baseMaior = leitor.nextDouble(); 

                System.out.println("digite base menor : ");
                baseMenor = leitor.nextDouble(); 

                System.out.println("digite altura : ");
                altura = leitor.nextDouble(); 

                area = (baseMaior + baseMenor) * altura/2; 
                          System.out.println("O calculo do trapezio é: " + area);


leitor.close(); 




        

    }
}
