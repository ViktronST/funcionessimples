import java.util.Scanner;

public class purebaUtilidades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Llamadas a pideDatoNumerico
        System.out.println("Introduce una opcion:");
        int opcion = pideDatoNumerico(scanner);

        System.out.println("Introduce tu edad:");
        int edad = pideDatoNumerico(scanner);

        // Llamadas a pideDatoCadena
        System.out.println("Introduce tu nombre:");
        String nombre = pideDatoCadena(scanner);

        System.out.println("Introduce tu mes de nacimiento:");
        String mesNacimiento = pideDatoCadena(scanner);

        // Cerrar el scanner
        scanner.close();
    }

    public static int pideDatoNumerico(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Por favor, introduce un número válido:");
            scanner.next(); // Descartar la entrada no válida
        }
        return scanner.nextInt();
    }

    public static String pideDatoCadena(Scanner scanner) {
        return scanner.next();
    }
}
