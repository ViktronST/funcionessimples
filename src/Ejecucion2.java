import java.util.Scanner;

public class Ejecucion2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce tres números: ");
        String entrada = scan.nextLine();
        int num1 = Integer.parseInt(entrada);
        entrada = scan.nextLine();
        int num2 = Integer.parseInt(entrada);
        entrada = scan.nextLine();
        int num3 = Integer.parseInt(entrada);
        entrada = scan.nextLine();

        EvaluacionNumeros.evaluacionNumeros();
        entrada = scan.nextLine();
        Integer.parseInt(entrada);

        int mayor = EvaluacionNumeros.mayorDosNumeros(num1, num2);
        int menor = EvaluacionNumeros.menorDosNumeros(num1, num2);
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
        EvaluacionNumeros.evaluarTresNumeros(num1, num2, num3);
        
    }
}

