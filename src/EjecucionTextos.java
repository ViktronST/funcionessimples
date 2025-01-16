import java.util.Scanner;

public class EjecucionTextos {
    public static void main(String[] args) {
        // String texto = "1234";
        // int suma = 0;
        // for (int i = 0; i < texto.length(); i++) {
        //     char letra = texto.charAt(i);
        //     //TRUCO: LOS DE MINÚSCULAS SON CON CASTING
        //     //CONVERTIMOS NUESTRO char A int
        //     //ESTA CONVERSIÓN PRIMITIVA RECUPERA EL VALOR
        //     //ASCII DEL char QUE ESTAMOS RECORRIENDO
            
        //     //DEBEMOS CONVERTIR EL char A String
        //     String temporal = String.valueOf(letra);

        //     //SABEMOS CONVERTIR UN String A int?
        //     int numero = Integer.parseInt(temporal);
        //     suma += numero;
        // }

        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce un texto numérico: ");
        String texto = scan.nextLine();
        int suma = JuegoTextos.getSumarTexto(texto);

        System.out.println("La suma de " + texto + " es " + suma);

        //String isbn = "8441513929";
        // int sumaisbn = 0;
        // //RECORREMOS CADA CARACTER DEL TEXTO
        // for(int i=0; i<isbn.length(); i++){
        //     //RECUPERAMOS EL CARACTER EN LA POSICIÓN i
        //     char letra = isbn.charAt(i);
        //     //CONVERTIMOS EL CARACTER A STRING
        //     String temporal = String.valueOf(letra);
        //     //CONVERTIMOS EL STRING A INT
        //     int numero = Integer.parseInt(temporal);
        //     //MOSTRAMOS EL NÚMERO Y SU POSICIÓN
        //     int posicion = i+1;
        //     //REALIZAMOS LA OPERACIÓN
        //     int operacion = numero * posicion;
        //     //ACUMULAMOS EL NÚMERO
        //     sumaisbn += operacion;
        // }
        // if(sumaisbn%11==0){
        //     System.out.println("El ISBN " + isbn + " es correcto");
        // }else{
        //     System.out.println("El ISBN " + isbn + " es incorrecto");
        // }

        String isbn = "8441513929";
        boolean respuesta = JuegoTextos.validarISBN(isbn);
        if(respuesta == true){
            System.out.println("El ISBN " + isbn + " es correcto");
        }else{
            System.out.println("El ISBN " + isbn + " es incorrecto");
        }
    }
}
