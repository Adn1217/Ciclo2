package co.edu.utp.misiontic2022.c2;

public class MiPrimerClase {
    
    // atributos de la clase.
    private static final Double PI =  3.1416;
    private Integer contador;
    private Integer numHoras;

    // constructor
    public MiPrimerClase(){
        this.contador = 0;
    }

    // constructor
    public MiPrimerClase(Integer contador){
        this.contador = contador;
    }

    // constructor
    public MiPrimerClase(Integer contador, Integer numHoras){
        this.contador = contador;
        this.numHoras = numHoras;
    }
    
    // metodo de incrementar el parametro contador
    public void incrementarContador(Integer contador){
        this.contador += contador;
    }

    // metodo para visualizar el parametro contador
    public Integer getContador(){
        return contador;
    }

    // metodo para asignar valor al parametro contador
    public void setContador(Integer contador){
        this.contador = contador;
    } 
    
    // metodo para visualizar el parametro numHoras.
    public Integer getNumHoras(){
        return numHoras;
    }

    // metodo para asignar valor al parametro numHoras
    public void setNumHoras(Integer numHoras){
        this.numHoras = numHoras;
    }
}
