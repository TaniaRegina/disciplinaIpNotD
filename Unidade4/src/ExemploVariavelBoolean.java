import java.util.Scanner;

public class ExemploVariavelBoolean {
    public static void main(String[] args) {
        /* Exemplo de uso da variável tipo boolean */
        Scanner teclado = new Scanner(System.in);
        /*
         * No terminal de comandos devo digitar a palavra true ou a palavra false
         */
        System.out.print("Vai chover?: ");
        boolean vaiChover = teclado.nextBoolean();
        /*
         * Quando comparo Tipo lógico (boolean), não preciso colocar vaiChover == true,
         * pois o teste lógico do if espera um valor lógico (true ou false)
         */
        if (vaiChover) {
            System.out.println("Hoje vai chover.");
        }else{
            System.out.println("Nada de chuva hoje.");
        }


        teclado.close();
    }
}
