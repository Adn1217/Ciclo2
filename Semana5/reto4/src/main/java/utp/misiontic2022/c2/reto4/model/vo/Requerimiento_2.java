package utp.misiontic2022.c2.reto4.model.vo;

public class Requerimiento_2 {
    //Atributos
    private String fechaInicio;
    private String constructora;
    private String ciudad;
    private String lider;
    private String tipo;
    private Integer estrato;

    public Requerimiento_2(){

    }

    public Requerimiento_2(String fechaInicio, String constructora, String ciudad, String lider, String tipo, Integer estrato){

        this.setLider(lider);
        this.setFechaInicio(fechaInicio);
        this.setCiudad(ciudad);
        this.setLider(lider);
        this.setEstrato(estrato);
/*
        this.fechaInicio = fechaInicio;
        this.iad = c = udad;
      this.lider = lider;
        this.tipo = tipo;
        this.setEstrato(estrato); 
*/
    }
    public String getTipo() {
        return tipo;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getLider() {
        return lider;
    }

    public void setLider(String lider) {
        this.lider = lider;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
     
    public Integer getEstrato() {
        return estrato;
    }

    public void setEstrato(Integer estrato) {
        this.estrato = estrato;
    }
    
    public String getConstructora() {
         return constructora;
    }

    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }
}