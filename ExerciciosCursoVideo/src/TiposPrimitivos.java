import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    
        String nome = "Maria";
        float nota = 8.5f;
        float nota1 = (float) 8.5;
        
        //Recebendo do teclado
        String nome2 = teclado.nextLine();
        float nota3 = teclado.nextFloat();
        
        System.out.println("A nota é: " + nota);
        System.out.printf("Oi %s, sua nota é: %.2f", nome, nota);
    }    
}
/*
 * Para definir a nota como float, podemos utilizar o float ou f
 * %.2f --> Duas casas ou %f
 * 
 */


 
