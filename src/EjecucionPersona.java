import java.util.Scanner;

public class EjecucionPersona {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca número de NIF: ");
        String entrada = scan.nextLine();
        int numDni = Integer.parseInt(entrada);
        String letra = HerramientasPersonas.getLetraNIF(numDni);
        System.out.println("Su letra de NIF es " + letra);
        System.out.println("Introduzca un DNI completo: ");
        String dni = scan.nextLine();
        //boolean respuesta = HerramientasPersonas.getLetraNIF(numDni);
        System.out.println(""); 

        // String dni = "12345678Z";
        // int longitud = dni.length() - 1;
        // char ultimaLetra = dni.charAt(longitud);
        // System.out.println(ultimaLetra);
        // String soloNumeros = dni.substring(0, longitud);
        // System.out.println(soloNumeros);
    }
}
