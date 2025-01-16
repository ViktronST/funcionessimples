public class EjecucionArrays {
    public static void main(String[] args) {
        // int[] numeros = new int[3];
        // numeros[0] = 99;
        // numeros[1] = 2;
        // numeros[2] = 1;
        
        // int suma = 0;
        // for(int i = 0; i < numeros.length; i++){
        //     suma += numeros[1];
        // }

        int [] numeros = JuegoArrays.getArrayRandom(3);
        int suma = JuegoArrays.sumarNumerosArray(numeros);
        System.out.println("La suma es: " + suma);

        // int [] numeros = new int[3];
        // for (int i = 0; i < numeros.length; i++) {
        //     numeros[i] = (int) (Math.random() * 100);
        // }
    }
}
