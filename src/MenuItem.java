import java.util.LinkedList;

public class MenuItem implements Producto{
    protected String nombre;
    protected String descripcion;
    protected boolean esVeganos;
    protected Double precio;
    protected TipoProducto tipoSupermenu;
    protected int indice;


    public MenuItem(int indice){
        this.indice = indice;
    }
    /**
    *Constructor de la clase.
    *@param indice el indice del item.
    *@param nombre el nombre del item.
    *@param descripcion la descripcion del item.
    *@param esVeganos si es vegano o no el item.
    *@param precio el precio del item.
    *@param tipoSupermenu el tipo de item en em el Super menu.
    */
    public MenuItem(int indice,String nombre ,String descripcion ,boolean esVeganos ,Double precio ,TipoProducto tipoSupermenu){
    this.indice=indice;
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.esVeganos = esVeganos;
    this.precio = precio;
    this.tipoSupermenu = tipoSupermenu;
    }

    @Override
    public String toString(){
        return indice +" "+ nombre +" "+ descripcion +" "+ esVeganos +" "+ precio + "$" + " "+  tipoSupermenu;
        
    }

    @Override
    public TipoProducto getTipoSupermenu(){
        return tipoSupermenu;
    }

    public int getIndice(){return indice;}

    
}
