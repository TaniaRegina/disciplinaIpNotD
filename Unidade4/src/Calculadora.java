import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe o número 1:");
        int numero1 = teclado.nextInt();

        System.out.println(" Informe a operação: ");
        System.out.println(" Soma             +");
        System.out.println(" Subtração        -");
        System.out.println(" Multiplicação    *");
        System.out.println(" Divisão          /");
        char operacao = teclado.next().charAt(0);
        
        System.out.println("Informe o segundo número:");
        int numero2 = teclado.nextInt();
        
        double resultado = 0;
        boolean apresetarResultado = true;

        
        switch (operacao) {
            case '+': 
                 //soma
                 resultado = numero1 + numero2;
                 
                break;
            case '-' :
                 //subtração
                 resultado = numero1 - numero2;
                break;
            case '*' :
                 //Multiplicação
                 resultado = numero1 * numero2;
                 break;
            case '/' :
                 //divisão
                 if (numero2 > 0){
                    resultado = numero1/numero2;
                 }else{
                    apresetarResultado = false;
                    System.out.println("Não é possível dividir por ZERO");
                 }
                 
                 break;
            default:
                apresetarResultado = false;
                System.out.println("Operação informada inválida.");
                break;
        }
        
        if (apresetarResultado){
            System.out.println("O resultado é: "+ resultado);
        }
        

        teclado.close();
    }    
}
