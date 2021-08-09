package co.edu.utp.misiontic2022.c04;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import co.edu.utp.misiontic2022.c04.animales.Cat;

public class App {

    public static void main( String[] args )
    {
        // Una lista de enteros
        // Lista puede tener numeros repetidos.
        List<Integer> listaManzanas;

        // Un cunjunto de enteros
        // El cunjunto no se repiten los enteros o numeros.
        Set<Integer> conjuntoNaranjas;


        Map<String,Integer> mapaNotas;


        List<Integer> listaEntero = new ArrayList<>();
        // var varEntero = new ArrayList<Integer>();

        listaEntero.add(2);
        listaEntero.add(4);
        listaEntero.add(7);

        // listaEntero.indexOf(10);
        // System.out.println(listaEntero.indexOf(10));

        /*
        Iterator<Integer> iterador = listaEntero.iterator();
        while (iterador.hasNext()){
            Integer entero = iterador.next();
            System.out.println(entero);
        }

        for (Integer entero: listaEntero){
            System.out.println(entero);
        }

        listaEntero.stream().forEach(System.out::println);

        for(int i = 0; i < listaEntero.size(); i++){
            System.out.println(listaEntero.get(i));
        }
        */

        Set<Integer> conjuntoEntero = new HashSet<>();

        conjuntoEntero.add(5);
        conjuntoEntero.add(7);
        conjuntoEntero.add(5);

        for(Integer entero: conjuntoEntero){
            System.out.println(entero);
        }
    }
}
