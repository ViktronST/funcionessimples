import java.util.Scanner;

public class Funciones {
    public static int pideDatoNumerico(String texto) {
        System.out.println(texto);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static String pideDatoCadena(String texto) {
        System.out.println(texto);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    
}
