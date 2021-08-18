package utp.misiontic2022.c2.reto4;

import utp.misiontic2022.c2.reto4.view.FormReqBusqueda;
import utp.misiontic2022.c2.reto4.view.FormRequerimientos;
import utp.misiontic2022.c2.reto4.view.ViewRequerimientos;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /*
        System.out.println("\nInicio...");
        System.out.println("Requerimiento 1");
        System.out.println("Fecha Compra  Cod. Compra  Nombre Proveedor \t Pagado");
        ViewRequerimientos.requerimiento1();
        
        System.out.println("\nInicio...");
        System.out.println("Requerimiento 2");
        System.out.println("Fec Inicio \t Nombre Constructora \t Nombre Ciudad \t Nombre Lider \t Cod. Tipo Estrato");
        ViewRequerimientos.requerimiento2();
        
        System.out.println("\nInicio...");
        System.out.println("Requerimiento 3");
        System.out.println("Abrev");
        ViewRequerimientos.requerimiento3();
        */
        new FormRequerimientos().setVisible(true);
        //new FormReqBusqueda().setVisible(true);
    }
}


