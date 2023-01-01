import java.util.Scanner;

public class CalculadoraOperadores {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float numerador = teclado.nextFloat();
        float denominador = teclado.nextFloat();
        float div = numerador / denominador;
        float res = numerador % denominador;
    
        System.out.printf("Divisão: %f", div);
    }
}