//Agregamos Scanner para trabajar con teclado
import java.util.Scanner;

public class InicioLunes {
    public static void main(String[] args) {
        //Creamos un nuevo teclado para pedir datos al usuario
        Scanner teclado = new Scanner(System.in);
        
        //Mostramos un mensaje al usuario para pedir un número
        System.out.println("Introduzca un número: ");
        
        //Capturamos lo que el usuario ha escrito
        String entrada = teclado.nextLine();
        
        //Declaramos un número y guardamos en su interior el valor que el usuario ha escrito (entrada)
        //Convertimos de un String ("12345") a números, con Integer.parse...
        int numero = Integer.parseInt(entrada);

        //Si estamos en la propia clase, simplemente escribimos el nombre del metodo
        String respuesta = evaluarNumero(numero);
        System.out.println(respuesta);
    }

    //Vamos a crear una función/método que reciba un número y nos devuleva un texto: Positivo, Negativo o Cero
    public static String evaluarNumero(int num){
        if(num > 0){
            return "POSITIVO";
        }else if (num == 0){
            return "CERO";
        }else{
            return "NEGATIVO";
        }
    }

    //Otra manera de hacerlo
    public static String evaluarNumeroo(int num){
        String respuesta = "";
        if(num > 0){
            respuesta = "POSITIVO";
        }else if (num == 0){
            respuesta = "CERO";
        }else{
            respuesta = "NEGATIVO";
        }
        return respuesta;
    }

}

