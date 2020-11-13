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
    public Adapter(){
        this.adapt=new Mercancia(1,"String nombre","String type",1,"String color","material");

    }

    /**
    *Metodo para obtener una descripción del Elemento.
    *@return regresa la descripción.
    */
    public String toString(){
        return this.adapt.leerEtiqueta();
    }

}
