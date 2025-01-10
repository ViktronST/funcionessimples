public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hola, Rogelio!");
        mostrarSaludo();
        mostrarSaludo("Paco");
        mostrarSaludo("Lucia");
        int numero = recuperarAnyo();
        System.out.println(numero);
        int valor1 = numeroDoble(7);
        int valor2 = numeroDoble(14);
        System.out.println(valor1);
        System.out.println(valor2);
        int valorSuma = sumarNumeros(8, 9);
        System.out.println("La suma de 8 + 9 es " + valorSuma);
        comprobarParImpar(7);
        comprobarParImpar(8);
        //int valorNum = PositivoNegaticoCero(0);
        //System.out.println(valorNum);
        String resultado = PositivoNegaticoCero(-2);
        String resultado2 = PositivoNegaticoCero(3);
        String resultado3 = PositivoNegaticoCero(0);
        System.out.println(resultado);
        System.out.println(resultado2);
        System.out.println(resultado3);

        String textoNumero = "12345";
        //Queremos guardar en nun número dicho texto
        //Para convertir un tipo de dato String a un primitivo
        //int, double, float...
        //Se utiliza el nombre de la clase y el método parse necesario
        //Son métodos static
        //int: Integer
        //float: Float
        //boolean: Boolean
        int datoNumero = Integer.parseInt(textoNumero);
        //Convertir el texto a decimal
        float miFloat = Float.parseFloat(textoNumero);
    }

    public static String PositivoNegaticoCero(int num11){
        if(num11 > 0){
            return "POSITIVO";
        }else if (num11 < 0) {
            return "NEGATIVO";
        }else{
            return "CERO";
        }
    }

    // public static int PositivoNegaticoCero(int num11){
    //     if(num11 > 0){
    //         System.out.println("El número " + num11 + " es POSITIVO");
    //     }else if (num11 < 0) {
    //         System.out.println("El número " + num11 + " es NEGATIVO");
    //     }else{
    //         System.out.println("El número " + num11 + " es CERO");
    //     }
    //     return num11;
    // }

    public static void comprobarParImpar(int numero){
        //COMPROBAMOS EL TIPO DE NUMERO
        if(numero % 2 == 0){
            System.out.println("El número " + numero + " es PAR");
        }else{
            System.out.println("El número " + numero + " es IMPAR");
        }
    }

    public static int sumarNumeros(int num1, int num2){
        int sumar = num1 + num2;
        return sumar;
    }

    public static int numeroDoble(int numero){
        return numero * 2;
    }

    //Método void que muestre un saludo
    public static void mostrarSaludo(String nombre){
        //INSTRUCCIONES
        System.out.println("Bienvenido/a " + nombre);
    }

    public static int recuperarAnyo(){
        //INSTRUCCIONES
        System.out.println("Me estoy ejecutando!!!");
        return 2025;
    }

    //Método void que muestre un saludo.
    public static void mostrarSaludo(){
        //INSTRUCCIONES
        System.out.println("Soy la primera función void");
    }

}
