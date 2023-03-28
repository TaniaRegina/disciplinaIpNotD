import java.util.Scanner;

public class Uni4Exe03 {
   public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);

      System.out.println("Entre com o número1:");
      int numero1 = teclado.nextInt();

      System.out.println("Entre com o número2:");
      int numero2 = teclado.nextInt();

      int numeroMaior;
      /*
       * comparando se conteúdo da variável numero1 é igual ao conteúdo da variável
       * numero2
       */
      if (numero1 == numero2) {
         System.out.println("Os números são iguais.");
      } else {
        /*
         * comparando se conteúdo da variável numero1 é maior que conteúdo da variável
         * numero2
         */
         if (numero1 > numero2) {
            numeroMaior = numero1;
         } else {
            numeroMaior = numero2;
         }

         System.out.println(numeroMaior + " é o maior");

      }

      teclado.close();

   }
}
