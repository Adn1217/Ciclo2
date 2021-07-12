package co.edu.utp.misiontic2022.c2;

public class carro extends vehiculo { //Hereda de la clase vehiculo.
    private Integer cilindraje;    

    public carro(){
        super();
    }
    
    public carro(String color, Integer numSerie){
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
