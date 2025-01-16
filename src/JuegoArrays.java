public class JuegoArrays {
    
    public static int[] getArrayRandom(int elementos){
        int[] numeros = new int[elementos];
        for (int i = 0; i < numeros.length; i++){
            numeros[i] = (int) (Math.random() * 100);
            System.out.println("Random: " + numeros[i]);
        }
    }

    public static int sumarNumerosArray(int[] numeros){
        int suma = 0;
        for(int i = 0; i < numeros.length; i++){
            suma += numeros[i];
        }
        return suma;
    }

}
