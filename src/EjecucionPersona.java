import java.util.Scanner;

public class EjecucionPersona {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca número de NIF: ");
        String entrada = scan.nextLine();
        int numDni = Integer.parseInt(entrada);
        String letra = HerramientasPersonas.getLetraNIF(numDni);
        System.out.println("Su letra de NIF es " + letra);
    }
}
