package co.edu.utp.misiontic2022.c2;

public class vehiculo {
    private String color = "Azul";
    private Integer numSerie;
    
    public vehiculo()
    {
        
    }

    public vehiculo(String color, int numSerie)
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
}
