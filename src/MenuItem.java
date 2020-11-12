import java.util.LinkedList;

public class MenuItem implements Hoja{
    protected String nombre;
    protected String descripcion;
    protected boolean esVeganos;
    protected Double precio;
    protected TipoProducto tipoSupermenu;
    protected int indice;

    public MenuItem(String nombre ,String descripcion ,boolean esVeganos ,Double precio ,TipoProducto tipoSupermenu){
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.esVeganos = esVeganos;
    this.precio = precio;
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
