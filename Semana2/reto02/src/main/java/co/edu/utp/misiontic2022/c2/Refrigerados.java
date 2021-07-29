package co.edu.utp.misiontic2022.c2;

public class Refrigerados extends ProductosAlimentarios {
    Integer TEMPERATURA = 10;
    Integer temperatura;
    
    
    public Refrigerados(){
        precio_base = PRECIO_BASE;
        peso_base = PESO_BASE;
        tipo_alimento = TIPO_ALIMENTO;
        temperatura = TEMPERATURA;
    }

    public Refrigerados(Double precioBase, Integer peso){
        precio_base = precioBase;
        peso_base = peso;
        temperatura = TEMPERATURA;
    }

    public Refrigerados(Double precioBase, Integer peso, Integer temperatura){
        this.temperatura = temperatura;
        precio_base = precioBase;
        peso_base = peso;
    }

    protected void adicionTemperatura(){

        if(5 <= temperatura && temperatura < 10){

            adicion += 20;

        }else{

            if(10 <= temperatura && temperatura <= 15){
                
                adicion += 18;

            }else{
                
                adicion += 5;
            }
        }
    }

    @Override
    public Double calcularPrecio(){
        Double precioFinal;
        comprobarTipoAlimento(tipo_alimento); 
        adicionPeso();
        adicionTemperatura();
        precioFinal = precio_base + this.adicion;
        return precioFinal;
    }
}
