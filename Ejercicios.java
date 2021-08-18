public class Ejercicios {

    //-----------------Ejercicio2--------------------
    public static void numeroAbundante(int num, int sumaDivisores, int aux){
        if (aux <= num/2){
            if(num % aux == 0){
                sumaDivisores += aux;
            }
            numeroAbundante(num,sumaDivisores,aux+1);
        }else {
            if (num < sumaDivisores){
                System.out.println("El numero "+ num + " es un numero abundante");
            }else {
                System.out.println("El numero "+ num + " no es un numero abundante");
            }

        }
    }

    //-----------------Ejercicio3--------------------
    public static void contarImpares(int num,int aux,int contador){
        String auxStr = String.valueOf(num);
        if (aux < auxStr.length()){
            if((int) auxStr.charAt(aux) % 2!=0){
                contarImpares(num,aux+2,contador+1);
            }else {
                contarImpares(num,aux+2,contador);
            }
        }else {
            if(contador == 1){
                System.out.println("Hay " + contador + " numero primo en las pocisiones pares de: " + num);
            }else {
                System.out.println("Hay " + contador + " numeros primos en las pocisiones pares de: " + num);
            }
        }
    }

    //-----------------Ejercicio4--------------------
    public static void eliminarCaracteresRepetidos(String texto,int i,String salida,char aux){
        if (i < texto.length()){
            if (aux != ' '){
                if (texto.charAt(i) == aux){
                    eliminarCaracteresRepetidos(texto,i+1,salida,aux);
                }else {
                    aux =  texto.charAt(i);
                    salida = salida+aux;
                    eliminarCaracteresRepetidos(texto,i+1,salida,aux);
                }
            }else {
               aux =  texto.charAt(i);
               salida= salida+aux;
               eliminarCaracteresRepetidos(texto,i+1,salida,aux);
            }

        }else {
            System.out.println(salida);
        }
    }

    //-----------------Ejercicio5--------------------
    public static void inverso(String texto,int i,String salida){
        if (i < texto.length()+1){
            char aux =  texto.charAt(texto.length()-i);
            salida = salida+aux;
            inverso(texto,i+1,salida);
        } else {
            eliminarCaracteresRepetidos(salida,0,"",' ');
        }
    }

}
