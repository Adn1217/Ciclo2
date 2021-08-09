import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        // var sc = new
        var sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        var numero = sc.nextInt();

        var respuesta = validarNumero(numero);
        System.out.println(respuesta);
    }

    public static String validarNumero(int numero){
        return (numero%2 == 0 ? numero + " Es par" : numero + " Es impar");
        // return (numero%2 != 0 ? numero + " Es impar" : numero + " Es par");
    }

    /*
        if ("condicion cumple"){
            // respuesta
        } else {
            // respuesta
        }
    */
}
