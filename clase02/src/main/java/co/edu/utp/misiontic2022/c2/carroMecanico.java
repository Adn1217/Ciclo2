package co.edu.utp.misiontic2022.c2;

public class carroMecanico implements Imecanico {
    private Integer capacidadTanque;
    private Integer cambioAceite;
    private Double emisiones;

    public carroMecanico(){

    }

    @Override
    public void setcapacidadTanque(int capacidad) {
        // Implementación del método descrito en la interface.
        this.capacidadTanque = capacidad;
    }

    @Override
    public void cambioAceite(int kilometros) {
        // Implementación del método descrito en la interface.
        this.cambioAceite = kilometros;    
    }

    @Override
    public void emisiones(double kilometros) {
        // Implementación del método descrito en la interface.
       this.emisiones = kilometros; 
    }

    @Override
    public Integer getcapacidadTanque() {
        // Implementación del método descrito en la interface.
        return this.capacidadTanque;
    }

    @Override
    public Integer getcambioAceite() {
        // Implementación del método descrito en la interface.
        return this.cambioAceite;
    }

    @Override
    public Double getEmisiones() {
        // Implementación del método descrito en la interface.
        return this.emisiones;
    }

    
}
