package co.edu.utp.misiontic2022.c2;

public class Vehiculo {
    private String color = "Azul";
    private Integer numSerie;
    private ColorEstandar colorEstandar;
    
    public Vehiculo()
    {
        
    }

    public Vehiculo(String color, int numSerie)
    {
        this.color = color;
        this.numSerie = numSerie;
    }

    public Integer getnumSerie()
    {
        return numSerie;
    }
    
    public String getColor()
    {
        return color;
    }

    public void setcolorEstandar(ColorEstandar colorEs)
    {
        this.colorEstandar = colorEs; 
    }
    
    public ColorEstandar getcolorEstandar()
    {
        return this.colorEstandar;
    }
}
