import java.util.LinkedList;

public class MenuItem implements Hoja{
    protected String nombre;
    protected String descripcion;
    protected boolean esVeganos;
    protected Double precio;
    protected TipoProducto tipoSupermenu;
    protected int indice;

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
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.esVeganos = esVeganos;
    this.precio = precio;
    this.indice=indice;
    this.tipoSupermenu = tipoSupermenu;
    }

    @Override
    public String toString(){
        return "";
    }
    @Override
    public Hoja buscaHoja(int indiceHojaABuscar){
        return null;
    }
    @Override
    public LinkedList<Integer> rangoHojas(){
        LinkedList<Integer> rango = new LinkedList<>();
        rango.add(indice);
        rango.add(indice);
        return rango;
    }
    @Override
    public TipoProducto getTipoSupermenu(){
        return tipoSupermenu;
    }

}
