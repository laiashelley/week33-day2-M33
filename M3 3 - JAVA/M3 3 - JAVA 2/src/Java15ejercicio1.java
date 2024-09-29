
import java.util.ArrayList;
import java.util.Arrays;

/**
 * SUPER CLASE: ZAPATERIA
 * Instancia zapatos de diferentes clases y los agrupa en ArrayLists
 */
public class Java15ejercicio1 {
    public static void main(String[] args) throws Exception {
       
        Elegantes zElegante1 = new Elegantes("Hugo Boss", "Oxford", 42, 250, true);
        Elegantes zElegante2 = new Elegantes("Salvatore Ferragamo", "Monkstrap", 41, 400, false);

        Casuales zCasual1 = new Casuales("Vans", "Old Skool", 40, 60);
        Casuales zCasual2 = new Casuales("Doc Martens", "1461 Smooth", 38, 150);

        Deportivas zDeporte1 = new Deportivas("Nike", "Air Max 270", 45, 150);
        Deportivas zDeporte2 = new Deportivas("Adidas", "Ultraboost 21", 44, 180);
        
        /**
         * Es un array con objetos de diferentes clases
         */
        ArrayList <Zapatos> zapateria = new ArrayList<> (Arrays.asList(zElegante1, zElegante2, zCasual1, zCasual2, zDeporte1, zDeporte2));

        zapateria.add(new Casuales("Vans", "Old Skool", 38, 50));

        System.out.println("***********************************");

        // lista completa array:

        for (Zapatos listaZapatos : zapateria){
            System.out.println(listaZapatos);
        }

        System.out.println("***********************************");

        // lista marcas:
        
        for (int i = 0; i<zapateria.size(); i++){
            System.out.println(zapateria.get(i).getMarca());
        }

        System.out.println("***********************************");

        // lista modelos:

        for (int i = 0; i<zapateria.size(); i++){
            System.out.println(zapateria.get(i).getModelo());
        }

        System.out.println("***********************************");

        // lista tallas:

        for (int i = 0; i<zapateria.size(); i++){
            System.out.println(zapateria.get(i).getTalla());
        }

        System.out.println("***********************************");

        // lista precio:

        for (int i = 0; i<zapateria.size(); i++){
            System.out.println(zapateria.get(i).getPrecio());
        }

        calcularPrecioTotalArrayList(zapateria, 0, 0);

        System.out.println("El precio total de todos los zapatos es: " + calcularPrecioTotalArrayList(zapateria, 0, 0));

        System.out.println("¿El zapato Oxford tiene cordones?" + zElegante1.tieneCordones());
        System.out.println("¿El zapato Salvatore tiene cordones?" + zElegante2.tieneCordones());

    }

    //calculo total del precio de todos los zapatos:

    public static double calcularPrecioTotalArrayList(ArrayList <Zapatos> zapateria, double precio, double precioTotal){
        
        double calculoTotal = 0;

        for (Zapatos preciosZapatos : zapateria){
            calculoTotal += preciosZapatos.getPrecio();
        }

        calculoTotal += precioTotal;

        return calculoTotal;

    }

}
