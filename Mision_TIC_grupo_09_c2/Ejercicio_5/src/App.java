import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        var sc = new Scanner(System.in);
        System.out.println("Introduce un numero entero : ");
        var numero = sc.nextInt();

        var digito = numeroDigito(numero);

        System.out.println("El numero tiene " + digito + " cifras");
    }

    public static int numeroDigito(int numero){
        var cifras = 0;

        while (numero != 0){
            numero /= 10;
            cifras++;
        }

        return cifras;
    }
}
