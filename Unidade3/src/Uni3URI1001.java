import java.util.Scanner;

public class Uni3URI1001{
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
        //Entradas       
        int a = teclado.nextInt();      
        int b = teclado.nextInt();
      //Processo
        int x = a + b;
      //Saídas
      System.out.println("X = "+x);
      teclado.close();
    }
}