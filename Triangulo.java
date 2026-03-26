

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        double base, altura, area;
        



        /* 
        System.out.println("\033[H\033[2J"); apaga a tela


        System.out.println("palmeiras nao da conta");
        System.out.println("novo time");
        System.out.println("SP");
        
        // O X É UMA FUNÇÃO DO System.out.println//
        */  

    
                System.out.println("\ncalculo de area de um triangulo:");

                System.out.print("\ndigite a altura: ");
                altura = leitor.nextDouble(); //leia (altura)


                System.out.print("\ndigite a base: ");
                base = leitor.nextDouble(); //leia (base)

                area = base * altura /2; 

                System.out.println("\033[H\033[2J");

                System.out.println("\n---------------------");
                System.out.print("\n O VALOR DA AREA É : " + area); 
                System.out.println("\n---------------------");
                System.out.println("\n se o corinthians não ganhar ole ole olá o pau vai quebrar");
                System.out.println("-----fimm-----");
                

                leitor.close();
                System.exit(0);

                





        

    }
    
}
