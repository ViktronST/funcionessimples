import java.util.Scanner;

public class Ejecucion {
    public static void main(String[] args) {
        //CREAMOS EL scan/teclado PARA EL USUARIO
        Scanner scan = new Scanner(System.in);
        //MENSAJE PARA PEDIR NÚMEROS
        System.out.print("Introduzca el primer número: ");
        //ALMACENAMOS EL DATO QUE HA ESCRITO
        String entrada = scan.nextLine();       
        //ALMACENAMOS EL PRIMER NÚMERO
        int num1 = Integer.parseInt(entrada);
        
        //MENSAJE PARA PEDIR NÚMEROS
        System.out.print("Introduzca el segundo número: ");
        //ALMACENAMOS EL DATO QUE HA ESCRITO
        entrada = scan.nextLine();
        //ALMACENAMOS EL SEGUNDO NÚMERO
        int num2 = Integer.parseInt(entrada);

        //CREAMOS UN MENÚ PARA LAS OPCIONES DEL USUARIO
        Calculadora.mostrarMenu();

        //PRIMERO CAPTURAMOS LO QUE HA ESCRITO EL USUARIO
        entrada = scan.nextLine();
        //LUEGO CAPTURAMOS LA OPCIÓN SELECCIONADA
        int opcion = Integer.parseInt(entrada);

        int resultado = 0;
        if(opcion == 1){
            resultado = Calculadora.sumarNumeros(num1, num2);
        }else if(opcion == 2){
            resultado = Calculadora.restarNumeros(num1, num2);
        }else if(opcion == 3){
            resultado = Calculadora.multiplicarNumeros(num1, num2);
        }else if(opcion == 4){
            resultado = Calculadora.dividirNumeros(num1, num2);
        }else{
            System.out.println("Elija lo opción correcta");
        }
        System.out.println("Resultado: " + resultado);
    }
}
