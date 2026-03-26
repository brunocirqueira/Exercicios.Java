
import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in); 
        //constantes

        final double VALOR_HORA = 25, INSS = 0.08;
        // variaveis  
        double salarioBruto, salarioLiquido, desconto; 
        int qtdHora;

        System.out.println("\\033[h\\033[2J");
        System.out.println("--------Holerith------------");
        System.out.println("digite a quantidade de horas de trabalho: ");
        qtdHora = leitor.nextInt();
        salarioBruto = qtdHora * VALOR_HORA;
        desconto = salarioBruto * INSS;
        salarioLiquido = salarioBruto - desconto;

        System.out.println("\\\\033[h\\\\033[2J");
        System.out.println("-----------Holerite------------");
        System.out.println("qtd de horas trabalhadas: " + qtdHora);
        System.out.println("\nsalário bruto : R$" + salarioBruto);
        System.out.println("Desconto.....: " + desconto);
        System.out.println("Salario liquido : R$ " + salarioLiquido);
        System.out.println("--------------------------------");

        leitor.close();
        



    }
}
