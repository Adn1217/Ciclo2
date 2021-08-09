import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) throws Exception {
        
        // Creamos el objeto de Scanner para pedir el dato numerico.
        var sc = new Scanner(System.in);

        // Impresión por consola con la class System
        System.out.println("Ingrese un numero entero : ");

        // Asignamos a una variable numero el valor ingresado por teclado
        var numero = sc.nextInt();

        // Impresion de las funciones separadas numeroDoble y numeroTriple.
        System.out.println("El doble " + numero + " es : " + numeroDoble(numero));
        System.out.println("El triple " + numero + " es : " + numeroTriple(numero));

        // Impresion de la funcion numeroRespuesta que retorna un strign (cadena de caracteres)
        System.out.println(numeroRespuesta(numero));

    }

    public static int numeroDoble(int numero){
        return numero*2;
    }

    public static int numeroTriple(int numero){
        return numero*3;
    }

    public static String numeroRespuesta(int numero){
        return "El doble de " + numero + " es : " + (numero * 2) +
            " \n  el triple de " + numero + " es : " + (numero * 3);
    }
}
