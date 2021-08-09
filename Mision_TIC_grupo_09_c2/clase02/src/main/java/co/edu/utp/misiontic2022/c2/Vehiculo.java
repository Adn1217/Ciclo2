package co.edu.utp.misiontic2022.c2;

import co.edu.utp.misiontic2022.c2.enumeraciones.Color;

public class Vehiculo {
    // atributos
    private Color color;
    private Integer numSerie;

    // constructor
    public Vehiculo(){
    }

    public Vehiculo(Color color,Integer numSerie){
        this.color = color;
        this.numSerie = numSerie;
    }

    public Color getColor(){
        return color;
    }

    public void setColor(Color color){
        this.color = color;
    }

    public Integer getNumSerie(){
        return numSerie;
    }

    public void setNumSerie(Integer numSerie){
        this.numSerie = numSerie;
    }



}
