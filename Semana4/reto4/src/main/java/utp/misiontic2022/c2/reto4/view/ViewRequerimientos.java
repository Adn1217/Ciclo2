package utp.misiontic2022.c2.reto4.view;

import java.util.ArrayList;

import utp.misiontic2022.c2.reto4.controller.ControllerRequerimientos;
import utp.misiontic2022.c2.reto4.model.vo.Requerimiento_1;
import utp.misiontic2022.c2.reto4.model.vo.Requerimiento_2;
import utp.misiontic2022.c2.reto4.model.vo.Requerimiento_3;

public class ViewRequerimientos {
    private static final ControllerRequerimientos controlador = new ControllerRequerimientos();

    public static void requerimiento1(){
        try{
            ArrayList<Requerimiento_1> listaRequerimiento_1;
            listaRequerimiento_1 = controlador.consultaRequerimiento_1();
            for(Requerimiento_1 requerimiento_1: listaRequerimiento_1){
                System.out.println(
                    requerimiento_1.getFechaCompra() + "\t" +
                    requerimiento_1.getCodCompra() + "\t" +
                    requerimiento_1.getNombreProveedor() + "\t\t" +
                    requerimiento_1.getPagado()
                );
            }
            }catch(Exception e){
                System.err.println(e);
            }
    }
    
    public static void requerimiento2(){
        try{
            ArrayList<Requerimiento_2> listaRequerimiento_2;
            listaRequerimiento_2 = controlador.consultaRequerimiento_2();
            for(Requerimiento_2 requerimiento_2: listaRequerimiento_2){
                System.out.println(
                    requerimiento_2.getFechaInicio() + "\t" +
                    requerimiento_2.getCiudad() + "\t" +
                    requerimiento_2.getConstructora() + "\t" +
                    requerimiento_2.getLider() + "\t" +
                    requerimiento_2.getTipo() + "\t" +
                    requerimiento_2.getEstrato()
                );
            }
            }catch(Exception e){
                System.err.println(e);
            }
    }

    public static void requerimiento3(){
        try{
            ArrayList<Requerimiento_3> listaRequerimiento_3;
            listaRequerimiento_3 = controlador.consultaRequerimiento_3();
            for(Requerimiento_3 requerimiento_3: listaRequerimiento_3){
                System.out.println(
                    requerimiento_3.getAbrev()
                );
            }
            }catch(Exception e){
                System.err.println(e);
            }
    }
}
