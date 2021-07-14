package co.edu.utp.misiontic2022.c2;

public class Carro extends Vehiculo { //Hereda de la clase vehiculo.
    private Integer cilindraje;    

    public Carro(){
    }
    
    public Carro(String color, Integer numSerie){
        super(color, numSerie);
    }

    public Integer getCilindraje()
    {
        return this.cilindraje;
    }

    public void setCilindraje(Integer cilindraje)
    {
        this.cilindraje = cilindraje;
    }

}
