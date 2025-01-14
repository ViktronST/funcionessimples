public class HerramientasPersonas {
    public static String getLetraNIF(int numDni){
        int resultado = (numDni - ((numDni / 23) * 23));
        String letra = "";
        if(resultado == 0){
            letra = "T";
        }else if(resultado == 1){
            letra = "R";
        }else if(resultado == 2){
            letra = "W";
        }else if(resultado == 3){
            letra = "A";
        }else if(resultado == 4){
            letra = "G";
        }else if(resultado == 5){
            letra = "M";
        }else if(resultado == 6){
            letra = "Y";
        }else if(resultado == 7){
            letra = "F";
        }else if(resultado == 8){
            letra = "P";
        }else if(resultado == 9){
            letra = "B";
        }else if(resultado == 10){
            letra = "X";
        }else if(resultado == 11){
            letra = "B";
        }else if(resultado == 12){
            letra = "N";
        }else if(resultado == 13){
            letra = "J";
        }else if(resultado == 14){
            letra = "Z";
        }else if(resultado == 15){
            letra = "S";
        }else if(resultado == 16){
            letra = "Q";
        }else if(resultado == 17){
            letra = "V";
        }else if(resultado == 18){
            letra = "H";
        }else if(resultado == 19){
            letra = "L";
        }else if(resultado == 20){
            letra = "C";
        }else if(resultado == 21){
            letra = "K";
        }else if(resultado == 22){
            letra = "E";
        }else if(resultado == 23){
            letra = "T";
        }
        return letra;
    }
    
    public static String getLetraaNIF(int numDni){
        int resultado = (numDni - (numDni - ((numDni / 23) * 23)));
        
        String secuencia = "TRWAGMYFPDXBNJZSQVHLCKET";
        char letra = secuencia.charAt(resultado);
        String letraConvertida = String.valueOf(letra);
        return letraConvertida;
    }

    //MÉTODO QUE RECIBA UN NIF/DNI Y NOS DEVUELVA SI ES VÁLIDO O NO
    public static boolean validarNIF(String nif){
        int longitud = nif.length()-1;
        char ultimaLetra = nif.charAt(longitud);
        String soloNumeros = nif.substring(0, longitud);
        int numeroDni = Integer.parseInt(soloNumeros);
        String letraComparacion = String.valueOf(ultimaLetra);
        String resultado = getLetraNIF(numeroDni);
        return resultado.equals(letraComparacion);
    }

    public static String getDiaNacimiento(int dia, int mes, int anio) {
        if (mes == 1 || mes == 2) {
            mes += 12;
            anio -= 1;
        }
    
        int paso1 = ((mes + 1) * 3) / 5;
        int paso2 = anio / 4;
        int paso3 = anio / 100;
        int paso4 = anio / 400;
        int paso5 = dia + (mes * 2) + anio + paso1 + paso2 - paso3 + paso4 + 2;
        int paso6 = paso5 / 7;
        int paso7 = paso5 - (paso6 * 7);
    
        String[] diaSemana = {"Sábado", "Domingo", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes"};
        return diaSemana[paso7];

        // if(paso7 == 0){
        //     diaSemana = "Sábado";
        // }else if(paso7 == 1){
        //     diaSemana = "Domingo";
        // }else if(paso7 == 2){
        //     diaSemana = "Lunes";
        // }else if(paso7 == 3){
        //     diaSemana = "Martes";
        // }else if(paso7 == 4){
        //     diaSemana = "Miércoles";
        // }else if(paso7 == 5){
        //     diaSemana = "Jueves";
        // }else if(paso7 == 6){
        //     diaSemana = "Viernes";
        // }
        // return diaSemana;
    }


}
