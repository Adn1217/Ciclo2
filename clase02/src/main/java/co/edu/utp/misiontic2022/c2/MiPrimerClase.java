package co.edu.utp.misiontic2022.c2;

public final class MiPrimerClase {
    //private static final Double PI = 3.1416;
    private Integer contador = 0;
    private String nombre = "SinNombre";

    public MiPrimerClase()          //Constructor genérico (puede omitirse).
    {

    }
    
    public MiPrimerClase(String nombre, Integer contador) //Constructor con atributo especificado.
    {
        this.nombre = nombre;
        this.contador = contador;       //El "this" hace referencia al atributo de la clase.
    }
    
    public void incrementarContador(Integer cantidad)
    {
        this.contador += cantidad;      //El "this" hace referencia al atributo de la clase.
    }

    public Integer getContador()
    {
        return contador;
    }

    public void setContador(Integer num)
    {
        contador = num;
    }

    public String getNombre()
    {
        return nombre;
    }
}