import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe02 {
   public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
      //Entradas
        double desconto = 0.12;
        System.out.println("Informe o valor do Sapato:");
        double valorSapato = teclado.nextDouble();      
      
        //Processo
        double valorDesconto = valorSapato * desconto;
        double valorTotal = valorSapato - valorDesconto;
       //Saídas
        System.out.println("O valor do Desconto é de R$ "+ df.format(valorDesconto) );
        System.out.println("O preço do par de sapatos com desconto é de R$ "+df.format(valorTotal));

      teclado.close();
   }  
}

/**
 * Caso Teste 1
 * (E)valorSapato: 10 (S) valorDesconto: 1.2 ; valorTotal:8.8
 * 
*/