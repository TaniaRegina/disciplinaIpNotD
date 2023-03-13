import java.util.Scanner;

public class Uni3Exe01 {
   public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);     
    //Entradas
    System.out.println("Informe a largura: ");
    double largura = teclado.nextDouble();
    System.out.println("Informe a altura: ");
    double altura = teclado.nextDouble(); 

    //Processo
    double area = largura * altura;

    //Saídas
    System.out.println("A area é:"+area);

    teclado.close();     
   } 
}
