import java.util.Scanner;

public class ExemploVariavelChar {
    public static void main(String[] args) {
        /* Exemplo de uso da variável tipo char */
        Scanner teclado = new Scanner(System.in);
        /*
         * passo 0 como parâmetro no charAt pois quero pegar a primeira letra digitada
         * no terminal de comandos
         */
        System.out.print("Informe um letra:");
        char letra = teclado.next().charAt(0);
        /*Convertendo a letra que o usuário informou para maiúscula */
        letra = Character.toUpperCase(letra);

        if (letra == 'A') {
            System.out.println("A letra digitada é A");
        }

        /*Exemplo 2 */
        char letra2 = teclado.next().charAt(0);
        /*Convertendo a letra que o usuário informou para minuscula */
        letra = Character.toLowerCase(letra2);

        if (letra2 == 'a') {
            System.out.println("A letra digitada é A");
        }

        teclado.close();
    }
}
