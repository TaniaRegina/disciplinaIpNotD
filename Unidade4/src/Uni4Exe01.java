import java.util.Scanner;

public class Uni4Exe01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Entrada
        System.out.print("Informe as hora trabalhadas no mês:");  
        int horasMes = teclado.nextInt();
        
        System.out.print("Informe o valor Hora:");
        double valorHora = teclado.nextDouble();

        //Processo
        double salario = valorHora * horasMes;
        //40 horas semana * 4 semanas = 160 horas mes
        //Condição: horasMes maior que 160
        
        if (horasMes > 160){
          double extra = (horasMes -160) * (valorHora/2);
          salario = salario + extra; 
        }
        //Saída
        System.out.println("Salário Total: "+ salario);
        teclado.close();
    }
}
