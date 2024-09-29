
/**
 * Clase Elegante hereda de Zapatos y añade metodo especifico booleano.
 */
public class Elegantes extends Zapatos {
    
    private boolean tieneCordones; 

    /**
     * {inheritDoc}
     * 
     */
    public Elegantes(String marca, String modelo, double talla, double precio, boolean tieneCordones){
        super (marca, modelo, talla, precio);
        this.tieneCordones = tieneCordones;
    }

    public Elegantes() {
    }

    public boolean isTieneCordones() {
        return this.tieneCordones;
    }

    public boolean getTieneCordones() {
        return this.tieneCordones;
    }

    public void setTieneCordones(boolean tieneCordones) {
        this.tieneCordones = tieneCordones;
    }

    @Override
    public String toString() {
        return "Marca: " + getMarca() + "; " +
            "Modelo: " + getModelo() + "; " +
            "Talla: " + getTalla() + "; " +
            "Precio: " + getPrecio() + "Tiene cordones?" + isTieneCordones();
    }

    /**
     * Se pide si tiene cordones o no:
     * @return{boolean} - Si la condicion es cierta, retorna Sí
     */
    public boolean tieneCordones() {
        return this.tieneCordones;
    }
}

