package co.edu.utp.misiontic2022.c2;

/**
 * Solución al reto de la semana 1.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Inversiones inv = new Inversiones();
        String result1 = inv.validarInversion(12, 2000000, 0.05);
        // String result1 = inv.validarInversion(18, 3000000, 0);
        if (result1.equals("0.0")){
            System.out.printf("Faltan datos para calcular la diferencia en el total de intereses generados para el proyecto.\n");
        }
        else{
        System.out.printf("La diferencia en el total de intereses generados para el proyecto, si escogemos entre evaluarlo a una tasa de interés Compuesto y evaluarlo a una tasa de interés Simple, asciende a la cifra de: $%s\n", result1);
        }
    }
}
