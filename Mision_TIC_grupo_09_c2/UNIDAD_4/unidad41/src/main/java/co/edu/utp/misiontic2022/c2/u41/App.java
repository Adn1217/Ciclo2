package co.edu.utp.misiontic2022.c2.u41;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

import co.edu.utp.misiontic2022.c2.u41.view.MainMenu;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        MainMenu.start();


        /*
            byte[] buffer = new byte[255];

            System.out.println("\nEscribe el texto:");
            try{
                System.in.read(buffer,0,255);
            } catch (IOException e){
                System.err.println(e);
            }
            System.out.println("\nLa línea escrita es : ");
            System.out.println(new String(buffer));
        */

        /*
            var f = new File("sub\\prueba.txt");
            System.out.println("pathSeparator : " + File.pathSeparator);
            System.out.println("pathSeparator : " + File.pathSeparator);
            System.out.println("pathSeparatorChar : " + File.pathSeparatorChar);

            System.out.println("canRead : " + f.canRead());
            System.out.println("canWrite : " + f.canWrite());
            System.out.println("exists : " + f.exists());
            System.out.println("getName : " + f.getName());

            System.out.println("getParent : " + f.getParent());
            System.out.println("isDirectory : " + f.isDirectory());
            System.out.println("isFile : " + f.isFile());
            System.out.println("length : " + f.length());
        */

        /*
            int[][] numeros = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}
            };

            var archivo = "Numeros.txt";
            var salida = new PrintWriter(archivo);

            for (int i = 0; i < numeros.length; i++){
                for(int j = 0; j < numeros[i].length; j++){
                    salida.print(numeros[i][j] + ",");
                }
                salida.println("");
            }
            salida.close();
       */

       /*
            String nombre = "Numeros.txt";
            var archivo = new File(nombre);

            if (archivo.exists()){
                var lector = new Scanner(archivo);
                System.out.println("Numeros del fichero");

                while(lector.hasNext()){
                    var numeros = new StringTokenizer(lector.next(),",");
                    while(numeros.hasMoreTokens()){
                        System.out.print(numeros.nextToken() + "\t");
                    }
                    System.out.println("");
                }
                lector.close();
            } else {
                System.out.println("El fichero no existe!");
            }
       */

       /*
            var nombreObj = "Objeto.obj";

            var archivo = new FileOutputStream(nombreObj);
            var oos = new ObjectOutputStream(archivo);

            oos.writeObject(new Persona("552871883","Maria","Ruiz Ramos"));
            oos.writeObject(new Persona("552871883","Maria","Ruiz Ramos"));

            oos.close();
        */


        /*
        var nombreObj = "Objeto.dat";
    
        try {
            var archivo = new FileInputStream(nombreObj);
            var ois = new ObjectInputStream(archivo);

            var p1 = (Persona) ois.readObject();
            var p2 = (Persona) ois.readObject();
            ois.close();

            System.out.println("Cedula\t Nombre");
            System.out.println(p1.getAtributos());
            System.out.println(p2.getAtributos());
            
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        */
    
    }
}
