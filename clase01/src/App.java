import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!!!");
        var Scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero");
        var numero = Scanner.nextInt();
        var respuesta = validarNumero(numero);
        System.out.println(respuesta);
    }

    public static String validarNumero(int numero){
        return(numero % 2 == 0 ? numero +" es par": numero + " es impar");

    }
}
