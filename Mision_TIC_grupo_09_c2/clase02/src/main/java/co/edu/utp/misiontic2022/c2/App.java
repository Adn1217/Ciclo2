package co.edu.utp.misiontic2022.c2;

import co.edu.utp.misiontic2022.c2.enumeraciones.DiaSemana;

import co.edu.utp.misiontic2022.c2.enumeraciones.Color;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /*
            MiPrimerClase mpc = new MiPrimerClase();
            MiPrimerClase mpc2 = new MiPrimerClase(50);
            MiPrimerClase mpc3 = new MiPrimerClase(10,20);

            mpc.incrementarContador(5);
            System.out.println("Valor atributo contador : " + mpc.getContador());
            mpc.setContador(20);
            System.out.println("Valor atributo : " + mpc.getContador());
            
            System.out.println("mpc2 atributo : " + mpc2.getContador());
            mpc2.incrementarContador(50);
            System.out.println("mpc2 atributo : " + mpc2.getContador());
            
            System.out.println("mpc3 atributo : " + mpc3.getContador());
            System.out.println("mpc3 atributo numHoras : " + mpc3.getNumHoras());
        */

        
        Vehiculo vehiculo = new Vehiculo();
        Coche coche = new Coche();
        Coche coche2 = new Coche(Color.AZUL,121212,4);

        Barco barco = new Barco();

        coche.setColor(Color.ROJO);
        System.out.println("color de objeto coche1 es :" + coche.getColor());

        System.out.println("coche2 su num serie es :"  + coche2.getNumSerie() 
                            + " y tiene " + coche2.getNumRuedas() + " ruedas");

        

        ImpresoraTinta impresoraTinta = new ImpresoraTinta(60);
        impresoraTinta.imprimir("Copias");
        System.out.println(DiaSemana.MARTES);

        // var vcoche = new Coche();



        // delacración Array
        int[] pEntero;
        // Inicialización del array
        pEntero = new int[5];

        
        int[] intArray = {1,2,3,4,5,6,7,8,9};
        
        int[] miArray = new int[2];
        miArray[0] = 1;
        miArray[1] = 2;

        for(int i=0; i< miArray.length;i++){
            System.out.println("Elemento en el indice " + i + " :" + miArray[i]);
        }

        Coche[] cocheArray = new Coche[2];

        cocheArray[0] = new Coche(Color.AZUL,11,22);
        cocheArray[1] = new Coche(Color.BLANCO,33,44);

        for(int j = 0; j < cocheArray.length; j++){
            System.out.println("coche su num serie es :"  + cocheArray[j].getNumSerie() 
            + " y tiene " + cocheArray[j].getNumRuedas() + " ruedas");

        }

    }
}
