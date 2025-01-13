public class EvaluacionNumeros {
    
    public static void evaluacionNumeros(){
        System.out.println("Elije:");
        System.out.println("1.- Mostrar el mayor de los dos números");
        System.out.println("2.- Mostrar el menor de los dos números");
        System.out.println("3.- Mostrar el mayor, el menor y el intermedio");
    }

    public static boolean mayoDosNumeros(int num1, int num2){
        boolean operacion = (num1 <= num2);
        return operacion;
    }

    public static boolean menoDosNumeros(int num1, int num2){
        boolean operacion = (num1 >= num2);
        return operacion;
    }

    public static int mayorDosNumeros(int num1, int num2){
        if(num1 > num2){
            return num1;
        }else{
            return num2;
        }
    }

    public static int menorDosNumeros(int num1, int num2){
        if(num1 < num2){
            return num1;
        }else{
            return num2;
        }
    }

    public static void evaluarTresNumeros(int num1, int num2, int num3){
        int mayor, menor, intermedio;
        if(num1>=num2 && num1>=num3){
            mayor = num1;
        }else if(num2>=num1 && num2>=num3){
            mayor = num2;
        }else{
            mayor = num3;
        }

        if(num1<=num2 && num1<=num3){
            menor = num1;
        }else if(num2<=num1 && num2<=num3){
            menor = num2;
        }else{
            menor = num3;
        }

        if(num1>=num2 && num1<=num3){
            intermedio = num1;
        }else if(num2>=num1 && num2<=num3){
            intermedio = num2;
        }else{
            intermedio = num3;
        }

        int suma = num1 + num2 + num3;
        intermedio = suma - mayor - menor;
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
        System.out.println("Intermedio: " + intermedio);
    }
}
