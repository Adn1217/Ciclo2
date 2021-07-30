package co.edu.utp.misiontic2022.c2;

public class PrecioTotal {

    Double tProductosAlimentarios = 0.0;
    Double tBebidas = 0.0;
    Double tRefrigerados = 0.0;
    ProductosAlimentarios listaProductosAlimentarios[];


    public PrecioTotal(){

    }

    public PrecioTotal(ProductosAlimentarios listaProductosAlimentarios[]){
        Double precioProd = 0.0;
        Refrigerados refri = new Refrigerados();
        Bebidas bebidas = new Bebidas();

        for (ProductosAlimentarios prod: listaProductosAlimentarios){
        
           precioProd = prod.calcularPrecio();
           tProductosAlimentarios += precioProd;

           if (prod.getClass().equals(bebidas.getClass())){

            tBebidas += precioProd;

           }else{

               if (prod.getClass().equals(refri.getClass())){

                   tRefrigerados += precioProd;
                }
            }
        }

    }

    public PrecioTotal(Double tProductosAlimentarios, Double tBebidas, Double tRefrigerados, ProductosAlimentarios listaProductosAlimentarios[]){
        this.tProductosAlimentarios = tProductosAlimentarios;
        this.tBebidas = tBebidas;
        this.tRefrigerados = tRefrigerados;
        this.listaProductosAlimentarios = listaProductosAlimentarios;
    }

    public void mostrarTotal(){
        System.out.println("El precio total de los Productos Alimentarios es de " + tProductosAlimentarios);
        System.out.println("La suma del precio de las Bebidas es de "+ tBebidas);
        System.out.println("La suma del precio de los Refrigerados es de "+ tRefrigerados);
    }
}
