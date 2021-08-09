public class App {
    public static void main(String[] args) throws Exception {

        var nombre = "Israel Arbona";
        var resultado = saludo(nombre);
        System.out.println(resultado);
 
    }

    public static String saludo(String nombre){
        return "Hola" + nombre + "!";
    }

}
