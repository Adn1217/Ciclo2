package co.edu.utp.misiontic2022.c2;

public class Inversiones {

    private Integer vTiempo = 0;
    private Double vMonto = 0.0;
    private Double vInteres = 0.0;
    private Double intSimple = 0.0;
    private Double intCompuesto = 0.0;
    private Double valInversion = 0.0;

    public Inversiones(){

    }

    public Inversiones(int tiempo, double monto, double interes){
        this.vTiempo = tiempo;
        this.vMonto = monto;
        this.vInteres = interes;
    }

    public Double interesSimple(){

        intSimple = this.vMonto * this.vInteres * this.vTiempo;
        return intSimple;
    }

    public Double interesCompuesto(){

        intCompuesto= this.vMonto * (Math.pow((1 + this.vInteres), this.vTiempo) - 1);

        return intCompuesto;
    }

    public String validarInversion(int tiempo, double monto, double interes){
        this.vTiempo = tiempo;
        this.vMonto = monto;
        this.vInteres = interes;

        valInversion = interesCompuesto() - interesSimple();
        String valInv_str = String.valueOf(valInversion);
        return valInv_str;
    }

    public Double[] getDataInv(){
        Double [] data = new Double[3];
        data[0] = (double)this.vTiempo;
        data[1] = this.vMonto;
        data[2] = this.vInteres;
        return data;
    }
}