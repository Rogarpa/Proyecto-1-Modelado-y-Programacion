import java.util.LinkedList;

public class Adapter implements Producto{

    private Mercancia adapt;
    private int indice;
    protected TipoProducto tipoSupermenu;

    @Override
    public TipoProducto getTipoSupermenu(){
        return tipoSupermenu;
    }

    /**
    *Constructor de la clase.
    */
    public Adapter(Mercancia adapt){
        this.adapt = adapt;

    }

    /**
    *Metodo para obtener una descripción del Elemento.
    *@return regresa la descripción.
    */
    public String toString(){
        return this.adapt.leerEtiqueta();
    }

    public int getIndice(){
        return indice;
    }
}
