public class MenuItem implements Hoja{
    protected String nombre;
    protected String descripcion;
    protected boolean esVeganos;
    protected Double precio;
    protected TipoProducto tipoSupermenu;

    public MenuItem(String nombre ,String descripcion ,boolean esVeganos ,Double precio ,TipoProducto tipoSupermenu){
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.esVeganos = esVeganos;
    this.precio = precio;
    this.tipoSupermenu = tipoSupermenu;
    }
    
    public String toString(){
        return "";
    }
    public Hoja buscaHoja(){

    }
    public LinkedList<Integer> rangoHojas(){
        return null;
    }
    
}