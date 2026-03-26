
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        final int TAM = 5;
        final double  Media_Aprovacao = 6.0;

        double[] notas = new double[TAM];
        char[] sexos = new char[TAM];

        double soma_nota = 0.0;


        for (int i = 0; i < TAM; i++){
            System.out.println("Aluno" + (i+1));

            System.out.println("Nota:");
            notas[i] = leitor.nextDouble();

            System.out.println("\ninforme o sexo: ");
            System.out.println("[F]-Feminino");
            System.out.println("[M]-Masculino");
            System.out.println("-->");
            sexos[i] = leitor.next().charAt(0);

            //processamento 
            soma_nota = soma_nota + notas[i];
             

        }// fim do for 

        media = soma_nota/TAM;
        


    }// fim do main

}// fim da classe 
