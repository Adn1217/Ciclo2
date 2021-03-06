package co.edu.utp.misiontic2022.c2;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println( "Hello World!" );
        //String luckyNumber = numeroSuerte();
        //System.out.println("Tu número de la suerte es el " + luckyNumber);
        //double venta = precio();
        //System.out.println("El precio de venta es: " + venta);

        //String num = quitarCifras();
        //System.out.println("El nuevo número es " + num);

        // double vel_kmh = ingVelocidad();
        /* OPCIÓN 1
        vel_kmh = Math.round(vel_kmh * 100.0)/100.0; // Redondeo a dos cifas decimales
        System.out.println("La velocidad en m/s es " + vel_kmh);
        ---OPCIÓN 2
        String vel_kmh_str = String.valueOf(vel_kmh); // Pasar a String
        String mensaje = ("La velocidad en m/s es " + vel_kmh_str);
        --OPCIÓN 3*/
        // String mensaje = ("La velocidad en m/s es "
        //                   + String.format("%.2f",vel_kmh));
        // JOptionPane.showMessageDialog(null,mensaje);

        //double hyp = pitagoras();
        //System.out.printf("La hipotenusa mide %.4f", hyp);
        // MiPrimerClase mpc = new MiPrimerClase();
        // MiPrimerClase mpc_2 = new MiPrimerClase("EsteObjeto", 50);
        // System.out.printf("Valor del contador %s es: %d\n", mpc.getNombre(), mpc.getContador());
        // System.out.printf("Valor del contador %s es: %d\n", mpc_2.getNombre(), mpc_2.getContador());
        // mpc.setContador(10);
        // System.out.printf("Valor del contador %s es: %d\n", mpc.getNombre(), mpc.getContador());

        // carro carro = new carro(); carro.setCilindraje(25);
        // System.out.printf("El cilindraje del carro es: %d\n", carro.getCilindraje());
        // System.out.printf("El color del carro es: %s\n", carro.getColor());
        // Vehiculo vehicle = new Vehiculo("Verde", 12345);
        // Carro carro2 = new Carro("Morado", 6789);
        // System.out.printf("El color del carro 2 con número de serie %d es: %s\n", carro2.getnumSerie(), carro2.getColor());
        
        Carro carro3 = new Carro("Rojo", 7898);
        carro3.setcolorEstandar(ColorEstandar.GrisMedellín);
        System.out.printf("El color estandar del carro con número de serie %d es: %s\n", carro3.getnumSerie(), carro3.getcolorEstandar());
        CarroMecanico Toyota = new CarroMecanico();

        Toyota.setcapacidadTanque(45);
        System.out.println("La capacidad del tanque es: " + Toyota.getcapacidadTanque());

        Carro[] carros = new Carro[3];
        carros[0] = new Carro("Violeta", 4563);
        carros[1] = new Carro("Gris", 7894);
        carros[2] = new Carro("Negro", 7845);

        Carro[][] matrizCarros = new Carro[2][1]; //No importa el tamaño de la instancia si se va a modificar después, se instancia con 2x1.
        matrizCarros[0] = new Carro[1]; //1era fila 1x1
        matrizCarros[1] = new Carro[2]; //2da fila 1x2
        matrizCarros[0][0] = new Carro("Verde", 8653);
        matrizCarros[1][0] = new Carro("Rojo", 6587);
        matrizCarros[1][1] = new Carro("Azul", 8743);
        // Tamaño de matrizCarros queda [0]=1x1 [1]=1x2

        System.out.println("----Inicio ciclos matriz---");
        for (int j = 0; j < matrizCarros.length; j++){ //Número de filas.
            System.out.println("---Fila "+ (j+1) +"------");
            for(int i = 0; i < matrizCarros[j].length; i ++){
                System.out.printf("El color del carro con número de serie %d es %s.\n", matrizCarros[j][i].getnumSerie(), matrizCarros[j][i].getColor());
            }
        }
        System.out.println("---Fin matriz-----");
        System.out.println("----Inicio ciclo vector---");
        for(int i = 0; i < carros.length; i++){
           System.out.printf("El color del carro con número de serie %d es %s.\n", carros[i].getnumSerie(), carros[i].getColor());
        }
        System.out.println("----Fin vector---");
    }

    public static String numeroSuerte()
    {
        int sumador = 0;
        int num_int = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su fecha de nacimiento en formato dd/mm/aaaa");
        String numero = sc.nextLine();
        sc.close();
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

    public static double precio ()
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Inserte costo unitario del producto");
       int costo_uni = sc.nextInt();
       System.out.println("Inserte porcentaje de IVA [%]");
       int iva = sc.nextInt(); 
       double iva_d = iva / 100.0;
       System.out.println("Inserte número de productos vendidos");
       int num = sc.nextInt();
       sc.close();
       double venta = (1 + iva_d)*(num * costo_uni);
       return venta;
    }

    public static String quitarCifras()
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Ingrese número entero");
       int num = sc.nextInt();
       System.out.println("Ingrese número de cifras");
       int m = sc.nextInt();
       sc.close(); 
       String num_str = String.valueOf(num);
       String num_str2 = num_str.substring(0, num_str.length()-m);
       return num_str2;
    }

    public static double ingVelocidad()
    {
    //    Scanner sc = new Scanner(System.in);
    //    System.out.println("Ingrese velocidad en km/h");
    //    int vel_kmh = sc.nextInt();
       String vel_kmh_str = JOptionPane.showInputDialog("Ingrese velocidad en km/h");
       double vel_ms = velocidad(vel_kmh_str);
       return vel_ms;
    }

    public static double velocidad(String vel_kmh_str){
       int vel_kmh = Integer.valueOf(vel_kmh_str);
       double vel_ms = vel_kmh * (1000/3600.0);
       return vel_ms;
    }
    
    public static double pitagoras()
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Ingrese longitud cateto 1");
       int cat1 = sc.nextInt();
       System.out.println("Ingrese longitud cateto 2");
       int cat2 = sc.nextInt();
       sc.close();
       double hyp = Math.sqrt(Math.pow(cat1,2) + Math.pow(cat2,2));
       return hyp;
    }
}



