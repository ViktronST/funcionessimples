public class JuegoTextos {
    public static int getSumarTexto(String texto){
        int suma = 0;
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            //TRUCO: LOS DE MINÚSCULAS SON CON CASTING
            //CONVERTIMOS NUESTRO char A int
            //ESTA CONVERSIÓN PRIMITIVA RECUPERA EL VALOR
            //ASCII DEL char QUE ESTAMOS RECORRIENDO
            
            //DEBEMOS CONVERTIR EL char A String
            String temporal = String.valueOf(letra);

            //SABEMOS CONVERTIR UN String A int?
            int numero = Integer.parseInt(temporal);
            suma += numero;
        }
        return suma;

        public static boolean validarISBN(String isbn){
        int sumaisbn = 0;
        //RECORREMOS CADA CARACTER DEL TEXTO
        for(int i=0; i<isbn.length(); i++){
            //RECUPERAMOS EL CARACTER EN LA POSICIÓN i
            char letra = isbn.charAt(i);
            //CONVERTIMOS EL CARACTER A STRING
            String temporal = String.valueOf(letra);
            //CONVERTIMOS EL STRING A INT
            int numero = Integer.parseInt(temporal);
            //MOSTRAMOS EL NÚMERO Y SU POSICIÓN
            int posicion = i+1;
            //REALIZAMOS LA OPERACIÓN
            int operacion = numero * posicion;
            //ACUMULAMOS EL NÚMERO
            sumaisbn += operacion;
        }
        if(sumaisbn%11==0){
            return true;
        }else{
            return false;
        }
    }
}
