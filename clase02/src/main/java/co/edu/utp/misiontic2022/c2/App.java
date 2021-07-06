package co.edu.utp.misiontic2022.c2;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println( "Hello World!" );
        String luckyNumber = numeroSuerte();
        System.out.println("Tu número de la suerte es el " + luckyNumber);
    }

    public static String numeroSuerte()
    {
        int sumador = 0;
        int num_int = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su fecha de nacimiento en formato dd/mm/aaaa");
        String numero = sc.nextLine();
        String [] nums = numero.split("/", 3);

        for (String num: nums){
            sumador += Integer.parseInt(num);
        }

        String total = Integer.toString(sumador);

        for (int i = 0; i < total.length(); i++){
            String num_str = String.valueOf(total.charAt(i));
            num_int += Integer.parseInt(num_str);
        }
        String numeroSuerte = Integer.toString(num_int);
        return numeroSuerte;
    }
}



