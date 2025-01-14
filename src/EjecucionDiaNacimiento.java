import java.util.Scanner;

public class EjecucionDiaNacimiento {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduzca su día de nacimiento: ");
        int dia = Integer.parseInt(scan.nextLine());
        System.out.print("Introduzca su mes de nacimiento: ");
        int mes = Integer.parseInt(scan.nextLine());
        System.out.print("Introduzca su año de nacimiento: ");
        int anio = Integer.parseInt(scan.nextLine());
        String diaSemana = HerramientasPersonas.getDiaNacimiento(dia, mes, anio);
        System.out.println("Su día de nacimiento es " + diaSemana);
    }
}
