public class Calculadora {
    //ESTA CLASE ES UNA HERRAMIENTA, POR SI MISMA NO SIRVE DE NADA, SIMPLEMENTE TENDRÁ UN METODO/S PARA HACER OPERACIONES MATEMÁTICAS
    
    public static void mostrarMenu(){
        System.out.println("----------------------");
        System.out.println("Selecione una opción:");
        System.out.println("1.- Sumar");
        System.out.println("2.- Restar");
        System.out.println("3.- Multiplicar");
        System.out.println("4.- Dividir");
        System.out.println("----------------------");
    }
    
    public static int sumarNumeros(int num1, int num2){
        int operacion = num1 + num2;
        return operacion;                //ó return num1 + num2;
    }

    public static int restarNumeros(int num1, int num2){
        int operacion = num1 - num2;
        return operacion;                //ó return num1 - num2;
    }

    public static int dividirNumeros(int num1, int num2){
        int operacion = num1 / num2;
        return operacion;                //ó return num1 / num2;
    }

    public static int multiplicarNumeros(int num1, int num2){
        int operacion = num1 * num2;
        return operacion;                //ó return num1 * num2;
    }
}
