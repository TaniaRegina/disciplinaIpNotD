import java.util.Scanner;

public class Uni4Exe08_String {
   public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    /*Com NextLine E USO DO*/
    System.out.println("Informe a letra:");
    String letra = teclado.nextLine(); 

    if (letra.trim().equalsIgnoreCase("a") || letra.trim().equalsIgnoreCase("e") ||
        letra.trim().equalsIgnoreCase("i") || letra.trim().equalsIgnoreCase("o") ||
        letra.trim().equalsIgnoreCase("u")){
        System.out.println("É vogal");    
    }else{
        System.out.println("Não É vogal");
    }



    /*
    //COM VARIÁVEL STRING E equalsIgnoreCase
    System.out.println("Informe a letra:");
    String letra = teclado.next(); 

    if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") ||
        letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") ||
        letra.equalsIgnoreCase("u")){
        System.out.println("É vogal");    
    }else{
        System.out.println("Não É vogal");
    }
    */


    /* COM VARIAVEL STRING E EQUALS
    System.out.println("Informe a letra:");
    String letra = teclado.next(); 

    if (letra.equals("a") || letra.equals("e") ||
        letra.equals("i") || letra.equals("o") ||
        letra.equals("u")){
        System.out.println("É vogal");    

    }else{
        System.out.println("Não É vogal");
    }
    */

    /* COM VARIÁVEL CHAR
    System.out.println("Informe a letra:");
    char letra = teclado.next().charAt(0);

    letra = Character.toLowerCase(letra);

    if (letra == 'a' || letra == 'e' ||
        letra == 'i' || letra == 'o' ||
        letra == 'u'){
        System.out.println("É vogal");
    }else{
        System.out.println("NÃo é vogal");
    }

    teclado.close();
      */ 
   } 
}
