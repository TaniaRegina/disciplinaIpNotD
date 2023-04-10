import java.util.Scanner;

public class Uni4Exe22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("1 - Ciência da Computação: ");
        System.out.println("2 - Licenciatura Computação: ");
        System.out.println("3 - Sistemas da Informação: ");

        int opcao = teclado.nextInt();

        switch (opcao) {
            case 1 :
                System.out.println("Bacharel em Ciência da Computação");
                break;
            case 2 :
                System.out.println("Licenciado em Computação");
                break;
            case 3 : 
                System.out.println("Bacharel em Sistemas de Informação");
            default:
                break;
        }

        teclado.close();
    }
}
