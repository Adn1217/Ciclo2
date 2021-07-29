package co.edu.utp.misiontic2022.c2;

public class ProductosAlimentarios {
    static final Double PRECIO_BASE = 80.0;
    static final Integer PESO_BASE = 5;
    static final char TIPO_ALIMENTO = 'N';
    Double precio_base;
    Integer peso_base;
    char tipo_alimento;
    Integer adicion = 0;

    public ProductosAlimentarios(){
        precio_base = PRECIO_BASE;
        peso_base = PESO_BASE;
        tipo_alimento = TIPO_ALIMENTO;
    }
    
    public ProductosAlimentarios(Double precioBase, Integer peso){
        
        precio_base = precioBase;
        peso_base = peso;
        tipo_alimento = TIPO_ALIMENTO;
    }
    
    public ProductosAlimentarios(Double precioBase, Integer peso, char tipoAlimento){

        precio_base = precioBase;
        peso_base = peso;
        tipo_alimento = tipoAlimento;
    }

    protected void comprobarTipoAlimento(char tipoAlimento){

        if (tipoAlimento =='N'){

            this.adicion += 40;

        }else{

            if (tipoAlimento =='C'){

                this.adicion += 20;
            }
        }

    }

    protected void adicionPeso(){

        if(0 <= peso_base && peso_base <= 9){

            this.adicion += 6;

        }else{

            if(9 < peso_base && peso_base <= 16){
                
                this.adicion += 8;

            }else{

                if (peso_base > 16){

                    this.adicion += 20;
                }
            }
        }
    }

    public Double calcularPrecio(){
        Double precioFinal;
        comprobarTipoAlimento(tipo_alimento);
        adicionPeso();
        precioFinal = precio_base + adicion;
        return precioFinal;
    }
}
