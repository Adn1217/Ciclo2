package co.edu.utp.misiontic2022.c2;

public class Bebidas extends ProductosAlimentarios{
    
    static final char LUGAR_ORIGEN = 'N';
    char lugarOrigen;

    public Bebidas(){
        precio_base = PRECIO_BASE;
        peso_base = PESO_BASE;
        lugarOrigen = LUGAR_ORIGEN;
        comprobarLugarOrigen(this.lugarOrigen);
    }

    public Bebidas(Double precioBase, Integer peso){

        precio_base = precioBase;
        peso_base = peso;
        lugarOrigen = LUGAR_ORIGEN;
        tipo_alimento = TIPO_ALIMENTO;
        comprobarLugarOrigen(this.lugarOrigen);
    }

    public Bebidas(Double precioBase, Integer peso, char lugarOrigen){

        precio_base = precioBase;
        peso_base = peso;
        this.lugarOrigen = lugarOrigen;
        tipo_alimento = TIPO_ALIMENTO;
        comprobarLugarOrigen(this.lugarOrigen);
    }

    public void comprobarLugarOrigen(char lugarOrigen){
        
        if (lugarOrigen =='I'){

            adicion += 15;

        }else{

                adicion += 5;
        }
    }

    // @Override
    // public Double calcularPrecio(){
    //     Double precioFinal;
    //     adicionPeso();
    //     precioFinal = precio_base + adicion;
    //     return precioFinal;
    // }
}
