import java.util.Scanner;

/**
 * Clase principal cacatua cacahuete
    *Incluye tres metodos: main, preguntona i adormir
 */
public class App {
    /**
     * llama a la calse preguntona() y esta a aDormir() (segun condicion)
     * @param args - para testeo desde terminal con array de string sobre deocmuento java compilado.
     * @throws Exception - si esto no pita, lanza una excepcion standard
     */
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        String comida = "";

        preguntona(comida, sc);


        sc.close();


    }

    /**
    * Aqqui la accatua pide comida al usuario
    * Sigue preguntando mientras no le des cacauetes
    * y cuando le das cacauetes, llama al metodo dormir()
    * @param comida {String} - comida introducida por usuario
    * @param sc {Scanner} - para leer prompt usuario
    */
    public static void preguntona(String comida, Scanner sc){
        while(!comida.equals("cacahuetes")){
            System.out.println("CACATUA CACAHUETES!");
            System.out.println("que le das de comer a la cacatua?");
            comida = sc.nextLine();
        }

        aDormir();

    }

    /**
     * metodo a dormir, anuncia el sueño de la cacatua y se acaba el programa
     * @return {void} - no retorna nada! 
     */
    public static void aDormir(){
        System.out.println("La cacatuya dice ¡por fin! y después:");
        System.out.println("zzzzzzzzzzzzzzzz...");
    }

}

// esto para crear arxivos
//javadoc .\src\App.java

//esto para crear archivos dentro de carpeta nueva:
// javadoc -d docu .\src\App.java