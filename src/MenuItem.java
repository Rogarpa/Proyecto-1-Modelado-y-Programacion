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

    @Override
    public String toString(){
        return "";
    }
<<<<<<< HEAD

    @Override
    public void buscaHoja(){
=======
    public Hoja buscaHoja(){
>>>>>>> 7a32041ca6ed9786223c4b11d64b1605bcd25cd4

    }

    @Override
    public LinkedList<Integer> rangoHojas(){
        return null;
    }

}
